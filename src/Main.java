import product.Product;
import product.ProductManager;

public class Main {
    public static void main(String[] args) {
        System.out.println("Adicionando produtos...");
        Product laptop = new Product("Laptop", 1200.00);
        Product mouse = new Product("Mouse", 50.00);

        ProductManager.addProduct(laptop);
        ProductManager.addProduct(mouse);

        System.out.println("\nListando todos os produtos:");
        ProductManager.listProducts();

        System.out.println("\nRemovendo um produto...");
        ProductManager.removeProduct(1);

        System.out.println("\nListando novamente para verificar a remoção:");
        ProductManager.listProducts();
    }
}