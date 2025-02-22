public class PessoaFisica extends Contribuinte {
    private double gastosSaude;

    public PessoaFisica(String nome, double rendaAnual, double gastosSaude) {
        super(nome, rendaAnual);
        if (gastosSaude < 0) {
            throw new IllegalArgumentException("Gastos com saúde não podem ser negativos.");
        }
        this.gastosSaude = gastosSaude;
    }

    public double getGastosSaude() {
        return gastosSaude;
    }

    @Override
    public double imposto() {
        double impostoBase;
        // Verifica a taxa de acordo com a renda anual
        if (getRendaAnual() <= 20000.0) {
            impostoBase = getRendaAnual() * 0.15;
        } else {
            impostoBase = getRendaAnual() * 0.25;
        }

        // Abate 50% dos gastos com saúde
        impostoBase -= (gastosSaude * 0.5);

        // Evita imposto negativo
        return Math.max(impostoBase, 0.0);
    }
}
