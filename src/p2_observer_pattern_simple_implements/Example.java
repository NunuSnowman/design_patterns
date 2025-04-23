package p2_observer_pattern_simple_implements;

public class Example {
    public static void main(String[] args) {
        SimpleSubject simpleSubject = new SimpleSubject();
        SimpleObserver simpleObserver = new SimpleObserver(simpleSubject);
        simpleSubject.setValue(100);
        simpleSubject.removerObserver(simpleObserver);
    }
}
