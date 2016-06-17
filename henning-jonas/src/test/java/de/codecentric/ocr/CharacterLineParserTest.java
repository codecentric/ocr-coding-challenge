package de.codecentric.ocr;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class CharacterLineParserTest {

    private String line1 = "    _ ";
    private String line2 = "  | _|";
    private String line3 = "  ||_ ";

    private LineParser lineParser;

    @Before
    public void setUp() throws Exception {
        lineParser = new LineParser();

    }

    @Test
    public void testLineParser() {
        List<String[]> result = lineParser.parse(line1, line2, line3);

        assertEquals(2, result.size());
        assertEquals("1", new CharacterParser().parse(result.get(0)));
        assertEquals("2", new CharacterParser().parse(result.get(1)));

    }
}
