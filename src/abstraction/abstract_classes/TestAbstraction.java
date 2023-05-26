package abstraction.abstract_classes;

import java.util.ArrayList;
import java.util.List;

public class TestAbstraction {
    public static void main(String[] args) {

        /*
        Create an obj of sam called s1
        info it will have as below

        Samsung
        Black
        64
        700
         */
        Samsung s1 = new Samsung("Samsung", "Black", 64, 700.0);
        Nokia n1 = new Nokia("Nokia", "Blue", 4, 100.0);
        IPhone i1 = new IPhone("Apple", "Silver", 128, 1000.0);


        List<Phone> phones = new ArrayList<>();
        phones.add(s1);
        phones.add(n1);
        phones.add(i1);

        /*
        print all objects
        fond and print most expensive
         */

        int countConvertibles = 0;
        double mostExpensive = Double.MIN_VALUE;
        Phone mostExpensivePhone = null;

        for (Phone phone : phones) {
            System.out.println(phone);
            if(phone.isConvertible()) countConvertibles++;
            if(phone.price > mostExpensive) mostExpensivePhone = phone;
        }
        System.out.println(countConvertibles);
        System.out.println("The most expensive phone is = " + mostExpensivePhone.getClass().getSimpleName());

        System.out.println(IPhone.OS); // invoking static instance variables
        System.out.println(Samsung.OS);
        System.out.println(Nokia.OS);

        for (Phone phone : phones) {
            phone.call();
            phone.ring();
            phone.text();
        }

    }
}
