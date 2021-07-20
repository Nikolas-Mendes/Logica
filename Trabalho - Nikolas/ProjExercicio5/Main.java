
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
        double nota1;
        double nota2;
        double nota3;
        double nota4;
        double media;
        String resposta;
        
        System.out.print("Digite a primeira nota: ");
        nota1 = opa.nextDouble();
        System.out.print("Digite a segunda nota: ");
        nota2 = opa.nextDouble();
        System.out.print("Digite a terceira nota: ");
        nota3 = opa.nextDouble();
        System.out.print("Digite a quarta nota: ");
        nota4 = opa.nextDouble();
        
        media = (nota1 + nota2 + nota3 + nota4) / 4;
        if(media >= 0 && media < 4){
            resposta = "Ruim, conceito D";
        }else if(media >= 4 && media < 6){
            resposta = "Regular, conceito C";
        }else if(media >= 6 && media < 9){
            resposta = "Bom, conceito B";
        }else if(media >= 9){
            resposta = "Ótimo, conceito A";
        }  
        
        System.out.println("Media = "+media+ "\n Resultado = "+resposta);
    }
}
