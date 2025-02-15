public class Main {
    public static void main(String[] args) {

        // Criando alguns produtos de cada subclasse
        TV tv = new TV("Samsung", 2500.0, 55);
        Refrigerator fridge = new Refrigerator("Brastemp", 3000.0, 400);
        Stove stove = new Stove("Consul", 1200.0, 4);

        // Criando o carrinho de compras
        ShoppingCart carrinho = new ShoppingCart(123);

        // Adicionando produtos (note que o carrinho aceita qualquer Product)
        carrinho.addProduct(tv);
        carrinho.addProduct(fridge);
        carrinho.addProduct(stove);

        // Exibir carrinho
        System.out.println(carrinho);

        // Listando conteúdo do carrinho
        System.out.println("\nConteúdo do carrinho:");
        for (Product p : carrinho.getContents()) {
            System.out.println(" - " + p);
        }
    }
}
