import java.util.*;
class Rational {
    private int numerator, denominator;
    
    Rational(int numerator, int denominator) {
        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }
        
        int gcd = gcd(Math.abs(numerator), Math.abs(denominator));
        this.numerator = numerator / gcd;
        this.denominator = denominator / gcd;
    }
    
    
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    int getNumerator() {
        return numerator;
    }
    
    int getDenominator() {
        return denominator;
    }
    
    Rational add(Rational other) {
        return new Rational((this.numerator * other.denominator + other.numerator * this.denominator), (this.denominator * other.denominator));
    }
    
    Rational subtract(Rational other) {
        return new Rational((this.numerator * other.denominator - other.numerator * this.denominator), (this.denominator * other.denominator));
    }
    
    Rational multiply(Rational other) {
        return new Rational((this.numerator * other.numerator), (this.denominator * other.denominator));
    }
    
    Rational divide(Rational other) {
        return new Rational(this.numerator * other.denominator, other.numerator * this.denominator);
    }
    
    Rational abs() {
        return new Rational(Math.abs(this.numerator), Math.abs(this.denominator));
    }
    
    Rational pow(int power) {
        if (power >= 0) {
            return new Rational((int)Math.pow(this.numerator, power), (int)Math.pow(this.denominator, power));
        } else {
            return new Rational((int)Math.pow(this.denominator, Math.abs(power)), (int)Math.pow(this.numerator, Math.abs(power)));
        }
    }
    
    double exp(double exponent) {
        return Math.pow(exponent, (double) this.numerator / this.denominator);
    }
    
    @Override
    public String toString() {
        return String.format("%d/%d", this.getNumerator(), this.getDenominator());
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Rational other) {
            return this.getNumerator() == other.getNumerator()
                    && this.getDenominator() == other.getDenominator();
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.getNumerator(), this.getDenominator());
    }
}