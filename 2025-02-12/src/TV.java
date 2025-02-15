public class TV extends Product {

    private int inches;

    public TV(String brand, double price, int inches) {
        super(brand, price); // chama o construtor de Product
        if (inches <= 0) {
            throw new IllegalArgumentException("Polegadas devem ser maiores que zero.");
        }
        this.inches = inches;
    }

    public int getInches() {
        return inches;
    }

    @Override
    public String toString() {
        // aproveita o toString() de Product e acrescenta as polegadas
        return super.toString() + ", Polegadas: " + inches;
    }
}
