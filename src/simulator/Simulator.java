package simulator;

import factory.DuckFactory;
import factory.FullDecoratorFactory;
import quack.Quackable;

import static simulator.DuckSimulator.simulator;

public class Simulator {

    private DuckFactory factory;

    public void start(){
        this.startSimulation();
    }

    public void setFactory(DuckFactory fac){
        this.factory = fac;
    }

    public void startSimulation(){
        Quackable mallardDuck = factory.makeMallardDuck();
        Quackable rubberDuck = factory.makeRubberDuck();
        Quackable redheadDuck = factory.makeRedheadDuck();
        Quackable duckCall = factory.makeDuckCall();
        Quackable goose = factory.makeGoose();
        Quackable pigeon = factory.makePigeon();

        simulator(mallardDuck);
        simulator(rubberDuck);
        simulator(redheadDuck);
        simulator(duckCall);
        simulator(goose);
        simulator(pigeon);
    }
}
