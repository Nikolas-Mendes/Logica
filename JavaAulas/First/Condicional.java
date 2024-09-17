package JavaAulas.First;

public class Condicional {
    public static void main (String[] args) {
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "Plus";

        if (anoDeLancamento >= 2022) {
            System.out.println("Lançamento");
        } else {
            System.out.println("Não é Lançamento");
        }

        if (incluidoNoPlano == true && tipoPlano.equals("Plus")) {
            System.out.println("Filme Liberado");
        } else {
            System.out.println("Tem que pagar doido");
        }
    }
}
