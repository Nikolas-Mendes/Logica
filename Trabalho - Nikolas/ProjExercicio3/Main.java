
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
        
        String nome;
        double peso;
        double altura;
        String resposta;
        double calculoImc;
        
        System.out.print("Digite seu nome: ");
        nome = opa.nextLine();
        System.out.print("\nDigite o seu peso: ");
        peso = opa.nextDouble();
        System.out.print("\nDigite a sua altura: ");
        altura = opa.nextDouble();
        
        calculoImc = peso / (altura * altura);
        if(calculoImc >= 18.5 && calculoImc <= 24.5){
         resposta = "Parabéns, você está no peso ideal!";
        }else{
            resposta = "Você não está no peso ideal";
        }
        
        System.out.print("\nResultado: "+resposta);
    }
}
