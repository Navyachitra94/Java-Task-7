package programs;

import java.util.Scanner;

public class DivisionException {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("Enter the first integer:");
			int num1 = sc.nextInt();
			
			System.out.print("Enter the Second integer:");
			int num2 = sc.nextInt();			
			
			int Total = num1/num2;
			System.out.print("Total is " +Total);
		}catch(ArithmeticException ie) {
			
			System.out.println("Error:Cannot divide with zero");
			
		}catch(Exception a) {
			System.out.println("Please Enter integres only");
		}
		finally {
				System.out.println("Integer Divison Program with Exception Success");
		}
		
		

	}

}
