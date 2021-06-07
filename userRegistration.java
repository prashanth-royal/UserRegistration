import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class userRegistration {
    public static boolean validFirstName(String name) {
        String s ="^([A-Z][a-z]{3,30})$";
        Pattern p = Pattern.compile(s);
        Matcher m = p.matcher(name);
        return m.matches();
    public static boolean validEmail(String text)
    {
        String s1 ="(^[a-zA-Z 1-9]+ *([.+-_]?[a-zA-Z 1-9]+)@([a-zA-Z 1-9][-]?)+[.][a-zA-Z ]{2,4}(.[a-zA-Z]{2})*$)";
        Pattern p=Pattern.compile(s1);
        Matcher m= p.matcher(text);
        return m.matches();

    }
    public static void main(String[] args) {
        String firstName="Prashanth";
        System.out.println(validFirstName(firstName));

        String lastName="Royal";
        System.out.println(validMatchesFirstName(lastName));

		  String email="prashanth.royal@bl.co.in";
        System.out.println(validEmail(email));    
}
}
