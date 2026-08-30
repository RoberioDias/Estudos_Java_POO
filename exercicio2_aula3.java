import java.util.Locale;
import java.util.Scanner;




public class exercicio_aula_3 {
        public static void main (String[] args) {
                Locale.setDefault(Locale.US);
                Scanner sc = new Scanner (System.in);
                
                int valor;
                
                System.out.println("Quantos minutos voce consumiu?");
                valor = sc.nextInt();
                
                //int tempo = valor-100;
                
                //double pagar = 100 + (tempo*2);
                
                
                
                
                if (valor  < 100) {
                        System.out.println("Valor aq ser pago: R$ 50,00 ");
                }
                else {
                        int tempo = valor-100;
                        
                        double pagar = 50 + (tempo*2);
                        System.out.printf("Valor a ser pago %.2f", pagar );
                }
        }
}
