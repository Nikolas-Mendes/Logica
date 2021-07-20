
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
        
        byte codigo;
        int quantidade;
        double valorPagar;
        
        System.out.print("Digite \n1 - Sanduiche de Bah \n2 - Pastel de Vento \n3 - Suco de Tamarindo \n4 - Hotchê dog");
        codigo = opa.nextByte();
        System.out.print("\nDigite a quantidade: ");
        quantidade = opa.nextInt();
        
        switch(codigo){
            case 1:
                valorPagar = 3.20 * quantidade;
                break;
                
            case 2:
                valorPagar = 2.80 * quantidade;
                break;
                
            case 3:
                valorPagar = 0.90 * quantidade;
                break;
                
            case 4: 
                valorPagar = 4.50 * quantidade;
                break;
                
            default: 
                valorPagar = 0;           
        }    
        
        System.out.print("\nResultado: "+valorPagar);
    }
}
