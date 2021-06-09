package ex29;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HandlingBadInputTest {

    @Test
    void badInputsValidData() {
        //given
        HandlingBadInput hbi = new HandlingBadInput();
        //when
        int actual = hbi.Years("12");
        int expected = 6;
        //then
        assertEquals(expected, actual);
    }


}