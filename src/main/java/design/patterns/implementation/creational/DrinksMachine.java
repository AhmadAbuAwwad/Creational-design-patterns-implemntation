package design.patterns.implementation.creational;

public class DrinksMachine implements VendingMachine{
    String drinkName;
    double price;
    public DrinksMachine(String productName, int price) {
        this.drinkName = productName;
        this.price = price;
    }

    public DrinksMachine(DrinksMachine snackMachine) {
        if (snackMachine != null) {
                this.drinkName = snackMachine.drinkName;
                this.price = snackMachine.price;
            }
    }

    @Override
    public String toString() {
        return "DrinksMachine{" +
                "drinkName='" + drinkName + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public VendingMachine clone() {
        return new DrinksMachine(this);
    }
}
