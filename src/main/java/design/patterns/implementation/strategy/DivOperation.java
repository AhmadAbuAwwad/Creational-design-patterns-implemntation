package design.patterns.implementation.strategy;

public final class DivOperation extends AbstractOperationStrategy{

    public DivOperation(int a, int b){
        super(a, b);
    }

    @Override
    public void compute() {
        System.out.println(getA() - getB());
    }
}
