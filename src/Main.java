import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        BasicCalculator calc=new BasicCalculator();

        System.out.println("--- Basic Calculator ---");

        System.out.print("Add the first number: ");
        double num1 = new Scanner(System.in).nextDouble();

        System.out.print("Select the operation (+, -, *, /): ");
        String operation = new Scanner(System.in).nextLine();

        System.out.print("Add the second number: ");
        double num2 = new Scanner(System.in).nextDouble();

        switch (operation) {
            case "+":
                System.out.println("Result: " + num1 + " + " + num2 + " = " +calc.add(num1, num2) );
                break;
            case "-":
                System.out.println("Result: " + num1 + " - " + num2 + " = " + calc.subtract(num1, num2) );
                break;
            case "*":
                System.out.println("Result: " + num1 + " * " + num2 + " = " + calc.multiply(num1, num2) );
                break;
            case "/":
                System.out.println("Result: " + num1 + " / " + num2 + " = " + calc.divide(num1, num2) );
                break;
            default:
                System.out.println("Invalid operation!");
        }

    }
}