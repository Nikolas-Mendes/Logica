
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
        
        String nome;
        double nota1;   
        double nota2;
        double frequencia;
        double media;
        String resposta;
        
        System.out.print("Digite o seu nome: ");
        nome = opa.nextLine();
        System.out.print("Digite a primeira nota: ");
        nota1 = opa.nextDouble();
        System.out.print("Digite a segunda nota: ");
        nota2 = opa.nextDouble();
        System.out.print("Digite a frequencia: ");
        frequencia = opa.nextDouble();
        
        media = (nota1 + nota2) / 2;
        if(media >= 6 && frequencia <= 75){
            resposta = "Aprovado";
        }else{
            resposta = "Reprovado";                      
        }
        
        System.out.println("\fMedia: "+media+ "\nResultado: "+resposta);
    }
}
