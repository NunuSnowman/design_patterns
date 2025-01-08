package practice2_observer_pattern;

/**
 * This one keeps track of the min/avg/max measurements and displays them.
 */
public class StatisticsDisplay implements Observer, DisplayElement{
    @Override
    public void display() {
    // display the avg, min, and max measurements
    }


    @Override
    public void update(float temp, float humidity, float pressure) {

    }
}
