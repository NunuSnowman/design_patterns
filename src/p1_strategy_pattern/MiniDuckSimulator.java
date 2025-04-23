package p1_strategy_pattern;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        // to change a duck's behavior at runtime, just call the duck's setter method for that behavior.
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
