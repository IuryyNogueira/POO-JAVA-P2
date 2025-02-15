public class Product {

    private String name;
    private double price;
    private int stockQuantity;

    // Construtor principal: obriga a definição dos 3 atributos
    public Product(String name, double price, int stockQuantity) {

        if(name == null || name.trim().isEmpty())
            throw new IllegalArgumentException("Nome não pode ser vazio.");
        if(price < 0)
            throw new IllegalArgumentException("Preço não pode ser negativo.");
        if(stockQuantity < 0)
            throw new IllegalArgumentException("Estoque não pode ser negativo.");

        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    // Construtor sobrecarregado: inicia estoque com zero
    public Product(String name, double price) {
        this(name, price, 0);
    }

    // Getters e Setters com validação
    public String getName() { return name; }

    public void setName(String name) {
        if(name == null || name.trim().isEmpty())
            throw new IllegalArgumentException("Nome não pode ser vazio.");
        this.name = name;
    }

    public double getPrice() { return price; }

    public void setPrice(double price) {
        if(price < 0)
            throw new IllegalArgumentException("Preço não pode ser negativo.");
        this.price = price;
    }

    public int getStockQuantity() { return stockQuantity; }

    public void setStockQuantity(int stockQuantity) {
        if(stockQuantity < 0)
            throw new IllegalArgumentException("Estoque não pode ser negativo.");
        this.stockQuantity = stockQuantity;
    }

    @Override
    public String toString() {
        return name + " - R$ " + price + " (Estoque: " + stockQuantity + ")";
    }
}
