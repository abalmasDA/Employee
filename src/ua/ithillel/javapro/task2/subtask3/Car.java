package ua.ithillel.javapro.task2.subtask3;

public class Car {

    public void start() {
        startElectricity();
        startFuelSystem();
        startCommand();
        System.out.println("\n" + "Car started");
    }

    private void startElectricity() {
        System.out.println("Electricity started");

    }

    private void startFuelSystem() {
        System.out.println("Fuel system started");

    }

    private void startCommand() {
        System.out.println("Start command executed");

    }

}
