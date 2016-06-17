package de.codecentric.ocr;

import java.util.ArrayList;
import java.util.List;

public class LineParser {

    public List<String[]> parse(String line1, String line2, String line3) {
        List<String[]> result = new ArrayList<>();
        int chars = line1.length() / 3;

        for (int i = 0; i < chars; i++) {
            int pos = i * 3;
            result.add(new String[]{
                    line1.substring(pos, pos + 3),
                    line2.substring(pos, pos + 3),
                    line3.substring(pos, pos + 3)
            });
        }

        return result;
    }
}
