package design.patterns.implementation;

import design.patterns.implementation.creational.MachineStarter;
import design.patterns.implementation.creational.VendingMachine;
import design.patterns.implementation.strategy.*;

public class Driver {
    public static void main(String args[]){
        VendingMachine snackMachine = MachineStarter.snackMachineStarter();
        VendingMachine snackMachineClone = snackMachine.clone();

        VendingMachine drinkMachine = MachineStarter.drinksMachineStarter();
        VendingMachine drinkMachineClone = drinkMachine.clone();

        System.out.println(snackMachineClone.toString());
        System.out.println(drinkMachineClone.toString());


        CalculatorContext calculatorContext = new CalculatorContext(new PlusOperation(10, 5));
        calculatorContext.compute();

        calculatorContext = new CalculatorContext(new MinusOperation(10, 5));
        calculatorContext.compute();

        calculatorContext = new CalculatorContext(new MulOperation(10, 5));
        calculatorContext.compute();

        calculatorContext = new CalculatorContext(new DivOperation(10, 5));
        calculatorContext.compute();

    }
}
