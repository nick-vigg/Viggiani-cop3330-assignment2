package ex31;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KarvonenHeartRateTest {

    @Test
    void targetHeartRateTesterForFinalTableValue() {
        //given
        KarvonenHeartRate khr = new KarvonenHeartRate();
        //when
        int actual = khr.TargetHeartRate(22, 65);
        int expected = 191;
        //then
        assertEquals(expected, actual);

    }

}