package ex26;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardDebtTest {

    @Test
    void creditCardDebtTesterPaymentCalc() {
        //given
        PaymentCalculator pc = new PaymentCalculator();
        //when
        int actual = pc.calculateMonthsUntilPaidOff(5000, .12, 100);
        int expected = 70;
        //then
        assertEquals(expected, actual);
    }
}