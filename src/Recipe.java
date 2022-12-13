import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Recipe {

    private Set<Product> listProducts;

    private String name;

    private double totalPrice;


    public Recipe(String name, double totalPrice) {
        this.name = name;
        this.totalPrice = totalPrice;
        this.listProducts = new HashSet<>();
    }

    public Set<Product> getListProducts() {
        return listProducts;
    }

    public void setListProducts(Set<Product> listProducts) {
        this.listProducts = listProducts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void addRecipe(Set<Recipe> recipes){
        if(recipes.contains(this)){
            throw new RuntimeException("Такой рецепт уже добавлен.");
        } else {
            recipes.add(this);
        }
    }

    public void createRecipe(Product ... products){
        listProducts.addAll(Arrays.asList(products));
        System.out.println("Рецепт: " + name);
        for (Product product: products) {
            System.out.println("Состав продуктов: " + product.getTitle());
            totalPrice += product.getPrice();
        }
        System.out.println("Цена за одну порцию: " +totalPrice + " руб.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(name, recipe.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

