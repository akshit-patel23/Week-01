//a program to create a calculator using switch...case.

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
		
         Scanner sc = new Scanner(System.in);

         //Taking input
        System.out.print("Enter the first number: ");
        double firstNumber = sc.nextDouble();
        System.out.print("Enter the second number: ");
        double secondNumber = sc.nextDouble();
        System.out.print("Enter an operator (+, -, *, /): ");
        String operator = sc.next();

        // Performing the operation 
        switch (operator) {
            case "+":
                System.out.println("Result: " + (firstNumber + secondNumber));
                break;
            case "-":
                System.out.println("Result: " + (firstNumber - secondNumber));
                break;
            case "*":
                System.out.println("Result: " + (firstNumber * secondNumber));
                break;
            case "/":
                if (secondNumber != 0) {
                    System.out.println("Result: " + (firstNumber / secondNumber));
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operator! Please use +, -, *, or /.");
        }
    }
}
