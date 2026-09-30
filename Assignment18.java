abstract class Shape {
    abstract void area();
}

class Circle extends Shape {
    void area() {
        double r = 5;
        System.out.println("Circle area = " + (3.14 * r * r));
    }
}

class Rectangle extends Shape {
    void area() {
        int l = 5, b = 4;
        System.out.println("Rectangle area = " + (l * b));
    }
}

class Main {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Rectangle();

        s1.area();
        s2.area();
    }
}
