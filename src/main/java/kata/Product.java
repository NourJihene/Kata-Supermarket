package kata;

public class Product {

    final private String productName;
    final private Amount unitPrice;

    public Product(String productName, Amount unitPrice) {

        this.productName = productName;
        this.unitPrice = unitPrice;
    }

    public String getProductName() {
        return productName;
    }

    public Amount getUnitPrice() {
        return unitPrice;
    }
}
