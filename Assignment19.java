class Student {
    String name;
    int marks;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

class Main {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Rahul";
        s1.marks = 85;

        Student s2 = new Student();
        s2.name = "Priya";
        s2.marks = 90;

        s1.display();
        s2.display();
    }
}
