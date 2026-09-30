import java.util.LinkedList;

class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        // Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");

        // Accessing an element
        System.out.println("First element: " + list.getFirst());

        // Removing an element
        list.remove("Banana");

        // Displaying list
        System.out.println("After removal: " + list);
    }
}
