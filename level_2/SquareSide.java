import java.util.Scanner;
 
public class SquareSide {
    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);
 
        // Step 1: Take user input (perimeter)
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = scanner.nextDouble();
 
        // Step 2: Calculate the side
        // Perimeter = 4 * side  =>  side = Perimeter / 4
        double side = perimeter / 4;
 
        // Step 3: Print the result
        System.out.println("\nThe length of the side is " + side
                         + " whose perimeter is " + perimeter);
 
        scanner.close();
    }
}