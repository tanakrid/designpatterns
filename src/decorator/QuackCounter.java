package decorator;

import quack.Quackable;

public class QuackCounter implements Quackable {

    private Quackable duck;

    public static int numQuack;
    public static int getNumQuack(){
        return numQuack;
    }

    public QuackCounter(Quackable duck){
        this.duck = duck;
    }

    @Override
    public void quack() {
        this.duck.quack();
        numQuack++;
    }
}
