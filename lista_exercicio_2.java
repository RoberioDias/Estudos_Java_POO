package aula_3;


import java.util.Locale;
import java.util.Scanner;




public class exercicio_aula_3 {
        public static void main (String[] args) {
                Locale.setDefault(Locale.US);
                Scanner sc = new Scanner (System.in);
                
                double raio;
                double area;
                
                double pi = 3.14159;
                
                System.out.println("Digite o raio do circulo");
                raio = sc.nextDouble();
                
                area = pi*(raio*raio);
                
                System.out.printf("%.4f", area);
                
        }
}