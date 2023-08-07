package practice1;

//how to design a type
// (1)  primative operations to define a (data) type (set)
// ADT(abstration data type), where primives = abstraction barrier
// (2) combinations (combinational operations) e.g) add, multiply
//apache의 common 라이브러리
public class Fractional extends Number{
    private int numerator;
    private int denominator;

    public Fractional(int numerator, int denominator) { //constructor
        if(denominator == 0)
            throw new IllegalArgumentException("분자가 0이야! 다시");
            // this.rep = new int[] {numerator, denominator};
            this.numerator = numerator;
            this.denominator = denominator;
            normalize();
        // int[] rep = new int[] {numerator, denominator};
        // normalize(rep);     // 기약분수로 만듬
        // classInvariant(rep); //기약분수인지 확인
    }

    public void classInvariant() {
        // int num = r.numerator();
        // int den = r.denominator();
        if(Mathx.gcd(this.numerator, this.denominator) != 1) {
            throw new IllegalArgumentException("기약분수가 아닙니다");
        }
    }
    //<Messsage Passing> 메세지 패싱 paradigm
    //f(a, b, c) -> a.f(b, c)
    //move(circle, point(x, y))
    //cicle move : poinf(x, y)
    //circle.move(point(x, y))

    //projection 
    // (name, gender, age) = person
    //person.name = 
    public int getNumerator() { // 분자 돌려줌 getter
        // normalize(rep);
        return this.numerator;
    }
    public int getDenominator() { // 분모 돌려줌 getter
        // normalize(rep);
        return this.denominator;
    }
    public Fractional add(Fractional r) {
        return new Fractional(this.getNumerator() * r.getDenominator() + r.getNumerator() * this.getDenominator(), 
                        this.getDenominator() * r.getDenominator());
    }
    // 아래3개 Abstraction barrier
    public void normalize(){
        int g = Mathx.gcd(this.numerator, this.denominator);
        this.numerator/=g;
        this.denominator/=g;
    }

    @Override
    public String toString() {

        return this.getNumerator()
        // /Mathx.gcd(this.numerator(),this.denominator()) 
        +"/"+ this.getDenominator()
        // /Mathx.gcd(this.numerator(),this.denominator())
        ;
     }




    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + this.numerator;
        result = prime * result + this.denominator;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (getClass() != obj.getClass())
            return false;
        Fractional other = (Fractional) obj;
        return this.equals(other);
    }

    public boolean equals(Fractional that){
        if (this == that)
            return true;
        if (that == null)
            return false;        
        return this.getNumerator()==that.getNumerator()&&this.getDenominator()==that.getDenominator();
     }

    @Override
    public int intValue() {
        return (int)(this.getNumerator() / this.getDenominator());
    }

    @Override
    public long longValue() {
        // TODO Auto-generated method stub
        return (long)(this.getNumerator() / this.getDenominator());
    }

    @Override
    public float floatValue() {
        // TODO Auto-generated method stub
        return (float) this.getNumerator() / this.getDenominator();
    }

    @Override
    public double doubleValue() {
        // TODO Auto-generated method stub
    return (double) this.getNumerator() / (double) this.getDenominator();
    }
}