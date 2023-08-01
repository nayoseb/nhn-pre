package practice;

public class Mathx {
    public static double product(double x, double y) {
        return x * y;
    }
    public static int sum(int n){ //Overloading -다형성 //static을 쓰는건 함수라고 알려주는 사투리같은거
        return n*(n+1)/2;
    }
    // sum :: int -> int
    public static int sum(int min, int max){   //잘못된함수
        return sum(max)-sum(min-1);
    }
    public static double sum(double... numbers){
        return Mathx.reduce(new Plus(), 0, numbers);
    }

    // sum :: (int, int) -> int
    /* static double sum(double... numbers) {  // { 앞에꺼를 type signature 라 칭함
                                            // ...numbers 에도 reference count 1증가
        double result = 0;
        for(double number: numbers)
            result+=number;
        return result;
    }   */                                     // 종료시 referece count 1감소 -> 0되면 메모리 회수
    // 변수_(이름,값,범위(scope, 시계[한자로]),타입[저장공간크기],lifetime)-이름이(...) 간추린다. abstraction한다.[이름붙이기]
    // 스태틱바인딩vs다이나믹바인딩
    // int index = 0_코드쓸때 결정, 컴파일시, 스태틱바인딩
    // numbers는 런타임, 로컬변수, 매게변수.

    // product: double... -> double    //type signature
    /* private static double product(double... numbers){
        dobule result = 1;
        for(double number : numbers)
            result *=number;
        return result;
    } */
    public static double product(double... numbers) {
        return reduce(new Multiply(), 1, numbers);  //Product는 apply를 할수있음
    }

    // fold-{right, left}
    public static double reduce(BinaryOperation binaryOperation, double init, double...numbers) {
        // double result = init;
        // for (double number : numbers)   
        //     result = binaryOperation.apply(result, number);
        // return result;
        return reduceIf(x->true, binaryOperation,init, numbers);
    }

    public static double reduceIf(Predicate predicate, BinaryOperation binaryOperation, double init, double...numbers) {
        double result = init;
        for (double number : numbers)  
            if (predicate.apply(number))
                result = binaryOperation.apply(result, number);
        return result;
    }
}