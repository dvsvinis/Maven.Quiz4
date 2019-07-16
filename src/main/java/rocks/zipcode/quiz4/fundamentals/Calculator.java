package rocks.zipcode.quiz4.fundamentals;

/**
 * @author leon on 21/12/2018.
 */
public class Calculator {
    public static Double squareRoot(Double value) {
        return Math.sqrt(value);
    }

    public static Double square(Double value) {
        return value * value;
    }

    public static Double[] squareRoots(Double... value) {
        Double[] array = new Double[value.length];
        for (int i = 0; i < value.length; i++){
            array[i] = squareRoot(value[i]);
        }
        return array;
    }

    public static Double[] squares(Double... values) {
        Double[] array = new Double[values.length];
        for (int i = 0; i < values.length; i++){
            array[i] = square(values[i]);
        }
        return array;
    }

    public static Double add(Double value1, Double value2) {
        return null;
    }

    public static Double subtract(Double value1, Double value2) {
        return null;
    }


    public static Double divide(Double divisor, Double dividend) {
        return null;
    }
}
