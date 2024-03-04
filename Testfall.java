package MorseCodeTranslator;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;




public class Testfall {
    @Test
    public void TestEnglishToMorse() {

        Method L = new Method();
        String expected = ".-";
        String actual = L.convertEnglishToMorse('A');
        assertEquals(expected, actual);
    }

    @Test
    public void TestMorseToEnglish() {
        Method L = new Method();
        char expected = 'A';
        char actual = L.convertMorseToEnglish(".-");
        assertEquals(expected, actual);


    }

    @Test
    public void TestSpecialtecken() {
        Method L = new Method();
        String expected = "..--..";
        String actual = L.convertEnglishToMorse('?');
        assertEquals(expected, actual);
    }



    }
