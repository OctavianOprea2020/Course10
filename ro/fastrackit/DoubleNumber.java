package ro.fastrackit;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DoubleNumber {

    public static final String doublePattern= "^[+\\-]{0,1}[0-9]+[\\.][0-9]+$";

    public static void main(String[] args) {

        String[] doubles = {"123.4", "-100.0", "+2000", "0.799", "+10.23", "500", "99.", ".287"};
        for (String i : doubles) {
          System.out.println("Is nr " + i + " a double? " + isDoublePattern(i, doublePattern));
        }
    }

    private static boolean isDoublePattern(String str, String pattern) {
        if (str == null || str.trim().length() == 0)
            return false;

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(str);
        return m.matches();
    }

}
