package de.codecentric.ocr;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChecksumCalculatorTest {

    @Test
    public void testCalculateChecksum() {
        assertEquals(251, new ChecksumCalculator().calculateChecksum("685366535"));
    }
}
