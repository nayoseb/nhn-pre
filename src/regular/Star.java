package regular;

public final class Star implements Expression {

    private Expression a;

    public Star(Expression a) {
        this.a = a;
    }

    public Expression getA() {
        return a;
    }

    @Override
    public String toString() {
        return "(" + a.toString()+")" + "*";
    }
}
