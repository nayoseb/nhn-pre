package practice1;

public class RangeTest {
    public static void classInvariant() {
        int lowerBound = -2;
        int upperBound = -6;

        try {
            Range range = new Range(lowerBound, upperBound);
        } catch (IllegalArgumentException e) {
            System.out.format("Range: lower bound %d가 upper bound %d보다 크쟎아!%n",
            lowerBound, upperBound);
        }
        System.out.println(lowerBound);
    }

    public void lowerBound() {
        assert true;
    }
    public void upperBound() {
        assert true;
    }

}
