package decorator;

import quack.Quackable;

public class EchoCall implements Quackable {

    private Quackable duck;

    public EchoCall(Quackable duck){
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack();
        System.out.print("Echo: ");
        duck.quack();
    }
}
