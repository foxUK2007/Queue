import java.util.*;

public class Recipe {

    private Map<Product, Integer> listProducts;

    private String name;

    private double totalPrice;


    public Recipe(String name, double totalPrice) {
        this.name = name;
        this.totalPrice = totalPrice;
        this.listProducts = new HashMap();
    }

    public Map<Product, Integer> getListProducts() {
        return listProducts;
    }

    public void setListProducts(Map<Product, Integer> listProducts) {
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

    public void createRecipe(Product products, Integer value){
        value = value == 0 ? 1 : value;
        this.listProducts.put(products, value);
        for (Product product : this.listProducts.keySet() ) {
            this.totalPrice += product.getPrice() * this.listProducts.get(product);
        }
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

