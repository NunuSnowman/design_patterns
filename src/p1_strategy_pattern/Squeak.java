package p1_strategy_pattern;

public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        // rubber duckies squeak
        System.out.println("Squeak");
    }
}
