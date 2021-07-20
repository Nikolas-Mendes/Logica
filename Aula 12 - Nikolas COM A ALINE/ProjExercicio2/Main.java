
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
        
        double valorCompra;
        double valorPagar;
        
        
        System.out.print("Digite o valor da compra: ");
        valorCompra = opa.nextDouble();
        
        if(valorCompra <=50){
            valorPagar = valorCompra;
        }else if(valorCompra > 50 && valorCompra <=100){
            valorPagar = valorCompra * 0.98;
        }else if(valorCompra > 100 && valorCompra <=200){
            valorPagar = valorCompra * 0.97;
        }else{
            valorPagar = valorCompra * 0.96;        
        }    
        
        System.out.print("\nResultado: "+valorPagar);
    }
}
