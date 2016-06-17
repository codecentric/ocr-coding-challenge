package de.codecentric.ocr;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CharacterTest {


    private CharacterParser characterParser;

    @Before
    public void setUp() throws Exception {
        characterParser = new CharacterParser();
    }

    @Test
    public void test0() {
        assertEquals("0", characterParser.parse(Characters.char0));
    }

    @Test
    public void test1() {
        assertEquals("1", characterParser.parse(Characters.char1));
    }

    @Test
    public void test2() {
        assertEquals("2", characterParser.parse(Characters.char2));
    }

    @Test
    public void test3() {
        assertEquals("3", characterParser.parse(Characters.char3));
    }

    @Test
    public void test4() {
        assertEquals("4", characterParser.parse(Characters.char4));
    }

    @Test
    public void test5() {
        assertEquals("5", characterParser.parse(Characters.char5));
    }

    @Test
    public void test6() {
        assertEquals("6", characterParser.parse(Characters.char6));
    }

    @Test
    public void test7() {
        assertEquals("7", characterParser.parse(Characters.char7));
    }

    @Test
    public void test8() {
        assertEquals("8", characterParser.parse(Characters.char8));
    }

    @Test
    public void test9() {
        assertEquals("9", characterParser.parse(Characters.char9));
    }

    @Test
    public void testForRubbish() {
        String[] charBroken = new String[]{
                "   ", "   ", "   "
        };
        assertEquals("?", characterParser.parse(charBroken));
        String[] charBroken2 = new String[]{
                "_ |", "_|_", " | "
        };
        assertEquals("?", characterParser.parse(charBroken2));
    }
}
