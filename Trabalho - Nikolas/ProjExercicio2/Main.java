
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
        
        String nomeFun;
        double valorHora;
        double cargaHoraria;
        double salario;
        
        System.out.print("Digite o nome do funcionario: ");
        nomeFun = opa.nextLine();
        System.out.print("Digite o seu valor por hora: ");
        valorHora = opa.nextDouble();
        System.out.print("Digite a carga horaria: ");
        cargaHoraria = opa.nextDouble();
        
        salario = valorHora * cargaHoraria;
        
        System.out.print("O "+nomeFun+ " tem como salario: R$"+salario);
    }
}
