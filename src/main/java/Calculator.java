import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double num1;
        double num2;
        char operator;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number:");
        num1 = input.nextDouble();

        System.out.println("Enter Operator (+, -, *, /):");
        operator = input.next().charAt(0);

        System.out.println("Enter second number:");
        num2 = input.nextDouble();

        input.close();

        switch (operator) {
            case '+':
                String addOutput = String.format("%.2f + %.2f = %.2f", num1, num2, add(num1, num2));
                System.out.println(addOutput);
                break;
            case '-':
                String subOutput = String.format("%.2f - %.2f = %.2f", num1, num2, sub(num1, num2));
                System.out.println(subOutput);
                break;
            case '*':
                String prodOutput = String.format("%.2f * %.2f = %.2f", num1, num2, prod(num1, num2));
                System.out.println(prodOutput);
                break;
            case '/':
                if (num2 != 0) {
                    String divOutput = String.format("%.2f / %.2f = %.3e", num1, num2, div(num1, num2));
                    System.out.println(divOutput);
                }else{
                    System.out.println("Error: Cannot divide by Zero");
                }
                break;

            default:
                System.out.println("Unacceptable Operator, please use (+, -, *, /)");


        }
    }

    public static double add(double num1, double num2) {
        double result = num1 + num2;
        return result;
    }

    public static double sub(double num1, double num2) {
        double result = num1 - num2;
        return result;
    }

    public static double prod(double num1, double num2) {
        double result = num1 * num2;
        return result;
    }

    public static double div(double num1, double num2) {
        double result = num1 / num2;
        return result;
    }
}


