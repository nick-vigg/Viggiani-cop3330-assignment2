package ex33;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Magic8BallTest {

    @Test
    void answerYes() {
        //given
        Magic8Ball ball = new Magic8Ball();
        List<String> values = Arrays.asList("Yes", "No", "Maybe", "Ask again later.");
        //when
        String actual = (String) ball.Answer(values, 1);
        String expected = "Yes";
        //then
        assertEquals(expected, actual);
    }
    @Test
    void answerNo() {
        //given
        Magic8Ball ball = new Magic8Ball();
        List<String> values = Arrays.asList("Yes", "No", "Maybe", "Ask again later.");
        //when
        String actual = (String) ball.Answer(values, 2);
        String expected = "No";
        //then
        assertEquals(expected, actual);
    }
    @Test
    void answerMaybe() {
        //given
        Magic8Ball ball = new Magic8Ball();
        List<String> values = Arrays.asList("Yes", "No", "Maybe", "Ask again later.");
        //when
        String actual = (String) ball.Answer(values, 3);
        String expected = "Maybe";
        //then
        assertEquals(expected, actual);
    }
    @Test
    void answerAskAgainLater() {
        //given
        Magic8Ball ball = new Magic8Ball();
        List<String> values = Arrays.asList("Yes", "No", "Maybe", "Ask again later.");
        //when
        String actual = (String) ball.Answer(values, 4);
        String expected = "Ask again later.";
        //then
        assertEquals(expected, actual);
    }
}