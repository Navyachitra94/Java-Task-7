package programs;

import java.util.ArrayList;
import java.util.List;

public class ListToArray {
    public static void main(String[] args) {

        // Step 1: Create a List of Strings
        List<String> brandNames = new ArrayList<>();
        brandNames.add("Samsung");
        brandNames.add("Xiaomi");
        brandNames.add("Vivo");
        brandNames.add("Oneplus");
        brandNames.add("Nothing");

        // Step 2: Convert List to Array
        String[] brandNamesArray = brandNames.toArray(new String[0]);

        // Step 3: Display the Array
        System.out.println("Array elements:");
        for (String brand : brandNamesArray) {
            System.out.println(brand);
        }
    }
}
