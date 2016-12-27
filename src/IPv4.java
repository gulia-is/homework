import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IPv4 {
    public static void main(String[] itishumster) {

        System.out.println(testIPv4("225.0.5.67.")); //true
        System.out.println(testIPv4("290.0.500.67.")); //false

    }

    public static boolean testIPv4(String testString) {

        Pattern p = Pattern.compile("[([0-9]{1,3})<= 255]\\.{4}");
        Matcher m = p.matcher(testString);
        System.out.println(testString + " ");
        return m.matches();

    }
}
