package de.codecentric.ocr;

public class NumberValidator {
    public boolean isValid(String s) {
        int checksum = new ChecksumCalculator().calculateChecksum(s);
        return checksum % 11 == 0;
    }
}
