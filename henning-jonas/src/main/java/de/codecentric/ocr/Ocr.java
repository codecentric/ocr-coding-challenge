package de.codecentric.ocr;

import org.apache.commons.lang3.StringUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Ocr {

    public List<String> readAccountNumbers() {
        List<String> result = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(this.getClass().getResourceAsStream("OCR-InvalidRecognition.txt")));

        final LineParser lineParser = new LineParser();
        final CharacterParser characterParser = new CharacterParser();
        List<String> lines = new ArrayList<>();
        final StringBuilder sb = new StringBuilder();

        reader.lines().forEach(s -> {
            if (StringUtils.isBlank(s)) {
                if (sb.length() > 0) {
                    result.add(sb.toString());
                }
                sb.delete(0, sb.length());
                lines.clear();
                return;
            }
            lines.add(s);

            if (lines.size() == 3) {
                List<String[]> characters = lineParser.parse(lines.get(0), lines.get(1), lines.get(2));
                for (String[] character : characters) {
                    sb.append(characterParser.parse(character));
                }
            }
        });


        return result;
    }

    public static void main(String[] args) {
        NumberValidator validator = new NumberValidator();
        List<String> strings = new Ocr().readAccountNumbers();
        for (String s : strings) {
            if (isIllegal(s)) {
                System.out.println(s + " ILL");
            } else if (validator.isValid(s)) {
                System.out.println(s);
            } else {
                System.out.println(s + " ERR");
            }
        }
    }

    private static boolean isIllegal(String number) {
        return number.contains("?");
    }

}
