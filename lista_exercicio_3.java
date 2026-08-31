import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
      Locale.setDefault(Locale.US);
      Scanner sc = new Scanner (System.in);

      int a;
      int b;
      int c;
      int d;
      
        System.out.println("Escreva  valor inteiro: ");
        a = sc.nextInt();

        System.out.println("Escreva outro valor inteiro: ");
        b = sc.nextInt();
        
        System.out.println("Escreva outro valor inteiro: ");
        c = sc.nextInt();

        System.out.println("Escreva outro valor inteiro: ");
        d = sc.nextInt();

        int diferenca = (a*b - c*d);

        System.out.println("DIFERENCA = " + diferenca );
  }
}        