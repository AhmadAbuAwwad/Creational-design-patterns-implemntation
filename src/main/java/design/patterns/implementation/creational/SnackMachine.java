package design.patterns.implementation.creational;

public class SnackMachine implements VendingMachine{
    String productName;
    double price;
    public SnackMachine(String productName, int price) {
        this.productName = productName;
        this.price = price;
    }

    public SnackMachine(SnackMachine snackMachine) {
        if (snackMachine != null) {
                this.productName = snackMachine.productName;
                this.price = snackMachine.price;
            }
    }

    @Override
    public String toString() {
        return "SnackMachine{" +
                "productName='" + productName + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public VendingMachine clone() {
        return new SnackMachine(this);
    }
}
