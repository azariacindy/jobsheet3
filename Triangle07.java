import java.util.Scanner; // Import the Scanner library

public  class Triangle07 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the base and height of the triangle
        System.out.print("Enter the base of the triangle: ");
        int base = scanner.nextInt();

        System.out.print("Enter the height of the triangle: ");
        int height = scanner.nextInt();

        // Calculate the area of the triangle
        float area = base * height / 2f;

        // Display the result
        System.out.println("The area of the triangle is: " + area);

        // Close the Scanner
        scanner.close();
    }
}
