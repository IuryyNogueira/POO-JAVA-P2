import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account data");
        System.out.print("Number: ");
        int number = sc.nextInt();
        sc.nextLine(); // Consumir a quebra de linha

        System.out.print("Holder: ");
        String holder = sc.nextLine();

        System.out.print("Initial balance: ");
        double initialBalance = sc.nextDouble();

        System.out.print("Withdraw limit: ");
        double withdrawLimit = sc.nextDouble();

        // Instancia a conta
        Conta account = new Conta(number, holder, initialBalance, withdrawLimit);

        System.out.println();
        System.out.print("Enter amount for withdraw: ");
        double amount = sc.nextDouble();

        // Tenta efetuar o saque
        try {
            account.withdraw(amount);
            System.out.printf("New balance: %.2f%n", account.getBalance());
        }
        catch (IllegalArgumentException e) {
            // Captura e exibe a mensagem de erro definida no método withdraw
            System.out.println(e.getMessage());
        }
        finally {
            sc.close();
        }
    }
}
