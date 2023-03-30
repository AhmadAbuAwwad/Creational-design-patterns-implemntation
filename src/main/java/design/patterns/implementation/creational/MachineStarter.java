package design.patterns.implementation.creational;

public class MachineStarter {
    public static VendingMachine snackMachineStarter() {

        SnackMachine snackMachine = new SnackMachine("Ban", 50);

        return snackMachine;
    }

    public static VendingMachine drinksMachineStarter() {

        VendingMachine snackMachine = new DrinksMachine("Water", 12);

        return snackMachine;
    }
}
