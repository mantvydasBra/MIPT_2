package com.example.mipt_2;

import org.junit.Test;

import static org.junit.Assert.*;

import com.example.mipt_2.utils.TextCounter;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void Test01GetWordsCount() {
        String inputString = "Labas, mano vardas Mantvydas";
        int expectedValue = 4;
        int actualValue = TextCounter.getWordsCount(inputString);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void Test02GetWordsCount() {
        // Null pointer exception
        // Reiktu pataisyti koda, kad tikrintu ar perduodamas tesktas nera null
        String inputString = null;
        int expectedValue = 0;
        int actualValue = TextCounter.getWordsCount(inputString);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void Test03GetWordsCount() {
        String inputString = "Labas,;!           amano./ vardas Mantvydas?sdasd 213123;;p912397128399as!@_#)($&)!_+.2";
        int expectedValue = 8;
        int actualValue = TextCounter.getWordsCount(inputString);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void Test03GetPuncCount() {
        String inputString = "Labas, mano vardas Mantvydas";
        int expectedValue = 1;
        int actualValue = TextCounter.getPuncCount(inputString);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void Test04GetPuncCount() {
        String inputString = "Labas,;! mano./ vardas Mantvydas?";
        int expectedValue = 6;
        int actualValue = TextCounter.getPuncCount(inputString);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void Test05GetPuncCount() {
        // Null pointer exception
        // Reiktu pataisyti koda, kad tikrintu ar perduodamas tesktas nera null
        String inputString = null;
        int expectedValue = 0;
        int actualValue = TextCounter.getPuncCount(inputString);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void Test06GetPuncCount() {
        // Null pointer exception
        // Reiktu pataisyti koda, kad tikrintu ar perduodamas tesktas nera null
        String inputString = "012123!!#@#ASDZC.,l';./.;123////a;.dasd'23123";
        int expectedValue = 20;
        int actualValue = TextCounter.getPuncCount(inputString);
        assertEquals(expectedValue, actualValue);
    }
}