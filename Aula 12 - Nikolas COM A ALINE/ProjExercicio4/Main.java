
/**
 * Write a description of class Main here.
 *
 * @author (Nikolas Christo)
 * @version (03/06/2019)
 */
import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner opa = new Scanner(System.in);
        System.out.print("\f");
        
        byte opcao;
        double quantidade;
        double valorPagar;
        
        System.out.print("Digite \n1) Lata 350ml \n2) Garrafinhas 60ml \n3) Garrafa 2L");
        opcao = opa.nextByte();
        System.out.print("Digite a quantidade: ");
        quantidade = opa.nextDouble();
        
        switch(opcao){
            case 1:
                valorPagar = 2.80 * quantidade;
                break;
                
            case 2:
                valorPagar = 3.60 * quantidade;
                break;
                
            case 3:
                valorPagar = 6.50 * quantidade;
                break;
                
            default: 
                valorPagar = 0;
                break;
        }   
        
        System.out.print("\nResultado: "+valorPagar);
    }
}
