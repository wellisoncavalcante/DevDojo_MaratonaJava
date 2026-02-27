package javacore.Npolimorfismo.dominio;

public class Notebook extends Produto {
    public static final double IMPOSTO = 0.15;
    private String armazenamento;
    public Notebook(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do Notebook");
        return this.valor * IMPOSTO;
    }

    public String getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(String armazenamento) {
        this.armazenamento = armazenamento;
    }
}
