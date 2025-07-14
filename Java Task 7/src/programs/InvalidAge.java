package programs;

import java.util.Scanner;

//Custom Exception Class
class InvalidAgeException extends Exception {
	
 public InvalidAgeException(String msg) {
     super(msg);
 }
 
}

public class InvalidAge {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        try {
            // Read age from user
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            
            if (age < 18) {
                throw new InvalidAgeException("Age must be equal to or above 18.");
            }

            System.out.println("Access granted. Age is valid.");

        } catch (InvalidAgeException e) {
            // Handle custom exception
            System.out.println("Error: " + e.getMessage());

        } catch (Exception e) {
            // Handle invalid input (e.g., if input is not a number)
            System.out.println("Error: Please enter a valid number for age.");

        } finally {           
            System.out.println("Program Success.");
        }

	}

}
