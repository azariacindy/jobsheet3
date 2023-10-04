import java.util.Scanner; // Import the Scanner library

public  class Bank07 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the initial savings amount
        System.out.print("Enter the initial savings amount (in Rp.): ");
        int init_sav_amount = scanner.nextInt();

        // Prompt the user for the savings period in years
        System.out.print("Enter the savings period (in years): ");
        int sav_period = scanner.nextInt();

        // Define the interest rate percentage
        double interest_percent = 0.02;

        // Calculate the interest
        double interest = sav_period * interest_percent * init_sav_amount;

        // Calculate the final savings amount
        double final_sav_amount = init_sav_amount + interest;

        // Display the calculated interest and final savings amount
        System.out.println("Interest earned: Rp. " + interest);
        System.out.println("Final savings amount: Rp. " + final_sav_amount);

        // Close the Scanner
        scanner.close();
    }
}
