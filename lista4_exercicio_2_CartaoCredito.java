public class CartaoCredito {

    private int numero;
    private String titular;
    private double limite;
    private double fatura;

    public CartaoCredito(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
        this.limite = 200.00;
        this.fatura = 0.00;
    }

    public CartaoCredito(int numero, String titular, double limite) {
        this.numero = numero;
        this.titular = titular;
        this.limite = limite;
        this.fatura = 0.00;
    }

    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public double getLimite() {
        return limite;
    }

    public double getFatura() {
        return fatura;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void comprar(double valor) {
        fatura += valor + 1.50;
    }

    public void pagarFatura(double valor) {
        fatura -= valor;
    }
}