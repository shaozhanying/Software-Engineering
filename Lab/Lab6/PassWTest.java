import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class PassWTest {
    @Test
    public void testValidStrings() {
        PassW a=new PassW("abc123");
        assertTrue(PassW.isValid(a.getPass()), "Should return true for valid string 'Abc123'");
        assertTrue(PassW.isValid("123Ab"), "Should return true for valid string '123Ab'");
    }

    @Test
    public void testInvalidLength() {
        assertFalse(PassW.isValid("Ab12"), "Should return false for too short string 'Ab12'");
        assertFalse(PassW.isValid("1234567890"), "Should return false for too long string '1234567890'");
    }

    @Test
    public void testInvalidCharacters() {
        assertFalse(PassW.isValid("Abc#123"), "Should return false for string with invalid characters 'Abc#123'");
    }

    @Test
    public void testMissingLetters() {
        assertFalse(PassW.isValid("12345"), "Should return false for string without letters '12345'");
    }

    @Test
    public void testMissingDigits() {
        assertFalse(PassW.isValid("ABCDE"), "Should return false for string without digits 'ABCDE'");
    }
}