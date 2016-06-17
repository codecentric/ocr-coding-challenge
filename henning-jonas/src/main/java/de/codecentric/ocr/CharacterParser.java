package de.codecentric.ocr;

import org.apache.commons.lang3.StringUtils;

import javax.xml.stream.events.Characters;


public class CharacterParser {

    public String parse(String[] character) {
        if (isZero(character)) {
            return "0";
        }
        if (isOne(character)) {
            return "1";
        }
        if (isTwo(character)) {
            return "2";
        }
        if (isThree(character)) {
            return "3";
        }
        if (isFour(character)) {
            return "4";
        }
        if (isFive(character)) {
            return "5";
        }
        if (isSix(character)) {
            return "6";
        }
        if (isSeven(character)) {
            return "7";
        }
        if (isEight(character)) {
            return "8";
        }
        if (isNine(character)) {
            return "9";
        }

        return "?";
    }

    private boolean isZero(String[] character) {
        return lineEquals(character[0], " _ ") && lineEquals(character[1], "| |") && lineEquals(character[2], "|_|");
    }

    private boolean isNine(String[] character) {
        return lineEquals(character[0], " _ ") && lineEquals(character[1], "|_|") && lineEquals(character[2], " _|");
    }

    private boolean isEight(String[] character) {
        return lineEquals(character[0], " _ ") && lineEquals(character[1], "|_|") && lineEquals(character[2], "|_|");
    }

    private boolean isSeven(String[] character) {
        return lineEquals(character[0], " _ ") && lineEquals(character[1], "  |") && lineEquals(character[2], "  |");
    }

    private boolean isSix(String[] character) {
        return lineEquals(character[0], " _ ") && lineEquals(character[1], "|_ ") && lineEquals(character[2], "|_|");
    }

    private boolean isFive(String[] character) {
        return lineEquals(character[0], " _ ") && lineEquals(character[1], "|_ ") && lineEquals(character[2], " _|");
    }

    private boolean isFour(String[] character) {
        return lineEquals(character[0], "   ") && lineEquals(character[1], "|_|") && lineEquals(character[2], "  |");
    }

    private boolean isOne(String[] character) {
        return lineEquals(character[0], "   ") && lineEquals(character[1], "  |") && lineEquals(character[2], "  |");
    }

    private boolean isTwo(String[] character) {
        return lineEquals(character[0], " _ ") && lineEquals(character[1], " _|") && lineEquals(character[2], "|_ ");
    }

    private boolean isThree(String[] character) {
        return lineEquals(character[0], " _ ") && lineEquals(character[1], " _|") && lineEquals(character[2], " _|");
    }

    private boolean lineEquals(String line, String expected) {
        return line.equals(expected);
    }
}
