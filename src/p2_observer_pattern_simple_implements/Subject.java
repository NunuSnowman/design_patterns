package p2_observer_pattern_simple_implements;

public interface Subject {
    public void registerObserver(Observer o);
    public void removerObserver(Observer o);
    public void notifyObserver();
}
