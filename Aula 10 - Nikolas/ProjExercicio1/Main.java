
/**
 * Write a description of class Main here.
 *
 * @author (Nikolas Christo)
 * @version (29/05/2019)
 */
import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner opa = new Scanner(System.in);
        System.out.print("\f");
         
        double altura;
        byte sexo;
        double peso;
        String resultado;
        
        System.out.print("Digite a altura: ");
        altura = opa.nextDouble();
        System.out.print("Digite \n1 - Masculino \n2 - Feminino");
        sexo = opa.nextByte();
        
        if(sexo == 1){
            resultado = "Seu peso ideal: ";
            peso = ((72.7 * altura) -58);
        }else if(sexo == 2){
            resultado = "Seu peso ideal: ";
            peso = ((62.1 * altura) -44.7);
        }else{
            resultado = "Inválido";
            peso = 0;
        }
        
        System.out.println("\fSua altura é: "+altura+ "\n"  + resultado + " " +peso);
        
            
            
            
        }    
    }

