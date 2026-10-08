package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void reverse_shouldReversString_ifContainsString() {
        String result = Main.check("J@va the be$t!123");
        Assertions.assertEquals("t@eb eht av$J!123", result);
    }

    @Test
    public void reverse_shouldReturnEmptyString_ifEmptyString() {
        String result = Main.check("");
        Assertions.assertEquals("", result);
    }

    @Test
    public void notReverse_shouldReturnAString_ifAString() {
        String result = Main.check("a");
        Assertions.assertEquals("a", result);
    }

    @Test
    public void notReverse_shouldReturnThisStringNotReverse_ifStringNotLetter() {
        String result = Main.check("123 !@#");
        Assertions.assertEquals("123 !@#", result);
    }

    @Test
    public void notReverse_shouldReturnOnlyLetter_ifStringOnlyLetter() {
        String result = Main.check("abcde");
        Assertions.assertEquals("edcba", result);
    }

    @Test
    public void reverse_shouldReversOnlyLetters_ifNotLettersAlongTheEdges() {
        String result = Main.check("123 qwerst !@#");
        Assertions.assertEquals("123 tsrewq !@#", result);
    }

    @Test
    public void reverse_shouldReversUpperCase_ifApperCase() {
        String result = Main.check("ABsef332EF");
        Assertions.assertEquals("FEfes332BA", result);
    }

    @Test
    public void reverse_shouldExceptValueError_ifStringIsNull() {
        assertNull(Main.check(null));
    }





}
