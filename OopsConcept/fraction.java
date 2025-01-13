package OopsConcept;

public class fraction {
    public int numerator;
    public int denominator;

    public fraction(int num, int denum) {
        if (denum == 0) {
            System.err.println("denumerator cannot be 0");
        } else {
            this.numerator = num;
            this.denominator = denum;
        }
    }

    public fraction() {
        System.out.println("default Consteuctor run");
    }

    public void printNumandDenom() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.numerator);
        sb.append(" ");
        sb.append(this.denominator);
        System.out.println(sb.toString());
    }

    public float Simplify() {
        float simpleForm = numerator / denominator;
        return simpleForm;
    }

    @Operator("+")
    public fraction add(fraction frac1, fraction frac2) {
        fraction newfrac = new fraction();
        if (frac1.denominator == frac2.denominator) {
            newfrac.denominator = frac1.denominator;
            newfrac.numerator = frac1.numerator + frac2.numerator;
            return newfrac;
        } else {
            newfrac.denominator = frac1.denominator * frac2.denominator;
            newfrac.numerator = (frac1.numerator * frac2.denominator) + (frac2.numerator * frac1.denominator);
            return newfrac;
        }

    }
}
