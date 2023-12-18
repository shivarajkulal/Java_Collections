# Java_Collections

### Commonly Used Map Methods:

#### 1. **Adding and Updating Entries:**
   - `put(key, value)`: Adds or updates a key-value pair in the map.
   - `putIfAbsent(key, value)`: Adds a key-value pair if the key is not already present.

#### 2. **Removing Entries:**
   - `remove(key)`: Removes the entry with the specified key.
   - `remove(key, value)`: Removes the entry only if the key is associated with the specified value.

#### 3. **Accessing Entries:**
   - `get(key)`: Returns the value associated with the specified key.
   - `containsKey(key)`: Checks if the map contains a specific key.
   - `containsValue(value)`: Checks if the map contains a specific value.

#### 4. **Iterating through Entries:**
   - `keySet()`: Returns a set of all keys in the map.
   - `values()`: Returns a collection of all values in the map.
   - `entrySet()`: Returns a set of key-value pairs (entries) in the map.

#### 5. **Size and Clear:**
   - `size()`: Returns the number of key-value mappings in the map.
   - `isEmpty()`: Checks if the map is empty.
   - `clear()`: Removes all key-value mappings from the map.

#### 6. **Merging and Computing:**
   - `merge(key, value, remappingFunction)`: Performs a merging operation on the specified key.
   - `compute(key, remappingFunction)`: Performs a computation on the specified key and its associated value.

#### 7. **Default Values:**
   - `getOrDefault(key, defaultValue)`: Returns the value to which the specified key is mapped, or a default value if the key is not present.

This cheat sheet covers some of the essential methods in the `Map` interface. Remember to choose the specific implementation class that fits your needs, such as `HashMap`, `TreeMap`, or `LinkedHashMap`.



### Commonly Used List Methods:

#### 1. **Adding Elements:**
   - `add(element)`: Appends the specified element to the end of the list.
   - `add(index, element)`: Inserts the specified element at the specified position.

#### 2. **Accessing Elements:**
   - `get(index)`: Returns the element at the specified index.
   - `indexOf(element)`: Returns the index of the first occurrence of the specified element.
   - `lastIndexOf(element)`: Returns the index of the last occurrence of the specified element.

#### 3. **Removing Elements:**
   - `remove(index)`: Removes the element at the specified index.
   - `remove(element)`: Removes the first occurrence of the specified element.
   - `clear()`: Removes all elements from the list.

#### 4. **Updating Elements:**
   - `set(index, element)`: Replaces the element at the specified index with the specified element.

#### 5. **Checking Size and Empty:**
   - `size()`: Returns the number of elements in the list.
   - `isEmpty()`: Checks if the list is empty.

#### 6. **Sublists and Slicing:**
   - `subList(fromIndex, toIndex)`: Returns a view of the portion of the list between the specified `fromIndex`, inclusive, and `toIndex`, exclusive.

#### 7. **Sorting:**
   - `sort(Comparator<? super E> c)`: Sorts the list according to the order induced by the specified comparator.

#### 8. **Converting to Array:**
   - `toArray()`: Returns an array containing all elements in the list.

#### 9. **Iterating through Elements:**
   - Using enhanced for loop or iterators.

This cheat sheet covers some of the essential methods in the `List` interface. Remember to choose the specific implementation class that fits your needs, such as `ArrayList` or `LinkedList`.



### Commonly Used Set Methods:

#### 1. **Adding Elements:**
   - `add(element)`: Adds the specified element to the set if it is not already present.

#### 2. **Removing Elements:**
   - `remove(element)`: Removes the specified element from the set.
   - `clear()`: Removes all elements from the set.

#### 3. **Checking Existence:**
   - `contains(element)`: Returns `true` if the set contains the specified element.
   - `isEmpty()`: Returns `true` if the set is empty.

#### 4. **Size:**
   - `size()`: Returns the number of elements in the set.

#### 5. **Iterating through Elements:**
   - Using enhanced for loop or iterators.

#### 6. **Conversion to Other Collections:**
   - `toArray()`: Returns an array containing all elements of the set.

#### 7. **Operations:**
   - `addAll(collection)`: Adds all elements from the specified collection to the set.
   - `retainAll(collection)`: Retains only the elements in the set that are contained in the specified collection.
   - `removeAll(collection)`: Removes from the set all of its elements that are also contained in the specified collection.

This cheat sheet covers some of the essential methods in the `Set` interface. Remember to choose the specific implementation class that fits your needs, such as `HashSet`, `TreeSet`, or `LinkedHashSet`.
