import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RunExample {
    public static void main(String[] args) {

        Set<Example> examples = new HashSet<>();
        Random random = new Random();
        while (examples.size()<15){
            Example example = new Example(random.nextInt(2,9),random.nextInt(2,9) );
            examples.add(example);
            System.out.println(example);
        }
    }
}
