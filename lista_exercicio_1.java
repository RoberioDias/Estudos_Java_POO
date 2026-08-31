import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
      Locale.setDefault(Locale.US);
      Scanner sc = new Scanner (System.in);

      int a;
      int b;
      
        System.out.println("Escreva  valor inteiro: ");
        a = sc.nextInt();

        System.out.println("Escreva outro valor inteiro: ");
        b = sc.nextInt();

        int c = a + b;

        System.out.println("SOMA = " + c );
  }
}        