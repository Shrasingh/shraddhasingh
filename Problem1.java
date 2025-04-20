// File: Problem1.java

import java.util.Scanner;

public class Problem1 {
    double a, b;
    String operation;

    public Problem1(double a, double b, String operation) {
        this.a = a;
        this.b = b;
        this.operation = operation;
    }

    public double calculate() {
        switch (operation) {
            case "add":
                return a + b;
            case "subtract":
                return a - b;
            case "multiply":
                return a * b;
            case "divide":
                if (b != 0) return a / b;
                else throw new ArithmeticException("Division by zero");
            default:
                throw new IllegalArgumentException("Invalid operation");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value for a: ");
        double a = sc.nextDouble();
        System.out.print("Enter value for b: ");
        double b = sc.nextDouble();
        sc.nextLine();  // Consume newline
        System.out.print("Enter operation (add, subtract, multiply, divide): ");
        String operation = sc.nextLine();

        Problem1 calc = new Problem1(a, b, operation);
        double result = calc.calculate();
        System.out.println("Result: " + result);
    }
}
