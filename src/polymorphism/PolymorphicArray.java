package polymorphism;

import java.util.ArrayList;
import java.util.Scanner;

public class PolymorphicArray {
    public static void main(String[] args) {
        /*
        "Alex", "John", "Max"
        1, 2, 3, 4, 5
        ...
         */

        Object[] elements = {5, 10.5, "*", "Alex", true, new Dog(),
        new Scanner(System.in), new ArrayList<>()};
        for (Object element : elements) {
            System.out.println(element.getClass().getSimpleName());
        }
        Dog dog1 = (Dog) elements[5];

        String name = (String) elements[3];
        System.out.println(name.startsWith("A"));

    }
}
