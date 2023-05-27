public class _01_Validate_A_String_As_A_Password {
    /*
    Write a method that takes a String and returns true or false
    Check if it has length of 8-16
    Has at least 1 uppercase letter
    Has at least 1 lowercase letter
    Has at least 1 digit
    Has at least 1 special character
    It should not have space

    Test data:
    Abcd123!

    Expected Output:
    True
     */

    //Solution without regex
    public static boolean validatePassword(String str){
        if(str.contains(" ") || str.length() < 8 || str.length() > 16) return false;

        boolean uppercase = false;
        boolean lowercase = false;
        boolean digit = false;
        boolean special = false;

        for (char c : str.toCharArray()) {
            if(Character.isUpperCase(c)) uppercase = true;
            else if(Character.isLowerCase(c)) lowercase = true;
            else if(Character.isDigit(c)) digit = true;
            else special = true;
        }

        return uppercase && lowercase && digit && special;

    }

    //Testing method
    public static void main(String[] args) {

        System.out.println(validatePassword("")); // false
        System.out.println(validatePassword("abc")); // false
        System.out.println(validatePassword("Abcd1234")); // false
        System.out.println(validatePassword("Abc12$")); // false
        System.out.println(validatePassword("Abc d12$5")); // false
        System.out.println(validatePassword("Abcd12$5djksadjhsadnjqkeh")); // false
        System.out.println(validatePassword("Abcd123!")); // true
    }
}
