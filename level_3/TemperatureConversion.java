import java.util.Scanner;
 
public class TemperatureConversion {
    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);
 
        // Step 1: Take user input (celsius)
        System.out.print("Enter the temperature in Celsius: ");
        double celsius = scanner.nextDouble();
 
        // Step 2: Convert Celsius to Fahrenheit
        // Formula: (°C × 9/5) + 32 = °F
        double fahrenheitResult = (celsius * 9 / 5) + 32;
 
        // Step 3: Print the result
        System.out.println("\nThe " + celsius + " celsius is " + fahrenheitResult + " fahrenheit");
 
        scanner.close();
    }
}