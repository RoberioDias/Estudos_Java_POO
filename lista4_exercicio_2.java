import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o número do cartão: ");
        int numero = sc.nextInt();

        sc.nextLine();

        System.out.print("Insira o nome do titular: ");
        String titular = sc.nextLine();

        System.out.println("Deseja solicitar limite de crédito inicial personalizado?");
        System.out.println("1 - Sim");
        System.out.println("2 - Não");

        int opcao = sc.nextInt();

        CartaoCredito cartao;

        if (opcao == 1) {

            System.out.print("Insira o limite inicial: ");
            double limite = sc.nextDouble();

            cartao = new CartaoCredito(numero, titular, limite);

        } else {

            cartao = new CartaoCredito(numero, titular);

        }

        System.out.println(
            "Dados do cartão: Cartão " + cartao.getNumero()
            + ", Titular: " + cartao.getTitular()
            + ", Limite: R$ " + cartao.getLimite()
            + ", Fatura Atual: R$ " + cartao.getFatura()
        );

        System.out.print("Insira o valor da compra: ");
        double valorCompra = sc.nextDouble();

        cartao.comprar(valorCompra);

        System.out.println(
            "Dados do cartão atualizados: Cartão " + cartao.getNumero()
            + ", Titular: " + cartao.getTitular()
            + ", Limite: R$ " + cartao.getLimite()
            + ", Fatura Atual: R$ " + cartao.getFatura()
        );

        System.out.print("Insira o valor do pagamento da fatura: ");
        double valorPagamento = sc.nextDouble();

        cartao.pagarFatura(valorPagamento);

        System.out.println(
            "Dados do cartão atualizados: Cartão " + cartao.getNumero()
            + ", Titular: " + cartao.getTitular()
            + ", Limite: R$ " + cartao.getLimite()
            + ", Fatura Atual: R$ " + cartao.getFatura()
        );

        sc.close();
    }
}