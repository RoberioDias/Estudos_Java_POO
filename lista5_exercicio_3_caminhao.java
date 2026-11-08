public class Caminhao extends Veiculo {

    private int eixos;

    public Caminhao(String modelo, double quilometragem, int eixos) {
        super(modelo, quilometragem);
        this.eixos = eixos;
    }

    @Override
    public double calcularCustoManutencao() {
        return super.calcularCustoManutencao() + (eixos * 200);
    }
}