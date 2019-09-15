package decorator;

import quack.Quackable;

public class TripleTab implements Quackable {

    private Quackable one;

    public TripleTab(Quackable one){
        this.one = one;
    }

    @Override
    public void quack() {
        System.out.println("This duck is master.");
        this.one.quack();
        this.one.quack();
        this.one.quack();
        System.out.println(".....");
    }
}
