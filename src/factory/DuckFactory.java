package factory;

import adaptor.GooseAdaptor;
import decorator.DoubleTab;
import ducks.*;
import quack.Quackable;

public class DuckFactory {
    public Quackable makeMallardDuck(){
        return new MallardDuck();
    }

    public Quackable makeDuckCall(){
        return new DuckCall();
    }

    public Quackable makeGoose(){
        return new GooseAdaptor(new Goose());
    }

    public Quackable makePigeon(){
        return new DoubleTab(new Pigeon());
    }

    public Quackable makeRedheadDuck(){
        return new RedheadDuck();
    }

    public Quackable makeRubberDuck(){
        return new RubberDuck();
    }
}
