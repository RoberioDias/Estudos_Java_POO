import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
      Locale.setDefault(Locale.US);
      Scanner sc = new Scanner (System.in);
      
      int numero;
     
	System.out.println("Digite um numero inteiro: ");
      numero = sc.nextInt();
      
      if(numero > 0){
      	System.out.println("NAO NEGATIVO");
      
    }else{
    	System.out.println("NEGATIVO");
		}
		
    }
}