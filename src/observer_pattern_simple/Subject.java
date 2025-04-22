package observer_pattern_simple;

public interface Subject {
    public void registerObserver(Observer o);
    public void removerObserver(Observer o);
    public void notifyObserver();
}
