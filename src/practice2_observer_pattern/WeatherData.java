package practice2_observer_pattern;

import java.util.ArrayList;

/**
 * WeatherData now implements the Subject interface.
 */
public class WeatherData implements Subject {
    // An ArrayList to hold the Observers
    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;

    // WeatherData Constructor
    public WeatherData() {
        observers = new ArrayList();
    }

    /**
     * When an observer registers, we just add it to the end of the list
     * @param o
     */
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    /**
     * When an observer wants to unregister, we just taoke it off the list
     * @param o
     */
    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    /**
     * Tell all the observers about the state
     * All observers implement update()
     */
    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }

    public float getTemperature() {
        return this.temperature;
    }

    public float getHumidity() {
        return this.humidity;
    }

    public float getPressure() {
        return this.pressure;
    }

    /**
     * Notify the Observers when we get updated measurements from the Weather Station
     */
    public void measurementsChanged() {
        notifyObservers();
    }

    /**
     * Manually test the display elements
     * @param temperature
     * @param humidity
     * @param pressure
     */
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
