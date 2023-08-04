package practice2;

import static practice2.Mathx.*;
public class FibonacciTest {

    public static void baseCase() {
        if(fibonacci(0) == 0 && fibonacci(1) == 1)
            return;
                System.exit(1);   
    }
    public static void testRecursionCase() {

        int[][] answers = {{5,5}, {6, 8}, {9,34}};
        for(int[] answer:answers)
            if (answer[1] != fibonacci(answer [0]))
                    System.exit(1);
                return;

        // in[] answers = {0, 1, 1, 2 ,3, 5};
        // for (int index = 0; index < answers.length; index++) {
        //     int answer = answers[index];
        //     int result = fibonacci(index);
        //     if (answer == result) {
        //         System.exit(1);
        //     }
        //     else {
        //         System.out.println("err");
        //     }
        // }
    }
    public static void preCondition() {//음수인지 검사
        try {
            fibonacci(-1);

        } 
        catch (IllegalArgumentException e) { 
            // TODO: handle exception
            return;
        }
        System.exit(1);
    }
    public static void PostCondition() { //리턴값 검사
        try{
            for(int n = 0; n < 100; n++)
            fibonacci(n);
        }
        catch(StackOverflowError e) {
            return;
        }
        System.out.println("fibonacci: n is factorail");
        System.exit(1);
    }
    public static void Testfibo() {
        Mathx.printFibonacci(7);
    }

}
