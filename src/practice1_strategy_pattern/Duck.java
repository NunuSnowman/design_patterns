package practice1_strategy_pattern;

public abstract class Duck {
    // each duck has a reference to something that implements the FlyBehavior interface
    FlyBehavior flyBehavior;
    // each duck has a reference to something that implements the QuackBehavior interface
    QuackBehavior quackBehavior;

    public Duck(){

    }

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }
}
