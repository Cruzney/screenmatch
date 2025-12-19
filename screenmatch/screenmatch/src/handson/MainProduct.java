package handson;

public class MainProduct {
    public static void main(String[] args) {
        Product product = new Product();
        product.setName("Laptop");
        product.setPrice(1500.00);

        Product product1 = new Product();
        product1.setName("Chupa Uva");
        product1.setPrice(30);

        System.out.println("Product: " + product.getName());
        System.out.println("Original Price: $" + product.getPrice());

        System.out.println("Product: " + product1.getName());
        System.out.println("Original Price: $" + product1.getPrice());

        double discountedPrice = product.applyDiscount(10); // Applying 10% discount
        System.out.println("Price after 10% discount: $" + discountedPrice);

        double discountedPrice2 = product1.applyDiscount(15); // Applying 10% discount
        System.out.println("Price after 15% discount: $" + discountedPrice2);
    }
}
