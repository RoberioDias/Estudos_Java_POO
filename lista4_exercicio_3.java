import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite a matricula: ");
        int matricula = sc.nextInt();

        System.out.println("Possui desconto?");
        System.out.println("1 - Sim");
        System.out.println("2 - Não");

        int opcao = sc.nextInt();

        Aluno aluno;

        if (opcao == 1) {

            System.out.print("Informe o desconto: ");
            double desconto = sc.nextDouble();

            aluno = new Aluno(matricula, nome, desconto);

        } else {

            aluno = new Aluno(matricula, nome);
        }

        System.out.println(
            "Dados do aluno: " +
            aluno.getMatricula() + " " +
            aluno.getNome() + " " +
            aluno.getDescontoPercentual() + " " +
            aluno.getSaldoDevedor()
        );

        double valorBase = 500.00;

        aluno.gerarMensalidade(valorBase);

        System.out.println(
            "Gerando Mensalidade base de R$ 500,00 com desconto..."
        );

        System.out.println(
            "Dados atualizados: " +
            aluno.getMatricula() + " " +
            aluno.getNome() + " " +
            aluno.getDescontoPercentual() + " " +
            aluno.getSaldoDevedor()
        );

        System.out.print("Insira o valor do pagamento: ");
        double valor = sc.nextDouble();

        aluno.efetuarPagamento(valor);

        System.out.println(
            "Dados atualizados: " +
            aluno.getMatricula() + " " +
            aluno.getNome() + " " +
            aluno.getDescontoPercentual() + " " +
            aluno.getSaldoDevedor()
        );

        sc.close();
    }
}