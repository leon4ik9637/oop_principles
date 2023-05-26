package abstraction.interfaces;

public class Understanding {

    public static void main(String[] args) {
        /*
        INTERFACES
        - it is another way achieving abstraction
        - They are used to define additional information (functionalities)
        of the child class object
        - We can create interface with the "interface" keyword
        - child classes can implement one or multiple interfaces with
        "implement" keyword
            class1 extends class2 implements interface1
            class1 extends class2 implements interface1, interface2,...

        WHAT IS THE DIFFERENCE BETWEEN ABSTRACT CLASS AND INTERFACE?
        - ABSTRACT class is a class and can be created with "abstract" and
        "class" keywords. Interfaces are created with "interface" keyword
        - We can use "extends" keyword to inherit an abstract class while we
        use "implement" keyword to inherit an interface
        - abstract can have both abstract and non-abstract methods while
        interfaces have only abstract methods (there will be an exception)
        - abstract classes can have any types of access modifiers for
        instance variables while interfaces can have only public static final
        instance variables (constants)
        - you can have constructor in the abstract classes, but you cannot have
        constructor in an interface
        - we can extend from one abstract class, but we can implement many
        interfaces

        SIMILARITIES:
        - Both of abstract classes and interfaces cannot be instantiated
        - Both can have abstract methods


        IS MULTIPLE INHERITANCE POSSIBLE IN JAVA?
        - Yes, but it is possible only with interfaces

        NOTE: Most of the time, interfaces are names ending with "able"

        The methods that are allowed to have body in an interface?
        1. default methods (this is not an access modifier)
        2. static method

        NOTE: one class can extend to only one class but one interface can
        extend to many other interfaces

        WHY WE NEED INTERFACES?
        - FIRST: it is the only way to achieve multiple inheritance in Java
        - Flexibility to implement or not
        - Additional features and functions
        - It can be implemented by different objects

         */
    }
}
