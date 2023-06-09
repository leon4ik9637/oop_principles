package encapsulation;

public class CompanyTest {
    public static void main(String[] args) {
        /*
        Create company1 and company2 objects and set all of their info
         */

        Company company1 = new Company();
        company1.setName("Apple");
        company1.setAddress("California");
        company1.setPhoneNumber("(123) 312-2345");

        Company company2 = new Company();
        company2.setName("Google");
        company2.setAddress("California");
        company2.setPhoneNumber("(000) 055-5555");


        System.out.println(company1);
        System.out.println(company2);

        System.out.println("Company 1 is = \"" + company1.getName() + "\" and" +
                " company 2 is = \"" + company2.getName() + "\"");


    }
}
