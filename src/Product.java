import java.util.Objects;
import java.util.Set;

public class Product {

    private String title;

    private double price;

    private int amount;

    private Product products;

    public Product(String title, double price, int amount) {
        if (price <= 0 || amount <= 0 || title.isEmpty() || title.isBlank()) {
            throw new IllegalArgumentException("Заполните карточку товара полностью");
        } else {
            this.price = price;
            this.amount = amount;
            this.title = title;
        }
    }

    public void add(Set<Product> products) {
        if (products.contains(this)) {
            throw new IllegalArgumentException("Ты уже это взял!");
        }
        products.add(this);
    }

    public void remove(Set<Product> products) {
        products.remove(this);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        if (this.amount == 0.0) {
           this.amount=1;
        }
        this.amount = (int) amount;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product that = (Product) o;
        return title.equals(that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }

    @Override
    public String toString() {
        return "Products{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                '}';
    }
}


