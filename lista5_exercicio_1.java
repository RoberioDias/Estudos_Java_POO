import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Nome do Funcionario:");
        String nome = sc.nextLine();

        System.out.println("Salario Base:");
        double salarioBase = sc.nextDouble();

        Funcionario f1 = new Funcionario(nome, salarioBase);

        sc.nextLine();

        System.out.println("Nome do Supervisor:");
        String nomeSupervisor = sc.nextLine();

        System.out.println("Salario Base:");
        double salarioSupervisor = sc.nextDouble();

        System.out.println("Bonificacao:");
        double bonificacao = sc.nextDouble();

        Supervisor s1 = new Supervisor(nomeSupervisor, salarioSupervisor, bonificacao);

        System.out.printf("Salario Final Funcionario: R$ %.2f%n", f1.calcularSalario());
        System.out.printf("Salario Final Supervisor: R$ %.2f%n", s1.calcularSalario());

        sc.close();
    }
}