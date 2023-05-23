package computation;

public class LocalPhoneValidator {
    private static final String LOCAL_PHONE_REGEX = "^07\\d{8}$";
    private static final String INTERNATIONAL_REGEX = "^2507\\d{8}$";

    private static boolean phoneValidate(String input) {
        if (input.matches(LOCAL_PHONE_REGEX)) {
            System.out.println("Local number entered");
            return true;
        } else if (input.matches(INTERNATIONAL_REGEX)) {
            System.out.println("International number entered");
            return true;
        } else {
            System.out.println("Invalid number format");
            return false;
        }
    }

    public static void main(String[] args) {
        String tel1 = "0782341241";
        String tel2 = "250782341241";
        String tel3 = "078232342341241";
        System.out.println(tel1 + " is valid: "+ phoneValidate(tel1));
        System.out.println(tel2 + " is valid: "+ phoneValidate(tel2));
        System.out.println(tel3 + " is valid: "+ phoneValidate(tel3));
    }
}
