package practice2;

public class Mathx {
    private Mathx() {
    }

    public static int fibonacci(int n) { //n은 문제의 크기를 정의
        if (n < 0)
            throw new IllegalArgumentException("fibonacci:n < 0");
        if (n == 0)
            return 0;
        else if (n == 1) 
            return 1;
        return Math.addExact(fibonacci(n - 1) + fibonacci(n - 2), n); //recursion case
    }

    public static int factorial(int n) 
        {
        if (n < 0)
        throw new IllegalArgumentException("factorail: n < 0");
        if (n == 0)
        return 1;

        
        return Math.multiplyExact(factorial(n-1), n);

    }

    public static void printFibonacci(int n) {// 시간복잡도 O(n)
        int first = 0;
        int second = 1;
        int count = 0;

        while (count < n) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;

            count++;
        }
    }

}
