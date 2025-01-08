package practice2_observer_pattern;

public interface Subject {
    /**
     * Takes an Observer as an argument;
     * The Observer to be registered.
     *
     * @param o
     */
    public void registerObserver(Observer o);

    /**
     * Takes an Observer as an argument;
     * The Observer to be removed.
     *
     * @param o
     */
    public void removeObserver(Observer o);

    /**
     * This method is called to notify all observers when the Subject's state has changed.
     */
    public void notifyObservers();

}
