
/**
 * Write a description of class Main here.
 *
 * @author (Nikolas Christo)
 * @version (02/06/2019)
 */
import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner opa = new Scanner(System.in);
        System.out.print("\f");
        
        double nota1;
        double nota2;
        double nota3;
        double media;
        
        System.out.print("------------//------------");
        System.out.print("\nDigite a primeira nota: ");
        nota1 = opa.nextDouble();
        System.out.print("\nDigite a segunda nota: ");
        nota2 = opa.nextDouble();
        System.out.print("\nDigite a terceira nota: ");
        nota3 = opa.nextDouble();
        System.out.print("------------//------------");
        
        media = (nota1 + nota2 + nota3) / 3;
        
        System.out.print("\nMedia: "+media);
    }
}
