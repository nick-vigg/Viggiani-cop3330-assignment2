package ex25;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordStrengthCheckTest {

    @Test
    void passwordStrengthTypeOne() {
        //given
        PasswordStrengthCheck psc = new PasswordStrengthCheck();
        //when
        int actual = psc.passwordStrength("12345");
        int expected = 1;
        //then
        assertEquals(actual, expected);
    }
    @Test
    void passwordStrengthTypeTwo(){
        //given
        PasswordStrengthCheck psc = new PasswordStrengthCheck();
        //when
        int actual = psc.passwordStrength("abcdef");
        int expected = 2;
        //then
        assertEquals(actual, expected);
    }
    @Test
    void passwordStrengthTypeThree(){
        //given
        PasswordStrengthCheck psc = new PasswordStrengthCheck();
        //when
        int actual = psc.passwordStrength("abc123xyz");
        int expected = 3;
        //then
        assertEquals(actual, expected);
    }
    @Test
    void passwordStrengthTypeFour(){
        //given
        PasswordStrengthCheck psc = new PasswordStrengthCheck();
        //when
        int actual = psc.passwordStrength("1337h@xor");
        int expected = 4;
        //then
        assertEquals(actual, expected);
    }
}