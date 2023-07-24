import java.util.List;

public class Task4 {

    public static double sum(List<? extends Number> list) {
        double total = 0.0;
        for (Number n : list) {
            total += n.doubleValue();
        }
        return total;
    }

    public static void main(String[] args) {
        List<Integer> intList = List.of(1, 2, 3, 4, 5);
        List<Number> numberList = List.of(1, 2.3, 3, 4.9, 5, 0.2);
        List<Double> doubleList = List.of(1.3, 2.3, 3.0, 4.9, 5.5, 0.2, 0.2);

        System.out.println("Sum of integers: " + sum(intList));
        System.out.println("Sum of numbers: " + sum(numberList));
        System.out.println("Sum of doubles: " + sum(doubleList));
    }
}