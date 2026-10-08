package org.example;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;
public class MainTest {
    @Test
    public void shouldReversStringIfContainsString() {
        String result = Main.check("J@va the be$t!123");
        assertEquals("t@eb eht av$J!123", result);
    }
    @Test
    public void shouldReturnEmptyStringIfEmptyString() {
        String result = Main.check("");
        assertEquals("", result);
    }
    @Test
    public void notShouldReturnAStringIfAString() {
        String result = Main.check("a");
        assertEquals("a", result);
    }
    @Test
    public void notShouldReturnThisStringNotReverseIfStringNotLetter() {
        String result = Main.check("123 !@#");
        assertEquals("123 !@#", result);
    }
    @Test
    public void notShouldReturnOnlyLetterIfStringOnlyLetter() {
        String result = Main.check("abcde");
        assertEquals("edcba", result);
    }
    @Test
    public void shouldReversOnlyLettersIfNotLettersAlongTheEdges() {
        String result = Main.check("123 qwerst !@#");
        assertEquals("123 tsrewq !@#", result);
    }
    @Test
    public void shouldReversUpperCaseIfApperCase() {
        String result = Main.check("ABsef332EF");
        assertEquals("FEfes332BA", result);
    }
    @Test
    public void shouldExceptValueErrorIfStringIsNull() {
        assertNull(Main.check(null));
    }
}