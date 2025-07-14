package programs;

import java.util.ArrayList;

public class ClearElements {

	public static void main(String[] args) {

		// Step 1: Create ArrayList of Strings
        ArrayList<String> cities = new ArrayList<>();

        // Step 2: Add elements to the ArrayList
        cities.add("Delhi");
        cities.add("Chennai");
        cities.add("Bangalore");
        cities.add("Hyderabad");

        // Display contents before removal
        System.out.println("ArrayList before removal: " + cities);

        // Step 3: Remove all elements using clear()
        cities.clear();

        // Display contents after removal
        System.out.println("ArrayList after removal: " + cities);

	}

}
