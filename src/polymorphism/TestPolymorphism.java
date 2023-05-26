package polymorphism;

import java.util.LinkedList;
import java.util.List;

public class TestPolymorphism {
    public static void main(String[] args) {
        System.out.println("\n-------Testing Animal Object-------\n");

        Animal a1 = new Animal();
        a1.eat();
        a1.sleep();

        System.out.println("\n-------Testing Dog Object-------\n");

        Dog d1 = new Dog();
        d1.eat();
        d1.sleep();
        d1.bark();

        System.out.println("\n-------Dog Object in the shape of Animal-------\n");
        Animal a2 = new Dog(); // up-casting
        a2.eat(); // Dog sleeps
        a2.sleep(); // Dog eats
        a2.eat("food"); // Animal eats food
        // a2.bark(); // compiler error



    }
}
