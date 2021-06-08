package ex24;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramCheckerTest {

    @Test
    void isAnagram_returns_true_for_anagrams() {
        //given
        AnagramChecker ac = new AnagramChecker();
        //when
        boolean actual = ac.isAnagram("note", "note");
        boolean expected = true;
        //then
        assertEquals(actual, expected);
    }
    @Test
    void isAnagram_returns_false_for_nonanagrams(){
        //given
        AnagramChecker ac = new AnagramChecker();
        //when
        boolean actual = ac.isAnagram("note", "not");
        boolean expected = false;
        //then
        assertEquals(actual, expected);
    }
}