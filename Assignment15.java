class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

class Rabbit extends Animal {
    void jump() {
        System.out.println("Rabbit jumps");
    }
}

class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();

        Rabbit r = new Rabbit();
        r.eat();
        r.jump();
    }
}
