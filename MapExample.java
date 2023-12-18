import java.util.HashMap;
import java.util.Map;

class MapExample {
    public static void main(String[] args) {
        // Creating a HashMap
        Map<String, Integer> ageMap = new HashMap<>();

        // Adding entries
        ageMap.put("Alice", 25);
        ageMap.put("Bob", 30);
        ageMap.put("Charlie", 22);

        // Accessing entries
        System.out.println("Alice's age: " + ageMap.get("Alice")); // Output: Alice's age: 25

        // Checking if a key exists
        System.out.println("Does Bob exist? " + ageMap.containsKey("Bob")); // Output: Does Bob exist? true

        // Checking if a value exists
        System.out.println("Is age 22 present? " + ageMap.containsValue(22)); // Output: Is age 22 present? true

        // Iterating through keys
        System.out.println("Keys: " + ageMap.keySet()); // Output: Keys: [Alice, Bob, Charlie]

        // Iterating through values
        System.out.println("Values: " + ageMap.values()); // Output: Values: [25, 30, 22]

        // Iterating through entries
        System.out.println("Entries: " + ageMap.entrySet()); // Output: Entries: [Alice=25, Bob=30, Charlie=22]

        // Removing an entry
        ageMap.remove("Charlie");
        System.out.println("After removing Charlie: " + ageMap); // Output: After removing Charlie: {Alice=25, Bob=30}

        // Size of the map
        System.out.println("Size of the map: " + ageMap.size()); // Output: Size of the map: 2

        // Default value if key is not present
        System.out.println("Dave's age (default 0 if not present): " + ageMap.getOrDefault("Dave", 0)); // Output: Dave's age (default 0 if not present): 0
    }
}
