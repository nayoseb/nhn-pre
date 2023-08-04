package practice1;


public class MathxTest {  //name space
    public static void main(String[] args) {
        MathxTest.testRange();
        // // Heap - reference count
        // // double[] numbers = new double[args.length];  //reference count 1증가
        // // for (int index = 0; index < args.length; index++)
        // //     numbers[index] = Double.valueOf(args[index]);
        // System.out.println(Mathx.sum(numbers));
        System.out.println(Mathx.sum(new Range(10)));
        System.out.println(Mathx.sum(new Range(0, 10)));
        System.out.println(Mathx.sum(new Range(5, 10)));
        // // System.out.println(Mathx.sum(10) == Mathx.sum(1,2,3,6,7,8,9,10,5,4));
        // // System.out.println(Mathx.reduce(new BinaryOperation() {     //익명 클래스 Anonymous class
        // //     public double apply(double x, double y){return x + y;}
        // // },0,1,2,3,4));

        // BinaryOperation plus = new BinaryOperation() {
        //     public double apply(double x, double y){return x+y;}
        // };        // BinaryOperation plus = (x,y)->x+y;
        
        // System.out.println(Mathx.reduce(plus,0,1,2,3,4));      
        // System.out.println(Mathx.reduce((x,y)->x+y,0,1,2,3,4)); //람다표기

        // for(int index=0; index<numbers.length; index++)
        //     numbers[index]=Double.valueOf(args[index]);
        // System.out.println(Mathx.product(30, 10));
        // System.out.println(Mathx.product(numbers));
        // System.out.println(Mathx.product(4,5,6));
        // System.out.println(Mathx.product(3,4,5,6,123));
        // System.out.println(Mathx.reduceIf(x->x%2==0, (x,y) -> x*y,1,1,2,3,4,5,6));
    }

    private static void testRange() {
        // Range range;
        RangeTest.classInvariant();

        int lowerBound = -2;
        int upperBound = -6;

        try {
            Range range = new Range(lowerBound, upperBound);
        } catch (IllegalArgumentException e) {
            System.out.format("Range: lower bound %d가 upper bound %d보다 크쟎아!%n",
            lowerBound, upperBound);
        }
        System.out.println(lowerBound);
    }
}