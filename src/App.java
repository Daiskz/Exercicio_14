import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Informe quantos quilos de peixe você possui: ");
            double kg = entrada.nextDouble();
            double excesso = kg - 50;
            double multa = excesso * 4;
            System.out.println("Você passou do peso máximo em "+ excesso + " quilos e o valor da multa é de: "+ multa + "R$");
        }
    }
}
