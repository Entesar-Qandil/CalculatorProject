package Calculator;

public class calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }

    public int modulus(int a, int b) {
        return a % b;
    }

    public double average(int a, int b) {
        return (a + b) / 2.0;
    }

}
