import javax.management.InstanceAlreadyExistsException;
import java.util.HashMap;
import java.util.Map;

public class Map1 {
    static Map<String, Integer> map = new HashMap<>();

    public static void add(String key, Integer value) throws InstanceAlreadyExistsException {

        if (!map.containsKey(key)) {
            map.put(key, value);
        } else if (map.containsKey(key) && map.containsValue(value)) {
            throw new InstanceAlreadyExistsException("Такой объект уже есть!");
        } else map.put(key, value);
    }

    public static void main(String[] args) throws InstanceAlreadyExistsException {
        add("str1", 2);
        add("str2", 1);
        add("str1", 2);
        add("str1", 5);
        map.entrySet().forEach(System.out::println);
    }
}

