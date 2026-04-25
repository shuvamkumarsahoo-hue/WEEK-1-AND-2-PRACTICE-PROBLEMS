import java.util.Scanner;
 
public class TriangleArea {
    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);
 
        // Step 1: Take user inputs (in cm)
        System.out.print("Enter the base of the triangle (in cm): ");
        double base = scanner.nextDouble();
 
        System.out.print("Enter the height of the triangle (in cm): ");
        double height = scanner.nextDouble();
 
        // Step 2: Calculate area in square centimeters
        double areaSqCm = 0.5 * base * height;
 
        // Step 3: Convert area from sq cm to sq inches
        // 1 inch = 2.54 cm => 1 sq inch = 2.54 * 2.54 = 6.4516 sq cm
        double areaSqIn = areaSqCm / 6.4516;
 
        // Step 4: Print the results
        System.out.println("\nThe Area of the triangle in sq in is " + areaSqIn
                         + " and sq cm is " + areaSqCm);
 
        scanner.close();
    }
}