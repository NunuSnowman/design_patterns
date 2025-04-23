package p2_observer_pattern_weather_implements;

/**
 * Calculate avg/max/min temperature
 */
public class StatisticsDisplay implements Observer, DisplayElement {
    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum = 0.0f;
    private int numReadings = 0;
    private WeatherData weatherdata;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherdata = weatherData;
        weatherdata.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        tempSum += temperature;
        numReadings++;
        if (temperature > maxTemp) {
            maxTemp = temperature;
        }
        if (minTemp > temperature) {
            minTemp = temperature;
        }
        display();
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
                + "/" + maxTemp + "/" + minTemp);
    }

}
