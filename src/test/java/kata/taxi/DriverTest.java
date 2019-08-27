package kata.taxi;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DriverTest {

    public static final double DELTA = 0.0000001;

    @Test
    public void should_charge_8_when_money_is_7dot6() {
        assertEquals(8, new Driver().charge(7.6f), DELTA);
    }

    @Test
    public void should_charge_8_when_money_is_8dot4() {
        assertEquals(8, new Driver().charge(8.4f), DELTA);
    }

    @Test
    public void should_charge_8_when_money_is_8() {
        assertEquals(8, new Driver().charge(8.0f), DELTA);
    }
}