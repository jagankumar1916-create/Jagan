import java.util.ArrayList;

class TodoList {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();

        // Adding tasks
        tasks.add("Study Java");
        tasks.add("Complete assignment");
        tasks.add("Practice programs");

        // Removing a task
        tasks.remove("Complete assignment");

        // Iterating over tasks
        for (String task : tasks) {
            System.out.println(task);
        }
    }
}
