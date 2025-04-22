package practice2_observer_pattern;

/**
 * This display element shows the current measurements from the Weather Data object.
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    /**
     * The constructor is passed the weatherData object (the Subject)
     * and we use it to register the display of an observer
     * @param weatherData
     */
    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    /**
     * When update is called, we save the temp and humidity and call display()
     * @param temp
     * @param humidity
     * @param pressure
     */
    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    /**
     * The display just prints out the most recent temp and humidity
     */
    @Override
    public void display() {
        // display the current measurements
        System.out.println("Current conditions: " + temperature
                + "F degrees and " + humidity + " % humidity");
    }
}
