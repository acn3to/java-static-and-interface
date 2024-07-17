package product;

import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    private static final List<Product> products = new ArrayList<>();

    public static void addProduct(Product product) {
        products.add(product);
    }

    public static void removeProduct(int index) {
        if (index >= 0 && index < products.size()) {
            products.remove(index);
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public static void listProducts() {
        for (Product product : products) {
            System.out.println(product.toString());
        }
    }
}
