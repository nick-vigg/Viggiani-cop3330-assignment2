package ex27;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidatingInputsTest {

    @Test
    void validateFirstNameTrue() {
        //given
        ValidatingInputs vi = new ValidatingInputs();
        //when
        boolean actual = vi.validateFirstName("Jeff");
        boolean expected = true;
        //then
        assertEquals(expected, actual);
    }
    @Test
    void validateFirstNameFalse() {
        //given
        ValidatingInputs vi = new ValidatingInputs();
        //when
        boolean actual = vi.validateFirstName("a");
        boolean expected = false;
        //then
        assertEquals(expected, actual);
    }
    @Test
    void validateFirsttNameEmpty() {
        //given
        ValidatingInputs vi = new ValidatingInputs();
        //when
        boolean actual = vi.validateFirstName("");
        boolean expected = false;
        //then
        assertEquals(expected, actual);
    }

    @Test
    void validateLastNameTrue() {
        //given
        ValidatingInputs vi = new ValidatingInputs();
        //when
        boolean actual = vi.validateLastName("Dunham");
        boolean expected = true;
        //then
        assertEquals(expected, actual);
    }
    @Test
    void validateLastNameFalse() {
        //given
        ValidatingInputs vi = new ValidatingInputs();
        //when
        boolean actual = vi.validateLastName("a");
        boolean expected = false;
        //then
        assertEquals(expected, actual);
    }
    @Test
    void validateLastNameEmpty() {
        //given
        ValidatingInputs vi = new ValidatingInputs();
        //when
        boolean actual = vi.validateLastName("");
        boolean expected = false;
        //then
        assertEquals(expected, actual);
    }

    @Test
    void validateEmployeeZIPTrue() {
        //given
        ValidatingInputs vi = new ValidatingInputs();
        //when
        boolean actual = vi.validateEmployeeZIP("2332");
        boolean expected = true;
        assertEquals(expected, actual);
    }
    @Test
    void validateEmployeeZIPFalse() {
        //given
        ValidatingInputs vi = new ValidatingInputs();
        //when
        boolean actual = vi.validateEmployeeZIP("abc");
        boolean expected = false;
        assertEquals(expected, actual);
    }
    @Test
    void validateEmployeeZIPEmpty() {
        //given
        ValidatingInputs vi = new ValidatingInputs();
        //when
        boolean actual = vi.validateEmployeeID("");
        boolean expected = false;
        //then
        assertEquals(expected, actual);
    }

    @Test
    void validateEmployeeIDTrue() {
        //given
        ValidatingInputs vi = new ValidatingInputs();
        //when
        boolean actual = vi.validateEmployeeID("AS-1337");
        boolean expected = true;
        //then
        assertEquals(expected, actual);
    }
    @Test
    void validateEmployeeIDFalse() {
        //given
        ValidatingInputs vi = new ValidatingInputs();
        //when
        boolean actual = vi.validateEmployeeID("blah");
        boolean expected = false;
        //then
        assertEquals(expected, actual);
    }
    @Test
    void validateEmployeeIDEmpty() {
        //given
        ValidatingInputs vi = new ValidatingInputs();
        //when
        boolean actual = vi.validateEmployeeID("");
        boolean expected = false;
        //then
        assertEquals(expected, actual);
    }

    @Test
    void validateInputTrue() {
        //given
        ValidatingInputs vi = new ValidatingInputs();
        //when
        boolean actual = vi.validateInput("John", "Bucks", "1337", "JB-1337");
        boolean expected = true;
        //then
        assertEquals(expected, actual);
    }
    @Test
    void validateInputFalse() {
        //given
        ValidatingInputs vi = new ValidatingInputs();
        //when
        boolean actual = vi.validateInput("a", "b", "13c37", "JB01337");
        boolean expected = false;
        //then
        assertEquals(expected, actual);
    }

    @Test
    void main() {
    }
}