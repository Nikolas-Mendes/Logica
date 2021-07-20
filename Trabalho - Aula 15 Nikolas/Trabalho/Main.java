
/**
 * Write a description of class Main here.
 *
 * @author (Nikolas, Lucas Lewis)
 * @version (06/06/2019)
 */
import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner opa = new Scanner(System.in);
        System.out.print("\f");
        
        String nome;
        byte diaNascimento;
        byte mesNascimento;
        int anoNascimento;
        double dataNascimento;
        byte diaAtual;
        byte mesAtual;
        int anoAtual;
        double dataAtual;
        int idade;
        String signo;
        String resposta;
        
        System.out.print("Nome: ");
        nome = opa.nextLine();
        System.out.print("Digite a dia de nascimento: ");
        diaNascimento = opa.nextByte();
        System.out.print("Digite o mes de nascimento: ");
        mesNascimento = opa.nextByte();
        System.out.print("Digite o ano nascimento: ");
        anoNascimento = opa.nextInt();
        System.out.print("Digite o dia atual: ");
        diaAtual = opa.nextByte();
        System.out.print("Digite o mes atual: ");
        mesAtual = opa.nextByte();
        System.out.print("Digite o ano atual: ");
        anoAtual = opa.nextInt();
        
        if(mesAtual < mesNascimento || (mesNascimento == mesAtual && diaAtual < diaNascimento)){
            idade = anoAtual - anoNascimento - 1;
        }else{
            idade = anoAtual - anoNascimento;
        }
        
        if(mesNascimento == 3 && diaNascimento >= 21 && diaNascimento <= 31 || mesNascimento == 4 && diaNascimento >= 1 && diaNascimento <= 19){
            signo = "Áries";
        }else if(mesNascimento == 4 && diaNascimento >= 20 && diaNascimento <= 31 || mesNascimento == 5 && diaNascimento >= 1 && diaNascimento <= 20){
            signo = "Touro";
        }else if(mesNascimento == 5 && diaNascimento >= 21 && diaNascimento <= 31 || mesNascimento == 6 && diaNascimento >= 1 && diaNascimento <= 20){
            signo = "Gêmeos";
        }else if(mesNascimento == 6 && diaNascimento >= 21 && diaNascimento <= 31 || mesNascimento == 7 && diaNascimento >= 1 && diaNascimento <= 22){
            signo = "Câncer";
        }else if(mesNascimento == 7 && diaNascimento >= 23 && diaNascimento <= 31 || mesNascimento == 8 && diaNascimento >= 1 && diaNascimento <= 22){
            signo = "Leão";
        }else if(mesNascimento == 8 && diaNascimento >= 23 && diaNascimento <= 31 || mesNascimento == 9 && diaNascimento >= 1 && diaNascimento <= 22){
            signo = "Virgem";
        }else if(mesNascimento == 9 && diaNascimento >= 23 && diaNascimento <= 31 || mesNascimento == 10 && diaNascimento >= 1 && diaNascimento <= 22){
            signo = "Libra";
        }else if(mesNascimento == 10 && diaNascimento >= 23 && diaNascimento <= 31 || mesNascimento == 11 && diaNascimento >= 1 && diaNascimento <= 21){
            signo = "Escorpião";
        }else if(mesNascimento == 11 && diaNascimento >= 22 && diaNascimento <= 31 || mesNascimento == 12 && diaNascimento >= 1 && diaNascimento <= 20){
            signo = "Sargitario";
        }else if(mesNascimento == 12 && diaNascimento >= 21 && diaNascimento <= 31 || mesNascimento == 1 && diaNascimento >= 1 && diaNascimento <= 19){
            signo = "Capricórnio";
        }else if(mesNascimento == 1 && diaNascimento >= 20 && diaNascimento <= 31 || mesNascimento == 2 && diaNascimento >= 1 && diaNascimento <= 17){
            signo = "Aquário";
        }else{
            signo = "Peixes";
        }    
        
        if(mesAtual < 1 || mesAtual > 12){
            System.out.println("\fErro! Este mês não existe.");
        }else if(mesNascimento < 1 || mesNascimento > 12){
            System.out.println("\fErro! Este mês não existe.");
        }else if(diaAtual < 1 || diaAtual > 31){
            System.out.println("\fErro! Este dia não existe.");
        }else if(diaNascimento < 1 || diaNascimento > 31){
            System.out.println("\fErro! Este dia não existe.");
        }else if(anoNascimento > anoAtual){
            System.out.println("\fErro! Este ano não existe.");
        }else if((mesAtual == 4 || mesAtual == 6 || mesAtual == 9 || mesAtual == 11) && diaAtual == 31){
            System.out.println("\fErro! Este mes não possui 31 dias.");
        }else if((mesNascimento == 4 || mesNascimento == 6 || mesNascimento == 9 || mesNascimento == 11) && diaNascimento == 31){
            System.out.println("\fErro! Este mes não possui 31 dias.");
        }else if(diaNascimento == 29 && mesNascimento == 2 && anoNascimento%4!=0){
            System.out.println("\fErro! Este ano não é bissexto.");
        }else if(diaAtual == 29 && mesAtual == 2 && anoAtual%4!=0){
            System.out.println("\fErro! Este ano não é bissexto.");
        }else if(anoAtual == anoNascimento){
            System.out.println("\fErro! Você não tem como ter nascido.");
        }else{        
            System.out.println("\fRespostas: ");
            System.out.println("\nNome: "+nome);
            System.out.println("\nData de Nascimento: "+diaNascimento+ "/" +mesNascimento+ "/" +anoNascimento);
            System.out.println("\nData Atual: "+diaAtual+"/" +mesAtual+ "/" +anoAtual);
            System.out.println("\nVocê tem "+idade+ " anos.");
            System.out.println("\nVocẽ é do signo de "+signo);
        }
        
    }
}
