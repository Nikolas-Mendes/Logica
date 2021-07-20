
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
        
        String nome;
        double salarioJan;
        double salarioFev;
        double salarioMar;
        double media;
        String resposta;
        
        System.out.print("Digite o seu nome: ");
        nome = opa.nextLine();
        System.out.print("\nDigite o salario de janeiro: ");
        salarioJan = opa.nextDouble();
        System.out.print("\nDigite o salario de fevereiro: ");
        salarioFev = opa.nextDouble();
        System.out.print("\nDigite o salario de março: ");
        salarioMar = opa.nextDouble();
        
        media = (salarioJan + salarioFev + salarioMar) / 3;
        if(media <= 1300){
            resposta = "Salario Baixo";
        }else if(media > 1300 && media <= 2000){
            resposta = "Salario Mediano";
        }else if(media > 2000 && media <= 4000){
            resposta = "Salario Razoável";
        }else if(media > 4000 && media <= 6000){
            resposta = "Salario Bom";
        }else if(media > 6000 && media <=10000){
            resposta = "Ótimo Salario";
        }else if(media > 10000){
            resposta = "Salario Excelente";
        }else{
            resposta = "inválido";
        }    
        
        System.out.print("\nMedia : "+media+"\nResultado: "+resposta);
    }
}
