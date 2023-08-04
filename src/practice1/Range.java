package practice1;

public class Range {
    //private으로 설정하여 외부에서 설정 불가능하게 함
    private int upperBound;
    private int lowerBound;
    //Abstraction barrier
    public Range(int lowerBound, int upperBound) {
        // classInvariant(lowerBound, upperBound);
        if (lowerBound > upperBound) {
            throw new IllegalArgumentException();
        }

        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    // private void classInvariant(int this.lowerBound(), int this.upperBound()) {
    //     if (this.lowerBound > this.upperBound) {
    //         throw new IllegalArgumentException("Range: " + this.lowerBound + ">" + this.upperBound);
    //     }
    // }
    public Range (int upperBound) {
        this(0, upperBound);
    }

    public int getupperBound() { //selectors/accessors - getter
        return this.upperBound;
    }

    public int getlowerBound() {
        return this.lowerBound;
    }
} //modifiers/mutator - setter
