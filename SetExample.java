import java.util.HashSet;
import java.util.Set;

class SetExample {
    public static void main(String[] args) {
        // Creating a HashSet
        Set<String> colors = new HashSet<>();

        // Adding elements
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        // Checking existence
        System.out.println("Contains Red? " + colors.contains("Red")); // Output: Contains Red? true

        // Size of the set
        System.out.println("Size of the set: " + colors.size()); // Output: Size of the set: 3

        // Iterating through elements
        System.out.print("Elements: ");
        for (String color : colors) {
            System.out.print(color + " ");
        }
        // Output: Elements: Red Green Blue

        // Removing an element
        colors.remove("Green");
        System.out.println("\nAfter removing Green: " + colors); // Output: After removing Green: [Blue, Red]

        // Clearing the set
        colors.clear();
        System.out.println("After clearing the set: " + colors); // Output: After clearing the set: []

        // Adding elements again
        colors.add("Yellow");
        colors.add("Red");

        // Creating another set
        Set<String> moreColors = new HashSet<>();
        moreColors.add("Green");
        moreColors.add("Blue");

        // Union of two sets
        Set<String> unionSet = new HashSet<>(colors);
        unionSet.addAll(moreColors);
        System.out.println("Union of sets: " + unionSet); // Output: Union of sets: [Yellow, Red, Blue, Green]

        // Intersection of two sets
        Set<String> intersectionSet = new HashSet<>(colors);
        intersectionSet.retainAll(moreColors);
        System.out.println("Intersection of sets: " + intersectionSet); // Output: Intersection of sets: []

        // Difference of two sets
        Set<String> differenceSet = new HashSet<>(colors);
        differenceSet.removeAll(moreColors);
        System.out.println("Difference of sets: " + differenceSet); // Output: Difference of sets: [Yellow]
    }
}
