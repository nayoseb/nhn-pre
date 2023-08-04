package practice1;

public class FractionTest {

    private FractionTest() {}

    // 아래3개 Abstraction barrier
    public static int[] fractional(int numorator, int denomiator) { //constructor
        if(denomiator == 0)
            throw new IllegalArgumentException("분자가 0이야! 다시");
        int[] rep = new int[] {numorator, denomiator};
        normalize(rep);     // 기약분수로 만듬
        classInvariant(rep); //기약분수인지 확인
        return rep;
    }

    public static void classInvariant(int[] fraction) {
        int num = fraction[0];
        int den = fraction[1];
        if(Mathx.gcd(num, den) != 1) {
            throw new IllegalArgumentException("기약분수가 아닙니다");
        }
    }
    

    public static int numerator(int[] r) { // 분자 돌려줌 getter
        normalize(r);
        return r[0];
    }
    public static int denomiator(int[] r) { // 분모 돌려줌 getter
        normalize(r);
        return r[1];
    }
    private static int[] add(int[] f1, int[] f2) {
        return fractional(numerator(f1) * denomiator(f2) + numerator(f2) * denomiator(f1), 
                        denomiator(f1) * denomiator(f2));
    }
    private static String toString(int[] add) {

        return numerator(add)/Mathx.gcd(numerator(add),denomiator(add)) +"/"+ 
                    denomiator(add)/Mathx.gcd(numerator(add),denomiator(add));
     }
    private static void normalize(int[] r){
        int g = Mathx.gcd(r[0], r[1]);
        r[0]/=g;
        r[1]/=g;
    }

     public static boolean equals(int[] x, int[] y){
        return numerator(x)==numerator(y)&&denomiator(x)==denomiator(y);
     }
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
        int[][] rs = {fractional(1, 2),
                fractional(2, 4),
                // fractional(4, 8),
                fractional(5,10) 
            };
        for(int[] r : rs)
            System.out.println(toString(r));

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