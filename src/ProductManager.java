import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ProductManager {
    private final ArrayList<Product> products;

    public ProductManager() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void deleteProduct(String id) {
        products.removeIf(product -> product.getId().equals(id));
    }

    public void updateProduct(String id, String name, double price, double rating) {
        for (Product product : products) {
            if (product.getId().equals(id)) {
                product.setName(name);
                product.setPrice(price);
                product.setRating(rating);
                break;
            }
        }
    }

    public void displayProductsSortedByPrice() {
        Collections.sort(products, Comparator.comparingDouble(Product::getPrice));
        products.forEach(System.out::println);
    }

    public void displayProductsSortedByRating() {
        Collections.sort(products, Comparator.comparingDouble(Product::getRating).reversed());
        products.forEach(System.out::println);
    }
}