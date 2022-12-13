import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();

        String one = "Просто человек в очереди 1";
        String two = "Просто человек в очереди 2";
        String three = "Просто человек в очереди 3";
        String four = "Просто человек в очереди 4";
        String five = "Просто человек в очереди 5";
        String six = "Просто человек в очереди 6";
        String seven = "Просто человек в очереди 7";
        String eight = "Просто человек в очереди 8";
        String nine = "Просто человек в очереди 9";
        String ten = "Просто человек в очереди 10";
        String eleven = "Просто человек в очереди 11";
        String twelve = "Просто человек в очереди 12";

        Product bread = new Product("хлеб", 45.00, 0.6);
        Product milk = new Product("молоко", 50.00, 1.0);
        Product cheese = new Product("сыр", 200.00, 0.3);
        Product apples = new Product("яблоки", 150.00, 1.2);
        Product sourCream = new Product("сметана", 90.00, 0.45);
        Product eggs = new Product("яйца", 76.00, 10.0);


        Set<Product> products = new HashSet<>();

        milk.add(products);
        bread.add(products);



        Recipe scrambledEggs = new Recipe("яичница", 30.4);
        scrambledEggs.createRecipe(eggs,cheese);
    }






}
