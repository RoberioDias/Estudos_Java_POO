import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
      Locale.setDefault(Locale.US);
      Scanner sc = new Scanner (System.in);

      int numero;
      double horas;
      double valor_hora;
      double salario;
      
        System.out.println("Escreva o numero do funcionario: ");
        numero = sc.nextInt();

        System.out.println("Escreva as horas trabalhadas: ");
        horas = sc.nextDouble();
        
        System.out.println("Escreva o valor que recebe por hora: ");
        valor_hora = sc.nextDouble();

        salario = horas*valor_hora;

        System.out.println("NUMERO = " + numero);
        System.out.printf("SALARIO = R$ %.2f", salario);
  }
}        