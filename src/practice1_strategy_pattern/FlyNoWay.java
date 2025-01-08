package practice1_strategy_pattern;

public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly(){
        // do nothing - cant's fly
        System.out.println("I can't fly!");
    }
}
