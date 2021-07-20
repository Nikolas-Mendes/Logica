
/**
 * Write a description of class Main here.
 *
 * @author (Nikolas Christo)
 * @version (28/05/2019)
 */
import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner opa = new Scanner(System.in);
        System.out.print("\f");
        
        double numero1;
        double numero2;
        double numero3;
        double resposta;
        
        System.out.print("Digite o primeiro numero: ");
        numero1 = opa.nextDouble();
        System.out.print("\nDigite o segundo numero: ");
        numero2 = opa.nextDouble();
        System.out.println("\nDigite: \n1 - Somar \n2 - Multiplicar \n3 - Subtrair \n4 - Dobro do primeiro numero \n5 - Quadrado do segundo numero ");
        numero3 = opa.nextDouble();
        
        
        if(numero3 == 1){
            resposta = numero1 + numero2;
        }else if(numero3 == 2){
            resposta = numero1 * numero2;
        }else if(numero3 == 3){
            resposta = numero1 - numero2;
        }else if(numero3 == 4){
            resposta = numero1 * 2;
        }else if(numero3 == 5){
            resposta = Math.pow(numero2,2);
        }else{
            resposta = 0;
        }
        
        System.out.println("\fResultado: "+resposta);
    }
}
