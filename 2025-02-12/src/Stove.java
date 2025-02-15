public class Stove extends Product {
    private int burners; // número de bocas

    public Stove(String brand, double price, int burners) {
        super(brand, price);
        if (burners <= 0) {
            throw new IllegalArgumentException("Número de bocas deve ser maior que zero.");
        }
        this.burners = burners;
    }

    public int getBurners() {
        return burners;
    }

    @Override
    public String toString() {
        return super.toString() + ", Bocas: " + burners;
    }
}
