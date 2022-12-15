import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

public class Map3 {

    public static void main(String[] args) {
        Map<Integer, String> map = new LinkedHashMap<>();
        Random random = new Random();
        map.put(random.nextInt(100), "первое значение");
        map.put(random.nextInt(100), "второе значение");
        map.put(random.nextInt(100), "третье значение");
        map.put(random.nextInt(100), "четвертое значение");
        map.put(random.nextInt(100), "пятое значение");
        map.put(random.nextInt(100), "шестое значение");
        map.put(random.nextInt(100), "седьмое значение");
        map.put(random.nextInt(100), "восьмое значение");
        map.put(random.nextInt(100), "девятое значение");
        map.put(random.nextInt(100), "десятое значение");

        map.entrySet().forEach(System.out::println);
    }
}
