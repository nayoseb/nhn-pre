package regular;

public final class Epsilon implements Expression {
    // public static final Epsilon value = new Epsilon();
    public final static Epsilon value =  new Epsilon();
    private Epsilon() {} //construct
    @Override
    public String toString() {
        return "\u03B5";
    }
    
    // public static synchronized Epsilon getInstance(){ //synchronized로 완화할 수 있음 like 화장실 변기 한 번에 하나만 들어갈 수 있음!
    //     if (instance == null) { //synchronized는 임계영역을 설정
    //         instance = new Epsilon(); //이 코드를 실행하는 스레드가 다른 스레드일 수 있음
    //     }
    //     return instance;
    // }

}
