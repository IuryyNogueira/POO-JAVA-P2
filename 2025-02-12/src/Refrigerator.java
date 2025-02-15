public class Refrigerator extends Product {

    private int size; // capacidade em litros

    public Refrigerator(String brand, double price, int size) {
        super(brand, price);
        if (size <= 0) {
            throw new IllegalArgumentException("Capacidade deve ser maior que zero.");
        }
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return super.toString() + ", Capacidade: " + size + " litros";
    }
}
