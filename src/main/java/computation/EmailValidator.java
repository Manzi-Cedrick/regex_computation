package computation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {
    private static final String EMAIL_REGEX = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
    public static boolean validateInput(String input) {
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String input1 = "cedrickmanzii0@gmail.com";
        String input2 = "255.255.255.234";
        String input3 = "255.255.25";
        System.out.println(input1 + " is valid: " + validateInput(input1));
        System.out.println(input2 + " is valid: " + validateInput(input2));
        System.out.println(input3 + " is valid: " + validateInput(input3));
    }
}
