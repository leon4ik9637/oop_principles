import abstraction.abstract_classes.IPhone;
import abstraction.abstract_classes.Phone;

public class OOP_PRINCIPLES {
    public static void main(String[] args) {
        /*
        OOP - Object-Oriented Programming
        - Write Once Run Everywhere     WORE
        - Garbage Collection
        - Java is mostly backend
        - Oracle -> Java 8 or 11 (17)
            Lambda Expression
            Streams

        - it is putting object as a base for all the programs
        - Bank Application
            Account, Transaction, Statement
        - libraries, packages, classes, methods (class members)

        Class: template
        Object: instance

        Class members:
        1. Instance variables
        2. Methods
        3. Constructors
        4. Blocks

        OOP PRINCIPLES
        1. Encapsulation
        2. Inheritance
        3. Abstraction
        4. Polymorphism

        ADVANTAGES OF OOP PRINCIPLES
        - Store and manipulate data & provide safety
        - Reuse code - efficiency, saves us time and effort
        - Maintenance

        1. ENCAPSULATION
        -  Encapsulation is making sure that  "sensitive" data is hidden
        from users
        -  It is restricting direct access to instance variables (private)
        and providing indirect access (public getters and setters)

        GETTER vs SETTER
        - get methods are usually return while set methods are void
        - get is read while set is write
        - both can take arguments but set is definitely takes at least
        information that you want to set

        2. INHERITANCE
        - It is inheriting parent class members (methods and instance
        variables) to child classes with the extends keyword.

        Class1 extends Class2
        Class3 extends Class2
        Class1 -> child
        Class3 -> child
        Class2 -> parent

        WHAT CAN BE INHERITED?
        *** private members can never be inherited (class only)
        *** public and protected members can always be inherited
        *** default can be inherited in the same package only but not in
        different package

        Can a class extend to multiple classes?
        -> No, class can only have 1 parent
        -> However, one class can be a parent to many other child classes
        Can parent class also inherit some members from a child?
        -> No, parent cannot inherit from child
        HOW TO PREVENT INHERITANCE?
        - By making class final

        What is IS-A-RELATIONSHIP?
        - Inheritance

        What is HAS-A-RELATIONSHIP?
        Book - Author

        METHOD OVERRIDING
        - it happens only in the child class, and usually it is
        implementing a different body to inherited method from parent
        - it is displayed with an @Override annotation, but it is optional

        body = implementation
        Method overriding vs Overloading
        - Overriding is implementing a different body to inherited
        method while overloading is having 2 or more methods with the
        same but different arguments
        - Overloading always occurs in the same class while overriding
        always occurs in different classes (child class)

        Why we need inheritance?
        - It is useful for code reusability: with the help of
        inheritance, we can reuse attributes and methods of a parent
        class when we create a new child class

        1. Encapsulation (private, getter, setter)
        2. Inheritance (extends, parent, child, override)
        3. Abstraction
        4. Polymorphism

        Encapsulation: it is used to hide sensitive data by breaking
        direct access (by making instance variable private) and
        providing indirect access (providing public getters and setters)
        Inheritance: it is the concept of sharing one class member with
        others by creating a parent-child relationship between them
        with the extends keyword

        3. Abstraction
        - it is almost same as inheritance, and actually it is possible
        with inheritance
        - Abstraction is known as hiding the implementation and showing
        only the functionality

        - In the abstraction, you define what needs to be done, but you
        don't define how to do it. The child class that extends to
        abstract class will provide how to do implementation.

        When we do inheritance, child class has option to use parent's
        class methods with its implementation without changing anything
        or it has option to modify the implementation per need.

        HOW TO ACHIEVE ABSTRACTION?
        1. Abstract Classes
        2. Interfaces

        HOW TO MAKE A CLASS ABSTRACT?
        - by using "abstract" keyword

        HOW TAO CREATE AN ABSTRACT METHOD?
        - by using "abstract" keyword

        WHAT IS ABSTRACT METHOD?
        - it is a method that has no body
        - we can have abstract methods only in abstract classes and
        interface

        CAN WE INSTANTIATE ABSTRACT CLASS?
        - No, we cannot create objects from the abstract classes
        NOTE: Interfaces cannot be instantiated as well
        NOTE: Even though we cannot create objects from abstract classes,
        it is still allowed to have constructor in the
        abstract class. The purpose of having these constructors is to
        be inherited to child classes
        NOTE: interface cannot have constructors

        WHAT IS THE PURPOSE OF HAVING ABSTRACT CLASSES AND ABSTRACT
        METHODS?
        - The meant to be inherited
        - you want to force child classes to provide some functions

        CAN ABSTRACT CLASS BE FINAL?
        - No, these are illegal combinations of access modifiers
        final: you cannot inherit
        abstract: whole purpose is to inherit

        CAN ABSTRACT METHOD BE FINAL?
        - No, abstract methods must be overridden in child while final
        methods cannot be overridden. So, these two modifiers can never
        be used together

        CAN ABSTRACT METHOD BE STATIC?
        No, abstract and static cannot be used together

        CAN ABSTRACT METHOD BE PRIVATE?
        No, abstract and private cannot be used together

        CAN ABSTRACT METHOD BE RETURN TYPE?
        Yes, it can be either void or return

        CAN ABSTRACT METHOD BE OVERLOADED?
        Yes, different arguments

        Abstract vs non-abstract classes

        SIMILARITIES:
        - both are created with class keyword
        - both can be inherited
            - abstract class is created to be inherited
            - we cannot make abstract class final
            - we can prevent regular class to be inherited with final keyword
        - they can have all class members including constructor
            - constructors we have in abstract class is used in the child's
        - both can have non-abstract methods

        DIFFERENCES:
        - abstract classes cannot be instantiated while we can create many
        objects from regular classes
        - we can have abstract methods only in abstract classes (and
        interfaces)
        - abstract class cannot be final while regular class can be final

        NOTE: If an abstract method added to abstract class lately, it must be
        implemented as well in the all child classes.

        Class: blueprint where we create many objects from
        Object: instance of a class

        Scanner: input, scan, scanner, inputReader
        Student: student1, student2, student3

        CLASS MEMBERS
        1. constructor -> it is a class member that allows us to create
        object
            - there is always a default constructor provided in classes
            - you can also create your custom constructors with args
            - it is always used next to "new" keyword
            - constructors can be overloaded with different arguments
            - constructors cannot be return or void
            - it always has same name with the class
        2. instance variables -> these are variables to store object
        information like attributes
            - these are class level variables
            - their scope is defined with access modifiers
        3. methods - functions -> these are behaviors
            - return type methods
            - void type methods
            NOTE: Both method types can have all access modifiers,
            static, or final
        4. blocks -> these members can be used to execute some blocks
        of code either before everything else or for each object being
        created
            - instance blocks
            - static blocks
        OOP PRINCIPLES
        1. Encapsulation
        - it is used to provide security for sensitive data
        - we can achieve encapsulation by making instance variables
        private and providing public getters and setters

        private int age;
        public void setAge(int age){
            if(age < 1 || age > 130) throw new RunTimeException();
            this.age = age;
        }



        2. Inheritance
        - it is one class being able to access-use parent class members
        - we can achieve with "extends" keyword
        - it increases code reusability
        - one parent may have many child classes
        - one child can have only one parent class
        - What is inherited from parent
            - public and protected members are always inherited
            - default is also inherited if the child class is in the same
            package
            - private members can never be inherited
        NOTE: Overriding: this happens when child class provides another
        body to the inherited method. It is simply only changing the body
        of the method
        3. Abstraction
        - it is known as hiding the implementation and providing the
        functionality. Abstraction makes sense to use with inheritance
        - Abstract classes cannot be instantiated
        - it allows us to have constructors, these constructors will
        be inherited and used in the child classes
        - Abstract class cannot be final
        - Abstract classes can have both abstract and concrete methods
        concrete = non-abstract method
        - Abstract methods = it is the method that has no body (implementation)
        - Abstract methods must be overridden in all child classes
            - abstract methods cannot be static, final or private

        HOW TO ACHIEVE ABSTRACTION?
        1. abstract classes
        2. interface

        - interfaces are used to define additional functions for child
        classes
        - Interfaces allow multiple inheritance meaning one class can
        implement many interfaces. Also, one interface can extend to many
        other interfaces.
        - interfaces cannot be instantiated, and they cannot have
        constructors
        - it is designed to have abstract methods. However, later versions
        of Java allows to have default and static methods in the
        interfaces
        - every member in the interface is always public by default
        - instance variables in an interface are always public static
        final by default

        SIMILARITIES BT abstract class and interface?
        - both are used to achieve abstraction
        - both cannot be instantiated
        - both can have abstract methods
        - if a child extends from an abstract class or implements an
        interface, all abstract methods from these parents must be
        overridden immediately

        DIFFERENCE BT abstract class and interface?
        - one class can extend to one abstract class while it can
        implement many interfaces. Single inheritance vs multiple
        inheritance
        - to extend from an abstract class, "extends" keyword is used but to
        implement an interface or more, "implements" keyword is used
        - abstract classes can have constructor, but interfaces cannot
        - in the abstract class, you can have private, default, protected,
        and public class members (methods, instance variables), but in the
        interfaces, you can have only public members.

        4. Polymorphism
        poly = many
        morph = shape or form
        - Polymorphism is many shapes or many forms

        There are 2 types of Polymorphism
        1. Static polymorphism - static binding - Compile time polymorphism
        - Ex: Overloading

        class A{
            method1(){

            }

            method1(int i){

            }
        }

        A a = new A();
        a.method1();
        a.method1(2);

        2. Dynamic polymorphism - dynamic binding - Runtime polymorphism
        - Ex: Overriding

        class B{
            method1(){
                // B class method
            }
        }

        class C extends B{
            @Override
            method1(){
                // C class method
            }
        }

        B b1 = new C();
        // Compiler will think that method1 in the class B will execute
        // Runtime will find out which method to execute exactly. Object
        being created is C and that is why it will execute the method
        overridden in the class C and the result will be "C class method"







         */



    }
}
