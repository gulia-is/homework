import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

    public static void main(String[] itishumster) {

        int j = 0;
        int k = 0;
        int l = 0;
        int n = 0;

        Random a = new Random();
        String m[] = new String[10];

        for (int i = 0; i < 10; i++) {
            m[i] = String.valueOf(a.nextInt(100000) - 0);
            System.out.println(m[i]);
        }

        System.out.println();

        for (int i = 0; i < 10; i++) {
            if (test2(m[i])) {
                j++;
                System.out.println(j);
            }
        }

        System.out.println();

        for (int i = 0; i < 10; i++) {
            if (test3(m[i])) {
                k++;
                System.out.println(k);
            }
        }

        System.out.println();

        for (int i = 0; i < 10; i++) {
            if (test4(m[i])) {
                l++;
                System.out.println(l);
            }
        }

        System.out.println();

        for (int i = 0; i < 10; i++) {
            if (test5(m[i])) {
                n++;
                System.out.println(n);
            }
        }
    }
    public static boolean test2(String testString) {
        Pattern p = Pattern.compile("\\d?[^(2|4|6|8){3}]\\d?");
        Matcher m = p.matcher(testString);
        System.out.println(testString + " ");
        return m.matches();
    }

    public static boolean test3(String testString) {
        Pattern p = Pattern.compile("(0|2|4|6|8){4,5}");
        Matcher m = p.matcher(testString);
        System.out.println(testString + " ");
        return m.matches();
    }

    public static boolean test4(String testString) {
        Pattern p = Pattern.compile("\\d?[^(0|2|4|6|8){2})|(^(1|3|5|7|9){2}]\\d?");
        Matcher m = p.matcher(testString);
        System.out.println(testString + " ");
        return m.matches();
    }

    public static boolean test5(String testString) {
        Pattern p = Pattern.compile("\\d?(0|2|4|6|8){2}\\d?(0|2|4|6|8){2}\\d?");
        Matcher m = p.matcher(testString);
        System.out.println(testString + " ");
        return m.matches();
    }

}
