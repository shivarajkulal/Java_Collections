import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
class ListExample {
    public static void main(String[] args) {
        // Creating an ArrayList
        List<String> fruits = new ArrayList<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Accessing elements
        System.out.println("First fruit: " + fruits.get(0)); // Output: First fruit: Apple

        // Checking if an element exists
        System.out.println("Index of Banana: " + fruits.indexOf("Banana")); // Output: Index of Banana: 1

        // Removing an element
        fruits.remove("Banana");
        System.out.println("After removing Banana: " + fruits); // Output: After removing Banana: [Apple, Orange]

        // Updating an element
        fruits.set(1, "Grapes");
        System.out.println("After updating at index 1: " + fruits); // Output: After updating at index 1: [Apple, Grapes]

        // Checking size and emptiness
        System.out.println("Size of the list: " + fruits.size()); // Output: Size of the list: 2
        System.out.println("Is the list empty? " + fruits.isEmpty()); // Output: Is the list empty? false

        // Creating a sublist
        List<String> subList = fruits.subList(0, 1);
        System.out.println("Sublist: " + subList); // Output: Sublist: [Apple]

        // Sorting elements
        fruits.add("Kiwi");
        fruits.sort(String::compareTo);
        System.out.println("Sorted list: " + fruits); // Output: Sorted list: [Apple, Grapes, Kiwi, Orange]

        // Converting to an array
        String[] fruitsArray = fruits.toArray(new String[0]);
        System.out.println("Array of fruits: " + java.util.Arrays.toString(fruitsArray)); // Output: Array of fruits: [Apple, Grapes, Kiwi, Orange]
		
		        // Displaying the original list
        System.out.println("Original list: " + fruits); // Output: Original list: 

        // Sorting the list in ascending order
        Collections.sort(fruits);
        System.out.println("Sorted list (ascending): " + fruits); // Output: Sorted list (ascending):

        // Sorting the list in descending order
        Collections.sort(fruits, Collections.reverseOrder());
        System.out.println("Sorted list (descending): " + fruits); // Output: Sorted list (descending): 
		
    }
}
