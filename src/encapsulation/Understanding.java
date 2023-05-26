package encapsulation;

public class Understanding {
    public static void main(String[] args) {
        /*
        ENCAPSULATION (PROTECTION, IN CAPSULE)
        -REMEMBER: private instance variables cannot be accessed outside
        the class
        - With that, we can restrict sensitive data to be accessed and
        manipulated outside the class

        WHAT IS ENCAPSULATION?
        - Encapsulation is making sure that "sensitive" data is hidden from
        users - direct access is restricted

        HOW TO ACHIEVE ENCAPSULATION?
        1. Make instance variables private
        2. Provide public setters and getters methods
        NOTE: These public getters and setters' method will help us access
        and update private instance variables

        GETTER:
        - is used to retrieve(read) data
        - is always return type

        SETTER:
        - is used to set (write) data
        - is mostly void type

        WHY DO WE NEED ENCAPSULATION?
        -Better control of data by public getter and setter methods
        - Class instance variables can be made read-only (if you only use the
        get method), or write-only (if you only use the set method)
        - Flexible: the programmer can change one part of the code without
        affecting other parts
        - Increased security of data

        2. INHERITANCE

        WHAT IS INHERITANCE?
        - Inheritance in Java is inheriting class members from one class
        to another. This will create "inheritance concept" into two classes

        HOW TO ACHIEVE INHERITANCE?
        - we use "extends" keyword
        NOTE: always child extends parent
                WHAT CAN BE INHERITED?
                - In the same package: public - protected - default
                - Different packages: public - protected

                NOTE: There is no way to inherit private class members because
                private class members can only be used in the same class

        WHY DO WE USE INHERITANCE? (BENEFITS)
        - It is useful for code reuse: with the help of inheritance, we
        can reuse attributes and methods of a parent class when we create
        a new child class
        - In most of the cases, most of the methods and attributes are
        already created in parent and we don't need to create those again
        in child classes
        - By this way, we will be using common code with parent while we will
        create only some specific methods and attributes for the child
        classes

        HOW TO PREVENT A CLASS TO BE INHERITED?
        - by making it "final"

        NOTE: one class can extend to one parent only!!!!
        NOTE: one parent class can have multiple child

        final keyword
        - final instance variables: you have to initialize it, and the value
        will never change
        - final class: it cannot be inherited / it cannot be a parent
        - final methods: it cannot be overridden in child class

        METHOD OVERRIDING
        - Method overriding is happening in child class (inheritance)
        - You have a method in parent class, but you are not satisfied with
        its implementation (body), and you would like to change.
        - The method name, return type and arguments must be same
        - Body should be different, otherwise it does not make sense
        to override
        THE PURPOSE OF OVERRIDING A METHOD:
        - It is common to use when we want to specify body in the child
        classes method. So, we override the parent class' methods in child
        - @Override annotation is used to override a parent class' method,
        but it is optional

        METHOD OVERLOADING:
        - It is happening in the same class and has nothing to do with
        inheritance
        - It is having multiple methods in the same class and with the same
        name, but changing either number or type of parameters
        
        child class = subclass
        parent class = super class = base class

        this vs super
        - this keyword is a reference to current object
        - super keyword is a reference to a current parent object

        this()

        CONSTRUCTOR CHAINING
        - it is invoking one custom constructor in another
         */
    }
}
