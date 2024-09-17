package JavaAulas.First;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner cliente = new Scanner(System.in);

        String nome      = "Nikolas";
        String tipoConta = "Corrente";
        double saldo     = 2000;
        int opcao        = 0; 
        String menu;

        System.out.println("-------------------------------------------------------------------");
        System.out.println("Nome do cliente: " + nome + "\nTipo da Conta: " + tipoConta + "\nSaldo Atual: " + saldo);
        System.out.println("-------------------------------------------------------------------");

        menu = "\nOperações: \n1 - Consultar Dados \n2 - Receber Valor \n3 - Transferir Valor \n4 - Sair \nDigite a Opção Desejada: ";

        while (opcao != 4) {
            System.out.println(menu);
            opcao = cliente.nextInt();

            if (opcao == 1) {
                System.out.println("\nSaldo Atual: " + saldo);
            } else if (opcao == 2) {
                System.out.println("\nInforme o Valor a Receber: ");
                double valor = cliente.nextDouble();
                saldo += valor;
                System.out.println("\nSaldo Atualizado: " + saldo);
            } else if (opcao == 3) {
                System.out.println("\nInforme o Valor a Transferir: ");
                double transferir = cliente.nextDouble();
    
                if (transferir > saldo) {
                    System.out.println("\nValor Maior que o Saldo");
                } else {
                    saldo -= transferir;
                    System.out.println("\nSaldo Atualizado: " + saldo);
                }
            } else if (opcao != 4) {
                System.out.println("\nOpção Inválida");
            }
        }
    }
}
