package encapsulation;

import java.util.Scanner;

public class EmployeeClub {
    public static void main(String[] args) {
        /*
        Write a program that asks an employee to enter their information age,
        address and fullName
        Test data:
        fullName = Alex Robert
        address 1234 Abc St, Chicago IL 12345
        age = 32
        Print "{fullName} is in the club" if the user is from Chicago and
        age is more than 21
        Print "{fullName} is not in the club" otherwise
        Output:
        Alex Robert is in the club
         */

        Scanner input = new Scanner(System.in);
        Employee employee1 = new Employee();
        System.out.println("What is your full name?");
        employee1.setFullName(input.nextLine());

        System.out.println("What is your age?");
        employee1.setAge(input.nextInt());

        input.nextLine();

        System.out.println("What is your address?");
        employee1.setAddress(input.nextLine());

        if(employee1.getAddress().toLowerCase().contains("chicago") && employee1.getAge() > 21){
            System.out.println(employee1.getFullName() + " is in the club and age is more than 21");
        }else{
            System.out.println(employee1.getFullName() + " is not in the club");
        }




    }
}
