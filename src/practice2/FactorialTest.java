package practice2;

import static practice2.Mathx.*;
public class FactorialTest {

    public static void bascCase() {
        if(factorial(0) != 1 && factorial(1) != 1)
            return;
        System.exit(1);
    }
    
    public static void testCase() {

        int[][] answers = {{0,1},{1,1},{2,2},{3,6},{4,24}};
        for(int[] answer:answers)
            if (answer[1] != factorial(answer[0]))
                    System.exit(1);
        return;

    }

    public static void preCondition() {
        try {
            factorial(-1);

        } 
        catch (IllegalArgumentException e) { 
            // TODO: handle exception
            return;
        }
        System.exit(1);

    }

    public static void PostCondition() {
        try {
            factorial(100);
        } catch (ArithmeticException e) {
            // TODO: handle exception
            System.out.println("factoial: arithmetic overflow");
            return;
        }
        catch(StackOverflowError e) {
            System.out.println("factoial: n is too big");
            // System.exit(1);
        }

    }


    
}
