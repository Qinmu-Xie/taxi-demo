package kata.taxi;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TaxiTest {

    public static final double DELTA = 0.000001;
    private Taxi taxi;

    @Before
    public void setUp() throws Exception {
        taxi = new Taxi();
    }

    @Test
    public void should_be_6_when_0km() {
        assertEquals(6, taxi.calculate(0), DELTA);
    }

    @Test
    public void should_be_6_when_0_to_2km() {
        assertEquals(6, taxi.calculate(2, 0), DELTA);
    }

    @Test
    public void should_be_7dot6_when_4km() {
        assertEquals(7.6f, taxi.calculate(4), DELTA);
    }

    @Test
    public void should_be_12_when_9km() {
        assertEquals(12.0f, taxi.calculate(9, 0), DELTA);
    }

    @Test
    public void should_be_13_when_9km_and_wait_4_mins() {
        assertEquals(13.0f, taxi.calculate(9, 4), DELTA);
    }
}
