package simulator;

import adaptor.GooseAdaptor;
import decorator.DoubleTab;
import decorator.EchoCall;
import decorator.QuackCounter;
import ducks.*;
import quack.Quackable;

public class DuckSimulator {
    public static void main(String arg[]){
        Quackable mallardDuck = new QuackCounter(new EchoCall(new MallardDuck()));
        Quackable rubberDuck = new QuackCounter(new EchoCall(new RubberDuck()));
        Quackable redheadDuck = new QuackCounter(new EchoCall(new RedheadDuck()));
        DuckCall duckCall = new DuckCall();

        simulator(mallardDuck);
        simulator(rubberDuck);
        simulator(redheadDuck);
        simulator(duckCall);
        simulator(new GooseAdaptor(new Goose()));
        simulator(new DoubleTab(new Pigeon()));

        System.out.println("Quack is "+QuackCounter.getNumQuack()+" times");
    }

    private static void simulator(Quackable duck) {
        duck.quack();
    }

}
