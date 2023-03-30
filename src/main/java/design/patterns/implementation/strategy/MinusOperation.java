package design.patterns.implementation.strategy;

public final class MinusOperation extends AbstractOperationStrategy{

    public MinusOperation(int a, int b){
        super(a, b);
    }

    @Override
    public void compute() {
        System.out.println(getA() - getB());
    }
}
