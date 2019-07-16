package rocks.zipcode.quiz4.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {
        ArrayList<String> newList = new ArrayList<String>();
        int middle = values.length/2;
        String middleString = values[middle];
        return middleString;
    }

    public static String[] removeMiddleElement(String[] values) {
        return null;
    }


    public static String getLastElement(String[] values) {
        List<String> list = Arrays.asList(values);
        String last =  list.get(list.size() -1);
        return last;
    }

    public static String[] removeLastElement(String[] values) {

        ArrayList<String> newList = new ArrayList<String>();
        for (int i = 0; i < values.length - 1; i++) {
            newList.add(values[i]);
        }
        String[] stringArray = newList.toArray(new String[0]);
        return stringArray;
    }

}