package de.codecentric.ocr;


public class ChecksumCalculator {

    public int calculateChecksum(String s) {
        int result = 0;
        for (int i = 9; i > 0; i--) {
            result += Integer.parseInt(s.charAt(9 - i) + "") * i;
        }
        return result;
    }
}
