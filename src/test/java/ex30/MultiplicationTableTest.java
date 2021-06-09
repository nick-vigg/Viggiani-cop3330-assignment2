package ex30;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplicationTableTest {
    @Test
    void MultiplicationTableTestResults(){
        //given
        MultiplicationTable mt = new MultiplicationTable();
        //when
        mt.Multiply(2, 2);
        //then
        assertEquals("   1   2\n" +
                "   2   4\n", mt.Multiply(2, 2));
    }

}