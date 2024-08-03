package core.basesyntax.model;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("Excavator is doing its work.");
    }

    @Override
    public void stopWork() {
        System.out.println("Excavator has stopped working.");
    }
}
