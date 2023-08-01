package practice;

@FunctionalInterface
public interface BinaryOperation {      //super타입  //interface조건기술
    public double apply(double x, double y);
}