package Calculator;

import Calculator.calculator;

public class Main {
    public static void main(String[] args) {
        calculator calc = new calculator();
        System.out.println("Add: " + calc.add(5, 3));
        System.out.println("Subtract: " + calc.subtract(5, 3));
        System.out.println("Multiply: " + calc.multiply(5, 3));
        System.out.println("Divide: " + calc.divide(5, 3));
        int result = calc.modulus(10, 3);
        System.out.println("Modulus result: " + result);
    }
}
