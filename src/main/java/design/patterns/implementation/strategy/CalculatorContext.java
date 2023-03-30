package design.patterns.implementation.strategy;

public class CalculatorContext {

    private OperationStrategy strategy;

    public CalculatorContext(OperationStrategy strategy){
        this.strategy = strategy;
    }

    public void compute(){
        this.strategy.compute();
    }
}
