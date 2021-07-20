
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
        
        int idade;
        String faixaEtaria;
        
        System.out.print("Digite a sua idade: ");
        idade = opa.nextInt();
        
        if(idade >= 5 && idade <= 10){
            faixaEtaria = "Criança";
        }else if(idade > 10 && idade <= 12){
            faixaEtaria = "Pré-Adolescente";
        }else if(idade > 12 && idade <= 17){
            faixaEtaria = "Adolescente";
        }else if(idade > 17 && idade <= 64){
            faixaEtaria = "Adulto";
        }else if(idade > 64){
            faixaEtaria = "Idoso";
        }else{
            faixaEtaria = "Bebê";            
        }   
        
        System.out.print("\fSua faixa etaria é: \n"+faixaEtaria);
    }
}
