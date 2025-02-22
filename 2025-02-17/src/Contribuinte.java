public abstract class Contribuinte {
    private String nome;
    private double rendaAnual;

    public Contribuinte(String nome, double rendaAnual) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome não pode ser vazio.");
        }
        if (rendaAnual < 0) {
            throw new IllegalArgumentException("A renda anual não pode ser negativa.");
        }
        this.nome = nome;
        this.rendaAnual = rendaAnual;
    }

    public String getNome() {
        return nome;
    }

    public double getRendaAnual() {
        return rendaAnual;
    }

    // Método abstrato que cada subclasse deverá implementar para calcular o imposto
    public abstract double imposto();
}
