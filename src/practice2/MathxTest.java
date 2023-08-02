package practice2;

import java.security.PublicKey;

public class MathxTest {
    private MathxTest() {
        
    } //default constructor
    //main은 OS에서 실행
    public static void main(String[] args) {
        MathxTest.fibonacciTest();
        // MathxTest.factorialTest();
        
    }
    private static void factorialTest() {
        FactorialTest.bascCase();
        FactorialTest.testCase();
        FactorialTest.preCondition();
        FactorialTest.PostCondition();
    }
    public static void fibonacciTest() {
        // FibonacciTest.baseCase();
        // FibonacciTest.testRecursionCase();
        // FibonacciTest.preCondition(); //require
        // FibonacciTest.PostCondition(); //satisfy
        FibonacciTest.Testfibo();
    }
}
