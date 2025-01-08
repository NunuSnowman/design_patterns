package practice2_observer_pattern;

/**
 * All our weather components implement the Observer interface.
 * This gives the Subject a common interface to talk to when it comes time to update the observers.
 */
public interface Observer {
    /**
     * These are the state values the Observer get from the Subject when a weather measurement changes.
     * @param temp
     * @param humidity
     * @param pressure
     */
    public void update(float temp, float humidity, float pressure);
}
