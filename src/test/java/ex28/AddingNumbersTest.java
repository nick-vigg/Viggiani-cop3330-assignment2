package ex28;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddingNumbersTest {
    @Test
    void addNumbersProperly(){
        //given
        AddingNumbers an = new AddingNumbers();
        //when
        String actual = an.Counter(5);
        String expected = "The total is " + 5;
        //then
        assertEquals(expected, actual);

    }

}