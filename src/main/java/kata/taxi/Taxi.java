package kata.taxi;


public class Taxi {

    public static final int LONG_DISTANCE = 8;
    public static final int START_PRICE_DISTANCE = 2;
    public static final float NORMAL_DISTANCE_RATE = 0.8f;
    public static final float LONG_DISTANCE_RATE = NORMAL_DISTANCE_RATE * 1.5f;
    public static final float INITIAL_PRICE = 6.0f;
    public static final float TIME_RATE = 0.25f;

    float calculate(int distance, int waitMinutes) {
        if (distance > LONG_DISTANCE) {
            return (distance - LONG_DISTANCE) * LONG_DISTANCE_RATE
                    + calculate(LONG_DISTANCE, waitMinutes);
        }
        if (distance > START_PRICE_DISTANCE) {
            return (distance - START_PRICE_DISTANCE) * NORMAL_DISTANCE_RATE
                    + calculate(START_PRICE_DISTANCE, waitMinutes);
        }
        return INITIAL_PRICE + TIME_RATE * waitMinutes;
    }

    public float calculate(int distance) {
        return calculate(distance, 0);
    }
}
