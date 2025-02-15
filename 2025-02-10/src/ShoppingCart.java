import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private int customerID;
    private List<Product> productList;

    public ShoppingCart(int customerID) {
        this.customerID = customerID;
        this.productList = new ArrayList<>();
    }

    public void addProduct(Product product) {
        if(product == null)
            throw new IllegalArgumentException("Produto não pode ser nulo.");

        productList.add(product);
    }

    public void removeProduct(Product product) {
        productList.remove(product);
    }

    public List<Product> getContents() {
        return new ArrayList<>(productList);
    }

    public int getItemCount() {
        return productList.size();
    }

    public double getTotalPrice() {
        double total = 0;
        for (Product product : productList) {
            total += product.getPrice();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Carrinho do Cliente " + customerID + " - Itens: " + getItemCount() + " - Total: R$ " + getTotalPrice();
    }
}
