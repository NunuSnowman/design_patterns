package p2_observer_pattern_weather_implements;

public class ForecastDisplay implements Observer, DisplayElement{
    private float currentPressure = 29.92f;
    private float lastPressure;
    private WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("Forecast: ");
        if(lastPressure > currentPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        } else if(lastPressure == currentPressure) {
            System.out.println("More of the same");
        } else {
            System.out.println("Improving weather on the way!");
        }
    }
}
