import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
      Locale.setDefault(Locale.US);
      Scanner sc = new Scanner (System.in);

      int horaI;
      int horaF;

        System.out.println("Digite a hora inicial do jogo: ");
      horaI = sc.nextInt();
      
        System.out.println("Digite a hora final do jogo: ");
      horaF = sc.nextInt();

     int duracao;
     
     if(horaI < 0 || horaI > 23 || horaF < 0 || horaF > 23){
     	System.out.println("Horario invalido!");
     }
     else if(horaF > horaI){
     	duracao = horaF - horaI;
     	
     	System.out.printf("O JOGO DUROU %d HORAS ", duracao);

     }
     else{
     	duracao = (24 - horaI) + horaF;
     	
         System.out.printf("O JOGO DUROU %d HORAS ", duracao);

     }
    
    }
}
