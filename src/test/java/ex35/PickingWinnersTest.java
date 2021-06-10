package ex35;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PickingWinnersTest {

    @Test
    void winner() {
        //Given
        PickingWinners pw = new PickingWinners();
        List<String> names = new ArrayList<>();
        names.add("Difo");
        names.add("Sif");
        //when
        String expected = String.format("The winner is... %s.", "Sif");
        String actual = pw.Winner(names);
        //then
        assertEquals(expected, actual);
    }
}