package practice2_observer_pattern;

/**
 * This display shows the weather forecast based on the barometer.
 */
public class ForecastDisplay implements Observer, DisplayElement {
    @Override
    public void display() {
        // display the forecast
    }

    @Override
    public void update(float temp, float humidity, float pressure) {

    }
}
