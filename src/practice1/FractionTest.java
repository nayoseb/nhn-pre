package practice1;

import java.util.function.Predicate;

public class FractionTest {

    private FractionTest() {}


    public static void main(String[] args) {
        // 유리수(정수) 4개 args에서 덧셈공식, 4개 못채우면 계속반복
        // args 4개가 정수만 들어오면 1단계 통과(에러처리 통과)
        // 4개 읽어서 유리수 연산 시작
        // main에 다 넣어서 하기
        // int a = 0, b = 0, c = 0, d = 0, up = 0, down = 0, min = 0, n1 = 0, n2 = 0;
        // a = Integer.valueOf(args[0]);
        // b = Integer.valueOf(args[1]);
        // c = Integer.valueOf(args[2]);
        // d = Integer.valueOf(args[3]);

        // if(b == 0 || d == 0) {
        // throw new IllegalArgumentException("분모가 0이면 안됩니다.");
        // }
        // System.out.println(addFraction(a, b, c, d));

        // min = (n1 < n2) ? n1 : n2;
        // System.out.println(up + "/" + down);
        // System.out.println(Mathx.gcd(b, d));
        // for (int i = min; i > 1; i--) {
        // if(n1%i==0 && n2%i==0){
        // n1 /= i;
        // n2 /= i;
        // }
        // }
        Fractional[] rs = { new Fractional(1, 2),
                new Fractional(2, 4),
                new Fractional(4, 8),
                new Fractional(5,10) 
            };
        for(Fractional r : rs)
            System.out.println(r.floatValue());

            Predicate<Fractional> ok = x -> true;
            System.out.println(Mathx.<Fractional>reduceIf(ok, Fractional::add, rs[0],rs[1],rs[2],rs[3])); 
        // Fractional r = rs[0];
        // Object e = rs[1];
        // r.equals(r);

        // System.out.println(x==y);                       // [] 주소값이 다르니 false


    }

    // private static String addFraction(int a, int b, int c, int d) {
    //     int n1 = a * d;
    //     int n2 = b * c;
    //     int up = n1 + n2;
    //     int down = b * d;
    //     int gcd = Mathx.gcd(up, down);
    //     return up / gcd + "/" + down / gcd; // array로 사용할것
    // }
}