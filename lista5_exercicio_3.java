import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Modelo do Veiculo:");
        String modelo = sc.nextLine();

        System.out.println("Quilometragem:");
        double quilometragem = sc.nextDouble();

        Veiculo v1 = new Veiculo(modelo, quilometragem);

        sc.nextLine();

        System.out.println("Modelo do Caminhao:");
        String modeloCaminhao = sc.nextLine();

        System.out.println("Quilometragem:");
        double kmCaminhao = sc.nextDouble();

        System.out.println("Quantidade de eixos:");
        int eixos = sc.nextInt();

        Veiculo v2 = new Caminhao(modeloCaminhao, kmCaminhao, eixos);

        sc.nextLine();

        System.out.println("Modelo do Veiculo Especial:");
        String modeloEspecial = sc.nextLine();

        System.out.println("Quilometragem:");
        double kmEspecial = sc.nextDouble();

        Veiculo v3 = new VeiculoEspecial(modeloEspecial, kmEspecial);

        System.out.printf("Custo de Manutencao: R$ %.2f%n", v1.calcularCustoManutencao());
        System.out.printf("Custo de Manutencao: R$ %.2f%n", v2.calcularCustoManutencao());
        System.out.printf("Custo de Manutencao: R$ %.2f%n", v3.calcularCustoManutencao());

        sc.close();
    }
}