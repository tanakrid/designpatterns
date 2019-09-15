package simulator;

import decorator.QuackCounter;

public class SimulatorReportCounting extends Simulator {
    @Override
    public void start() {
        super.start();
        reportCount();
    }

    public void reportCount(){
        System.out.println("Quack is "+QuackCounter.getNumQuack()+" times");
    }
}
