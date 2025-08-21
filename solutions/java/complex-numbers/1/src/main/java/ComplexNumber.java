class ComplexNumber {
    private double real, imaginary;

    ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    double getReal() {
        return real;
    }

    double getImaginary() {
        return imaginary;
    }

    double abs() {
        return Math.sqrt(Math.pow(real, 2) + Math.pow(imaginary, 2));
    }

    ComplexNumber add(ComplexNumber other) {
        return new ComplexNumber(this.real + other.real, this.imaginary + other.imaginary);
    }

    ComplexNumber subtract(ComplexNumber other) {
        return new ComplexNumber(this.real - other.real, this.imaginary - other.imaginary);
    }

    ComplexNumber multiply(ComplexNumber other) {
        return new ComplexNumber(this.real * other.real - this.imaginary * other.imaginary, this.imaginary * other.real + this.real * other.imaginary);
    }

    ComplexNumber divide(ComplexNumber other) {
        return new ComplexNumber((this.real * other.real + this.imaginary * other.imaginary) / (other.real * other.real + other.imaginary * other.imaginary), (this.imaginary * other.real - this.real * other.imaginary) / (other.real * other.real + other.imaginary * other.imaginary));
    }

    ComplexNumber conjugate() {
        return new ComplexNumber(this.real, - this.imaginary);
    }

    ComplexNumber exponentialOf() {
        return new ComplexNumber(Math.exp(this.real) * Math.cos(this.imaginary), Math.exp(this.real) * Math.sin(this.imaginary));
    }
}