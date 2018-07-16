public class Task_18_1_Fraction {
    
    private int numerator;
    private int denominator;

    public Task_18_1_Fraction() {
        numerator = denominator = 1;
    }

    public Task_18_1_Fraction(int num, int den) {
        numerator = num;
        denominator = den;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator (int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }
}