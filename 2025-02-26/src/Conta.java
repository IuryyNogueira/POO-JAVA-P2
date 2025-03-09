public class Conta {

    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Conta(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    // Getters para acesso a dados
    public Integer getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    // Método de depósito (opcional, se quiser incluir)
    public void deposit(double amount) {
        balance += amount;
    }

    /**
     * Método de saque:
     * - Verifica se o valor excede o limite de saque.
     * - Verifica se o valor excede o saldo disponível.
     * - Caso não exceda, subtrai do saldo.
     */
    public void withdraw(double amount) {
        // Regra 1: valor do saque não pode exceder o limite
        if (amount > withdrawLimit) {
            throw new IllegalArgumentException(
                    "Withdraw error: The amount exceeds withdraw limit"
            );
        }

        // Regra 2: valor do saque não pode exceder o saldo
        if (amount > balance) {
            throw new IllegalArgumentException(
                    "Withdraw error: Not enough balance"
            );
        }

        // Se passou pelas validações, efetua o saque
        balance -= amount;
    }
}
