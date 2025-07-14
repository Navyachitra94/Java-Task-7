package programs;

import java.util.Map;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.Collections;

public class EmplyoeeTreeMap {
    public static void main(String[] args) {

        // Step 1: Create TreeMap with employee ID 
        TreeMap<Integer, String> employees = new TreeMap<>();

        // Step 2: Add employee data
        employees.put(11700, "Sanjey");
        employees.put(11701, "Pemma");
        employees.put(11702, "Poorna");
        employees.put(11703, "Rithu");
        employees.put(11704, "Sowmiya");
        employees.put(11705, "Malathy");

        // Step 3: Extract names into a list
        ArrayList<String> names = new ArrayList<>(employees.values());

        // Step 4: Sort names alphabetically
        Collections.sort(names);

        // Step 5: Display names
        System.out.println("Employee names in alphabetical order:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}

