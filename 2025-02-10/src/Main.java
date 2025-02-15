import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Teste do Carrinho de Compras ===");

        // Criando produtos
        Product p1 = new Product("Celular", 1500.00, 10);
        Product p2 = new Product("Fone de Ouvido", 200.00, 20);
        Product p3 = new Product("Notebook", 3500.00, 5);
        Product p4 = new Product("Mouse Gamer", 150.00, 30);

        // Criando o carrinho de um cliente (ID 123)
        ShoppingCart carrinho = new ShoppingCart(123);

        // Adicionando produtos ao carrinho
        System.out.println("\n>>> Adicionando produtos...");
        carrinho.addProduct(p1);
        carrinho.addProduct(p2);
        carrinho.addProduct(p3);

        // Exibindo conteúdo do carrinho
        System.out.println(carrinho);

        // Testando remoção de um produto
        System.out.println("\n>>> Removendo um produto...");
        carrinho.removeProduct(p2);
        System.out.println(carrinho);

        // Tentando remover um produto que não está no carrinho
        System.out.println("\n>>> Tentando remover um produto inexistente...");
        carrinho.removeProduct(p4);
        System.out.println(carrinho);

        // Adicionando mais produtos e verificando o total
        System.out.println("\n>>> Adicionando mais produtos...");
        carrinho.addProduct(p4);
        System.out.println(carrinho);

        // Listando os produtos do carrinho
        System.out.println("\n>>> Listando produtos no carrinho:");
        List<Product> items = carrinho.getContents();
        for (Product p : items) {
            System.out.println("- " + p);
        }

        // Exibindo o total de itens e o valor final
        System.out.println("\n>>> Resumo final:");
        System.out.println("Total de Itens: " + carrinho.getItemCount());
        System.out.println("Valor Total: R$ " + carrinho.getTotalPrice());
    }
}
