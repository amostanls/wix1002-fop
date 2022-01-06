public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int x, int y) {
        numerator = x;
        denominator = y;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public void displayLowestTerm() {
        int GCD = gcd(numerator, denominator);
        System.out.println("Original: " + numerator + " / " + denominator);
        System.out.println("Lowest Term: " + (numerator / GCD) + " / " + (denominator / GCD));
    }

    public int gcd(int a, int b) {
        if(b>0)return gcd(b, a%b);
        return a;
    }
}
