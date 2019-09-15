package simulator;

import factory.CounterDecoratorFactory;
import factory.FullDecoratorFactory;
import factory.SimpleFactory;
import quack.Quackable;

public class DuckSimulator {
    public static void main(String arg[]){

        // this program has 3 simulator for report in different scenario that so can switch simulator
        // by change these object that assigned to simulator
        Simulator simulator = new CompositeSimulator();

        // setFactory will recipe factory 3 format
        simulator.setFactory(new SimpleFactory());
        
        simulator.start();
    }

    public static void simulator(Quackable duck) {
        duck.quack();
    }

}
