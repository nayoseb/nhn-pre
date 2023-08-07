package regular;

public final class Or implements Expression {


    private Expression left;
    private Expression right;

    public Or(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public Expression getLeft() {
        return left;
    }

    public Expression getRight() {
        return right;
    }

    @Override
    public String toString() {
        return "("+ this.getLeft().toString() + '|' + this.getRight().toString() + ")";
    }

}
