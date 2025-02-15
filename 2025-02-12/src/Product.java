public class Product {

    private String brand;  // era "name" no exemplo anterior, mas agora de "brand"
    private double price;

    // Construtor principal
    public Product(String brand, double price) {
        if (brand == null || brand.trim().isEmpty()) {
            throw new IllegalArgumentException("Marca não pode ser vazia.");
        }
        if (price < 0) {
            throw new IllegalArgumentException("Preço não pode ser negativo.");
        }
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Marca: " + brand + ", Preço: R$ " + price;
    }
}
