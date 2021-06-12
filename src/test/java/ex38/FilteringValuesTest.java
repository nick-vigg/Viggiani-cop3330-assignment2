package ex38;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FilteringValuesTest {

    @Test
    void filterEvenNumbersTest() {
        //given
        FilteringValues fv = new FilteringValues();
        //when
        List<Character> expected = new ArrayList<>();
        expected.add('2');
        expected.add('4');
        List<Character> actual = fv.filterEvenNumbers(fv.stringToArray("1 2 3 4"));
        //then
        assertEquals(expected, actual);
    }
}