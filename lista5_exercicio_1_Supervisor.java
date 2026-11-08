public class Supervisor extends Funcionario {

    private double bonificacao;

    public Supervisor(String nome, double salarioBase, double bonificacao) {
        super(nome, salarioBase);
        this.bonificacao = bonificacao;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + bonificacao;
    }
}