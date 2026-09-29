import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o código do produto: ");
        int codigo = sc.nextInt();

        sc.nextLine();

        System.out.print("Insira o nome do produto: ");
        String nome = sc.nextLine();

        System.out.print("Insira o preço unitário: ");
        double preco = sc.nextDouble();

        System.out.println("Deseja cadastrar estoque inicial?");
        System.out.println("1 - Sim");
        System.out.println("2 - Não");

        int opcao = sc.nextInt();

        Produto produto;

        if (opcao == 1) {

            System.out.print("Insira a quantidade inicial: ");
            int quantidade = sc.nextInt();

            produto = new Produto(codigo, nome, preco, quantidade);

        } else {

            produto = new Produto(codigo, nome, preco);

        }

        System.out.println(
            "Dados do produto: Código: " + produto.getCodigo()
            + ", Nome: " + produto.getNome()
            + ", Preço: R$ " + produto.getPreco()
            + ", Estoque: " + produto.getQuantidadeEstoque()
            + " unidades"
        );

        System.out.print("Insira a quantidade para dar entrada no estoque: ");
        int quantidadeEntrada = sc.nextInt();

        produto.entradaEstoque(quantidadeEntrada);

        System.out.println(
            "Dados atualizados: Código: " + produto.getCodigo()
            + ", Nome: " + produto.getNome()
            + ", Preço: R$ " + produto.getPreco()
            + ", Estoque: " + produto.getQuantidadeEstoque()
            + " unidades"
        );

        System.out.print("Insira a quantidade vendida: ");
        int quantidadeVendida = sc.nextInt();

        produto.vender(quantidadeVendida);

        System.out.println(
            "Dados atualizados: Código: " + produto.getCodigo()
            + ", Nome: " + produto.getNome()
            + ", Preço: R$ " + produto.getPreco()
            + ", Estoque: " + produto.getQuantidadeEstoque()
            + " unidades"
        );

        sc.close();
    }
}