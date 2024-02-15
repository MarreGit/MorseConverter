import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMorse {
    @Test
    public void testMorse1() {
        Converter converter = new Converter();
        String testData = "E";
        String expected = "*";
        String actual = converter.getMorse(testData);
        assertEquals(expected, actual);
    }

    @Test
    public void testMorse2() {
        Converter converter = new Converter();
        String testData = "A";
        String expected = "*-";
        String actual = converter.getMorse(testData);
        assertEquals(expected, actual);
    }

    @Test
    public void testEng1() {
        Converter converter = new Converter();
        String testData = "*-";
        String expected = "A";
        String actual = converter.getEng(testData);
        assertEquals(expected, actual);
    }
    @Test
    public void testEng2() {
        Converter converter = new Converter();
        String testData = "-***";
        String expected = "B";
        String actual = converter.getEng(testData);
        assertEquals(expected, actual);
    }
}
