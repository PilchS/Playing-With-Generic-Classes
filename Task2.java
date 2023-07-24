public class Task2<T extends Comparable<? super T>> {
    public static void main(String[] args) {

        Integer[] arrayOfIntegers = {4, 1, 9, 25, 1437, 49, 0, 3, 8};
        Task2<Integer> intSorter = new Task2<>();
        intSorter.bubbleSort(arrayOfIntegers);
        System.out.println("Integers: " + java.util.Arrays.toString(arrayOfIntegers));

        Double[] arrayOfDoubles = {7.5, 3.3, 3.1, 10.7, 5.6, 0.52};
        Task2<Double> doubleSorter = new Task2<>();
        doubleSorter.bubbleSort(arrayOfDoubles);
        System.out.println("Doubles: " + java.util.Arrays.toString(arrayOfDoubles));

        String[] arrayOfStrings = {"pepper", "banana", "mango", "orange", "grape","apple"};
        Task2<String> stringSorter = new Task2<>();
        stringSorter.bubbleSort(arrayOfStrings);
        System.out.println("Strings: " + java.util.Arrays.toString(arrayOfStrings));
    }

    void bubbleSort(T[] array) {
        int n = array.length;
        while (n > 0) {
            int x = 0;
            for (int y = 1; y < n; y++) {
                if (array[y - 1].compareTo(array[y]) > 0) {
                    T temp = array[y - 1];
                    array[y - 1] = array[y];
                    array[y] = temp;
                    x = y;
                }
            }
            n = x;
        }
    }
}