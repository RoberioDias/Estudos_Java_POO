public class Produto {

    private int codigo;
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public Produto(int codigo, String nome, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = 0;
    }

    public Produto(int codigo, String nome, double preco, int quantidadeEstoque) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void entradaEstoque(int quantidade) {
        quantidadeEstoque += quantidade;
    }

    public void vender(int quantidade) {
        quantidadeEstoque -= quantidade;
    }
}