package practice2_observer_pattern;

/**
 * This display element shows the current measurements from the Weather Data object.
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        // display the current measurements
        System.out.println("Current conditions: " + temperature
                + "F degrees and " + humidity + " % humidity");
    }
}
