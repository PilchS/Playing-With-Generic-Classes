import java.util.Comparator;
import java.util.Arrays;

public class Task3<T> implements Comparator<T> {

    public int compare(T o1, T o2) {
        if (o1 instanceof String) {
            return compareStrings((String) o1, (String) o2);
        } else if (o1 instanceof Integer) {
            return compareIntegers((Integer) o1, (Integer) o2);
        } else if (o1 instanceof Double) {
            return compareDoubles((Double) o1, (Double) o2);
        }
        return 0;
    }

    private int compareStrings(String s1, String s2) {
        int l1 = s1.length();
        int l2 = s2.length();
        if (l1 > l2) {
            return 1;
        } else if (l1 < l2) {
            return -1;
        } else {
            return s1.compareTo(s2);
        }
    }

    private int compareIntegers(Integer n1, Integer n2) {
        int digit1 = countNonZeroDigits(n1);
        int digit2 = countNonZeroDigits(n2);

        if (digit1 > digit2) {
            return 1;
        } else if (digit1 < digit2) {
            return -1;
        } else {
            return n1.compareTo(n2);
        }
    }

    private int compareDoubles(Double d1, Double d2) {
        int s1 = (int) (d1 * 100);
        int s2 = (int) (d2 * 100);

        if (s1 > s2) {
            return 1;
        } else if (s1 < s2) {
            return -1;
        } else {
            return d1.compareTo(d2);
        }
    }

    private int countNonZeroDigits(Integer num) {
        int count = 0;
        for (char c : num.toString().toCharArray()) {
            if (c != '0') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Task3<Object> comparator = new Task3<Object>();
        Integer[] intArray = { 4, 1, 9, 25, 1437, 49, 0, 3, 8 };
        Double[] doubleArray = { 7.5, 3.3, 3.1, 10.7, 5.6, 0.52};
        String[] stringArray = {"pepper", "banana", "mango", "orange", "grape","apple" };

        Arrays.sort(intArray, comparator);
        System.out.println("Sorted Integer array: " + Arrays.toString(intArray));

        Arrays.sort(doubleArray, comparator);
        System.out.println("Sorted Double array: " + Arrays.toString(doubleArray));

        Arrays.sort(stringArray, comparator);
        System.out.println("Sorted String array: " + Arrays.toString(stringArray));        
    }
}
    