package inheritance;

import java.util.ArrayList;

public class FoodTest {
    public static void main(String[] args) {
        /*
        create food object and define info

         */

        Food food1 = new Food();
        food1.name = "Sushi";
        food1.taste = "Delicious"; // direct access
        food1.isSpicy = true;
        food1.setOrganic(true); // indirect access

        System.out.println(food1.name);
        System.out.println(food1.isOrganic());
        System.out.println(food1);

        Vegetable vegetable1 = new Vegetable();
        vegetable1.name = "parsley";
        vegetable1.taste = "good";
        vegetable1.isSpicy = false;
        vegetable1.setOrganic(true);
        vegetable1.color = "green";

        System.out.println(vegetable1.name + " is " + vegetable1.color);
        System.out.println(vegetable1.isOrganic());
        System.out.println(vegetable1);

        /*
        create veg2 obj define only the name
        print this object
         */

        Vegetable vegetable2 = new Vegetable();
        vegetable2.name = "broccoli";
        System.out.println(vegetable2);

        /*
        1 food object -> sushi
        2 veg objects -> parsley, broccoli

        Count and print how many elements in the list has a name that has more
        than 5 characters

         */

        ArrayList<Food> allFood = new ArrayList<>();
        allFood.add(food1);
        allFood.add(vegetable1);
        allFood.add(vegetable2);

        System.out.println("\n-----Count Task enhanced for loop solution-----\n");
        int count = 0;
        for(Food food : allFood){
            if(food.name.length() > 5) count++;
        }
        System.out.println(count);

        System.out.println("\n-----Count Task BONUS solution-----\n");
        System.out.println(allFood.stream().filter(food -> food.name.length() > 5).count());



        System.out.println(allFood);


    }
}
