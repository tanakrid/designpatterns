package factory;

import decorator.EchoCall;
import decorator.QuackCounter;
import quack.Quackable;

public class FullDecoratorFactory extends DuckFactory{
    @Override
    public Quackable makeMallardDuck() {
        return new EchoCall(new QuackCounter(super.makeMallardDuck()));
    }

    @Override
    public Quackable makeDuckCall() {
        return new EchoCall(super.makeDuckCall());
    }

    @Override
    public Quackable makeGoose() {
        return new EchoCall(super.makeGoose());
    }

    @Override
    public Quackable makePigeon() {
        return new EchoCall(super.makePigeon());
    }

    @Override
    public Quackable makeRedheadDuck() {
        return new EchoCall(new QuackCounter(super.makeRedheadDuck()));
    }

    @Override
    public Quackable makeRubberDuck() {
        return new EchoCall(new QuackCounter(super.makeRubberDuck()));
    }
}
