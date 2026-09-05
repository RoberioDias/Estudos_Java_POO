import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
      Locale.setDefault(Locale.US);
      Scanner sc = new Scanner (System.in);

      int produto;
      int qtd;

        System.out.println(" ( 1 ) Cachorro Quente | R$ 4.00\n ( 2 ) X-Salada | R$ 4.50\n ( 3 ) X-Bacon | R$ 5.00\n ( 4 ) Torrada simples | R$ 2.00\n ( 5 ) Refrigerante | R$ 1.50 ");
     
      System.out.println("\nDigite o codigo do produto: ");
      produto = sc.nextInt();
      
      System.out.println("Digite a quantidade wue deseja comprar: ");
      qtd = sc.nextInt();
      
      double valor;
      
      if(produto == 1){
        
        valor = 4.00*qtd;
        System.out.printf("TOTAL: R$ %.2f", valor);
      }
      else if(produto == 2){
      	
      	valor = 4.50*qtd;
      	System.out.printf("TOTAL: R$ %.2f", valor);
      }
      else if(produto == 3){
      	
      	valor = 5.00*qtd;
      	System.out.printf("TOTAL: R$ %.2f", valor);
      }
      else if(produto == 4){
      	
      	valor = 2.00*qtd;
      	System.out.printf("TOTAL: R$ %.2f", valor);
      }
      else if(produto == 5){
      	
      	valor = 1.50*qtd;
      	System.out.printf("TOTAL: R$ %.2f", valor);
      }else{
      	
      	System.out.println("Codigo do produto invalido!");
      }
    
    }
}
