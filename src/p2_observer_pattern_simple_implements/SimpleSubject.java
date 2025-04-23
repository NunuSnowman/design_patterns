package p2_observer_pattern_simple_implements;

import java.util.ArrayList;
import java.util.List;

public class SimpleSubject implements Subject{
    private List<Observer> observers;
    private int value = 0;

    public SimpleSubject() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removerObserver(Observer o) {
       observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer : observers) {
            observer.update(value);
        }
    }

    public void setValue(int value) {
        this.value = value;
        notifyObserver();
    }
}
