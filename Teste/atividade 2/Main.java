
/**
 * Write a description of class Main here.
 *
 * @author (Nikolas Christo)
 * @version (26/05/2019)
 */
import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner opa = new Scanner(System.in);
        System.out.print("\f");
        
        int valorSaque;
        int notas100;
        int notas50;
        int notas20;
        int notas10;
        int notas5;
        
        System.out.println("Digite o valor de saque: ");
        valorSaque = opa.nextInt();
        
        notas100 = valorSaque / 100;
        notas50 = valorSaque %100 / 50;
        notas20 = valorSaque %100 %50/ 20;
        notas10 = valorSaque %100 %50 %20 / 10;
        notas5 = valorSaque %100 %50 %20 %10 / 5;
        
        System.out.println("\fQuantidade de notas de 100: "+notas100);
        System.out.println("Quantidade de notas de 50: "+notas50);
        System.out.println("Quantidade de notas de 20: "+notas20);
        System.out.println("Quantidade de notas de 10: "+notas10);
        System.out.println("Quantidade de notas de 5: "+notas5);
        
    }
}
