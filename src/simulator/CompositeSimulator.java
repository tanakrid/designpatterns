package simulator;

import adaptor.GooseAdaptor;
import composite.Flock;
import decorator.TripleTab;
import ducks.DuckCall;
import ducks.MallardDuck;
import ducks.RedheadDuck;
import ducks.RubberDuck;
import factory.DuckFactory;
import factory.SimpleFactory;
import quack.Quackable;

public class CompositeSimulator extends Simulator {

    private DuckFactory factory;

    @Override
    public void setFactory(DuckFactory fac) {
        this.factory = fac;
    }

    @Override
    public void startSimulation() {

        Quackable redHeadDuck = factory.makeRedheadDuck();
        Quackable mallardDuck = factory.makeMallardDuck();
        Quackable rubbleDuck = factory.makeRubberDuck();
        Quackable duckCall = factory.makeDuckCall();
        Quackable goose = factory.makeGoose();
        Quackable pigeon = factory.makePigeon();

        Flock flock = new Flock();
        flock.add(new TripleTab(redHeadDuck));
        flock.add(mallardDuck);
        flock.add(rubbleDuck);
        flock.add(duckCall);
        flock.add(goose);
        flock.add(pigeon);

        flock.quack();
    }
}
