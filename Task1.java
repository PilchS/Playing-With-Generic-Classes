public class Task1 {

    public static void main(String[] args) {

        Add<Integer> addIntegers = new AddIntegers();
        System.out.println("Integers: " + addIntegers.add(12,3));

        Add<Double> addDoubles = new AddDoubles();
        System.out.println("Doubles: " + addDoubles.add(30.9d,16.4d));

        Add<Long> addLongs = new AddLongs();
        System.out.println("Longs: " + addLongs.add(123456789l, 987654321l));
    }
}

interface Add<T extends Number> {
    T add(T number1, T number2);
}

class AddIntegers implements Add<Integer> {

    public Integer add(Integer no1, Integer no2) {
        return no1 + no2;
    }
}


class AddDoubles implements Add<Double> {

    public Double add(Double no1, Double no2) {
        return no1 + no2;
    }
}

class AddLongs implements Add<Long>{
    
    public Long add(Long no1, Long no2){
        return no1 + no2;
    }
}