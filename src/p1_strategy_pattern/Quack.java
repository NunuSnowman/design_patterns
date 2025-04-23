package p1_strategy_pattern;

public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        // implements duck quacking
        System.out.println("Quack");
    }
}
