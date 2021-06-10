package regular_expression;

import java.util.regex.*;

public class ExpressionValidator {


    // url pattern
    private static Pattern urlPattern = Pattern.compile("^(www|http://www|https://www)\\.[a-z0-9]+\\.[a-z]{2,6}");
    // password pattern
    private static Pattern passwordPattern = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[.?!@#$&+=%]).{8,}$");
    // Email pattern
    private static Pattern emailPattern = Pattern.compile("^[a-z]+[a-z0-9\\-_.]+@[a-z]{2,}\\.[a-z]{2,6}$");

    public static boolean isValidUrl(String input){
        Matcher matcher = urlPattern.matcher(input);
        return matcher.matches();
    }

    public static boolean isValidPassword(String userPassword){
        Matcher matcher = passwordPattern.matcher(userPassword);
        return matcher.matches();
    }

    public static boolean isValidEmail (String userEmail){
        Matcher matcher = emailPattern.matcher(userEmail);
        return matcher.matches();
    }


}
