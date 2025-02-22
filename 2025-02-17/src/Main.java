import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); // Usa ponto como separador decimal
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de contribuintes: ");
        int n = sc.nextInt();
        sc.nextLine(); // consumir quebra de linha

        List<Contribuinte> lista = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            System.out.println("\nContribuinte #" + i + ":");
            System.out.print("Pessoa Física ou Jurídica (f/j)? ");
            char tipo = sc.next().charAt(0);
            sc.nextLine(); // consumir quebra de linha

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Renda anual: ");
            double rendaAnual = sc.nextDouble();

            if (tipo == 'f') {
                System.out.print("Gastos com saúde: ");
                double gastosSaude = sc.nextDouble();

                Contribuinte c = new PessoaFisica(nome, rendaAnual, gastosSaude);
                lista.add(c);

            } else if (tipo == 'j') {
                System.out.print("Número de funcionários: ");
                int funcionarios = sc.nextInt();

                Contribuinte c = new PessoaJuridica(nome, rendaAnual, funcionarios);
                lista.add(c);

            } else {
                System.out.println("Tipo inválido! Pulei este contribuinte.");
                // Poderia tratar de forma mais robusta
            }
        }

        System.out.println("\nIMPOSTOS PAGOS:");
        double soma = 0.0;
        for (Contribuinte c : lista) {
            double valorImposto = c.imposto();
            System.out.printf("%s: R$ %.2f%n", c.getNome(), valorImposto);
            soma += valorImposto;
        }

        System.out.printf("\nTOTAL DE IMPOSTOS: R$ %.2f%n", soma);

        sc.close();
    }
}
