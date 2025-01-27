package rocks.zipcode.quiz4.fundamentals;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
        StringBuilder str = new StringBuilder(string);
        int middle = string.length()/2;
        return str.charAt(middle);
    }

    public static String capitalizeMiddleCharacter(String str) {
        char c = getMiddleCharacter(str);
        char C = Character.toUpperCase(c);
        String s = Character.toString(C);
        return s;
    }

    public static String lowerCaseMiddleCharacter(String str) {
        StringBuilder sb = new StringBuilder(str);
        char ch = Character.toUpperCase(sb.charAt(str.length()/2));
        return sb.toString();
    }

    public static Boolean isIsogram(String str) {
        str = str.toLowerCase();
        int len = str.length();
        char[] arr = str.toCharArray();

        Arrays.sort(arr);
        for (int i = 0; i < len - 1; i++) {
            if (arr[i] == arr[i + 1])
                return false;
        }
        return true;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
            for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                return true;
            }
        }return false;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
        StringBuffer sb = new StringBuffer(str);
        for (int i = sb.length() - 2; i >= 0; i--)
            if (sb.charAt(i) == sb.charAt(i + 1))
                sb.deleteCharAt(i + 1);

        return sb.toString();
    }


    public static String invertCasing(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++)
        {
            char c = chars[i];
            if (Character.isUpperCase(c))
            {
                chars[i] = Character.toLowerCase(c);
            }
            else if (Character.isLowerCase(c))
            {
                chars[i] = Character.toUpperCase(c);
            }
        }
        return new String(chars);
    }

}