package ex36;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ComputingStatisticsTest {

    @Test
    void average() {
        //given
        ComputingStatistics cs = new ComputingStatistics();
        List<String> numbers = new ArrayList<>();
        numbers.add("100");
        numbers.add("200");
        numbers.add("1000");
        numbers.add("300");
        //when
        double expected = cs.Average(numbers);
        double actual = 400.0;
        //then
        assertEquals(expected, actual);
    }

    @Test
    void minimum() {
        //given
        ComputingStatistics cs = new ComputingStatistics();
        List<String> numbers = new ArrayList<>();
        numbers.add("100");
        numbers.add("200");
        numbers.add("1000");
        numbers.add("300");
        //when
        double expected = cs.Minimum(numbers);
        double actual = 100;
        //then
        assertEquals(expected, actual);
    }

    @Test
    void maximum() {
        //given
        ComputingStatistics cs = new ComputingStatistics();
        List<String> numbers = new ArrayList<>();
        numbers.add("100");
        numbers.add("200");
        numbers.add("1000");
        numbers.add("300");
        //when
        double expected = 1000;
        double actual = cs.Maximum(numbers);
        //then
        assertEquals(expected, actual);
    }

    @Test
    void standardDeviation() {
        //given
        ComputingStatistics cs = new ComputingStatistics();
        List<String> numbers = new ArrayList<>();
        numbers.add("100");
        numbers.add("200");
        numbers.add("1000");
        numbers.add("300");
        //when
        double expected = cs.StandardDeviation(numbers);
        double actual = 353.5533905932738;
        //then
        assertEquals(expected, actual);
    }
}