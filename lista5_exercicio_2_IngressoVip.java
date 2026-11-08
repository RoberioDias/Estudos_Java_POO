public class IngressoVip extends Ingresso {

    private double adicionalVip;

    public IngressoVip(double valorBase, double adicionalVip) {
        super(valorBase);
        this.adicionalVip = adicionalVip;
    }

    @Override
    public double valorFinal() {
        return super.valorFinal() + adicionalVip;
    }
}