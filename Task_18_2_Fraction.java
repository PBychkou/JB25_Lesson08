public class Task_18_2_Fraction {
    
    private int numerator;
    private int denominator;

    public Task_18_2_Fraction() {
        numerator = denominator = 1;
    }

    public Task_18_2_Fraction(int num, int den) {
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

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }

        Task_18_2_Fraction frac = (Task_18_2_Fraction)obj;

        if (numerator != frac.numerator) {
            return false;
        }
        if (denominator != frac.denominator) {
            return false;
        }
        return true;
    }
}