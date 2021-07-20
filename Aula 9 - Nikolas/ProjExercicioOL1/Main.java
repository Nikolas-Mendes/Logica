
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
        
        double valor1;
        double valor2;
        String resposta;
        
        System.out.print("Digite o primeiro valor: ");
        valor1 = opa.nextDouble();
        System.out.print("Digite o segundo valor: ");
        valor2 = opa.nextDouble();
        
        if(valor1 >= 100 && valor2 <=200){
            resposta = "Valor de pagamento à vista";
        }else if(valor1 >=55 && valor2 <= 80){
            resposta = "Valor de pagamento parcelado";
        }else{
            resposta = "Esse valor não é permitido!";       
        }
        
        System.out.println("\fQuanto deve pagar: "+resposta);
    }
}
