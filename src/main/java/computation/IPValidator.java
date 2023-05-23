package computation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IPValidator {
    private static final String IPREGEX = "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
    public static boolean validateInput(String input) {
        Pattern pattern = Pattern.compile(IPREGEX);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String ipAddress1 = "192.168.19.0";
        String ipAddress2 = "255.255.255.234";
        String ipAddress3 = "255.255.25";
        System.out.println(ipAddress1 + " is valid: "+ validateInput(ipAddress1));
        System.out.println(ipAddress2 + " is valid: "+validateInput(ipAddress2));
        System.out.println(ipAddress3 + " is valid: "+validateInput(ipAddress2));
    }
}
