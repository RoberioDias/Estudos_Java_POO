public class Aluno {

    private int matricula;
    private String nome;
    private double desconto;
    private double saldo;

    public Aluno(int matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
        this.desconto = 0;
    }

    public Aluno(int matricula, String nome, double desconto) {
        this.matricula = matricula;
        this.nome = nome;
        this.desconto = desconto;
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public double getDescontoPercentual() {
        return desconto;
    }

    public double getSaldoDevedor() {
        return saldo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void gerarMensalidade(double valorBase) {
        saldo += valorBase - (desconto / 100 * valorBase);
    }

    public void efetuarPagamento(double valor) {
        saldo -= valor;
    }
}