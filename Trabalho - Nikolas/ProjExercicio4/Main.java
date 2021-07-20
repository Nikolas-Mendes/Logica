
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
        
        double salarioFixo;
        double valorVenda;
        double comissao;
        double salarioFinal;
        
        
        System.out.print("Digite o salario fixo: ");
        salarioFixo = opa.nextDouble();
        System.out.print("Digite o valor de venda: ");
        valorVenda = opa.nextDouble();
        
        comissao = salarioFixo * 0.04;
        salarioFinal = valorVenda * comissao;
        
        System.out.print("Comissão: "+comissao+ "\nSalario final: "+salarioFinal);
    }
}
