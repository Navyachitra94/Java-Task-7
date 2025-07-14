package programs;

public class ArrayandStringOutofindex {

	public static void main(String[] args) {
		
		//Array Out of Index Exception
		try {
			int arr[] = {5,15,25,35,45};
			 System.out.println("Find the 10th number: " + arr[10]);
		}catch(ArrayIndexOutOfBoundsException ie) {
			System.out.println("The Array is out of index");
		}
		
		
		//String Out of Index Exception
		try {
			String s = "Exception Handling";
			System.out.println("Check the 20th character in the given string:" + s.charAt(20));
		}catch(StringIndexOutOfBoundsException s) {
			System.out.println("The String is out of index");
		}
		
	}

}
