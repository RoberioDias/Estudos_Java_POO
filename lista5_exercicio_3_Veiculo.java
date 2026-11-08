public class Veiculo {

    protected String modelo;
    protected double quilometragem;

    public Veiculo(String modelo, double quilometragem) {
        this.modelo = modelo;
        this.quilometragem = quilometragem;
    }

    public double calcularCustoManutencao() {
        return quilometragem * 0.15;
    }
}