import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Valor Base dos Ingressos:");
        double valorBase = sc.nextDouble();

        Ingresso i1 = new Ingresso(valorBase);

        System.out.println("Adicional VIP:");
        double adicionalVip = sc.nextDouble();

        Ingresso i2 = new IngressoVip(valorBase, adicionalVip);

        System.out.printf("Valor do Ingresso 1: R$ %.2f%n", i1.valorFinal());
        System.out.printf("Valor do Ingresso 2: R$ %.2f%n", i2.valorFinal());

        sc.close();
    }
}