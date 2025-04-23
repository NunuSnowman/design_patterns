package p1_strategy_pattern;

public class MallardDuck extends Duck{
    /**
     * since the quackBehavior instance variable is an interface type,
     * we could (through the magic of polymorphism) dynamically assign
     * a different QuackBehavior implementation class at runtime.
     *
     * while we are setting the behaviors to concrete classes (by instantiating
     * a behavior class like Quack or FlyWithWings and assigning it to our behavior reference
     * variable), we could easily change that at runtime.
     */
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I's a real Mallard duck");
    }
}
