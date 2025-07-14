package programs;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FilenotFoundEx {

	public static void main(String[] args) {
		
		String fileName = "exception.txt";
		
		try {
			
            // Attempt to open and read the file
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);
            
            System.out.println("Reading file content:");
            
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
                }
            
            } catch (FileNotFoundException e) {
                // File not found error handling
                System.out.println("Error: The file \"" + fileName + "\" was not found.");
            } 
            System.out.println("Program Success.");          

	}

}
