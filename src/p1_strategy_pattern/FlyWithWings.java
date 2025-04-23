package p1_strategy_pattern;

public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        // implements duck flying
        System.out.println("I'm flying!");
    }
}
