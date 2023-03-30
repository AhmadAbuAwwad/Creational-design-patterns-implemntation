package design.patterns.implementation.strategy;

public final class MulOperation extends AbstractOperationStrategy{

    public MulOperation(int a, int b){
        super(a, b);
    }

    @Override
    public void compute() {
        System.out.println(getA() - getB());
    }
}
