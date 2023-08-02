package practice1;


public final class Multiply implements BinaryOperation{  //sub타입

    @Override
    public double apply(double x, double y) {
        return x*y;
    }
}