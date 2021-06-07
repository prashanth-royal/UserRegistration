import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class userRegistration {
    public static boolean validFirstName(String name) {
        String s ="^([A-Z][a-z]{3,30})$";
        Pattern p = Pattern.compile(s);
        Matcher m = p.matcher(name);
        return m.matches();
    }
    public static void main(String[] args) {
        String firstName="Prashanth";
        System.out.println(validFirstName(firstName));

    }
}
