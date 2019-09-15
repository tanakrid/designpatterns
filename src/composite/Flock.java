package composite;

import quack.Quackable;

import java.util.ArrayList;
import java.util.List;

public class Flock implements Quackable {

    private List<Quackable> flock = new ArrayList<>();

    @Override
    public void quack() {
        for (Quackable one:flock
             ) {
            one.quack();
        }
    }

    public void add(Quackable one){
        flock.add(one);
    }
}
