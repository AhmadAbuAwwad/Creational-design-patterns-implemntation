package design.patterns.implementation.strategy;

public final class PlusOperation extends AbstractOperationStrategy {


    public PlusOperation(int a, int b){
        super(a, b);
    }

    @Override
    public void compute() {
        System.out.println(getA() + getB());
    }
}
