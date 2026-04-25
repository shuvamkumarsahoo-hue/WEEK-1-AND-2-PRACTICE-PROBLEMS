import java.util.Scanner;
 
public class Calculator {
    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);
 
        // Step 1: Take user inputs
        System.out.print("Enter first number: ");
        double number1 = scanner.nextDouble();
 
        System.out.print("Enter second number: ");
        double number2 = scanner.nextDouble();
 
        // Step 2: Perform Arithmetic Operations
        double addition       = number1 + number2;
        double subtraction    = number1 - number2;
        double multiplication = number1 * number2;
        double division;
 
        if (number2 != 0) {
            division = number1 / number2;
            System.out.println("\nThe addition, subtraction, multiplication, and division value of 2 numbers "
                    + number1 + " and " + number2
                    + " is " + addition + ", " + subtraction + ", " + multiplication + ", and " + division);
        } else {
            System.out.println("\nThe addition, subtraction, multiplication, and division value of 2 numbers "
                    + number1 + " and " + number2
                    + " is " + addition + ", " + subtraction + ", " + multiplication + ", and undefined (division by zero)");
        }
 
        scanner.close();
    }
}