import java.util.Scanner;
import java.util.Locale;

public class JV7 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US); // Usa ponto como separador decimal
        Scanner sc = new Scanner(System.in);

        int x;
        double y;
        String nome;
        char letra;

        System.out.print("Digite um número inteiro: ");
        x = sc.nextInt();

        System.out.print("Digite um número decimal (double): ");
        y = sc.nextDouble();

        sc.nextLine(); // Limpa o buffer

        System.out.print("Digite seu nome: ");
        nome = sc.nextLine();

        System.out.print("Digite uma letra: ");
        letra = sc.next().charAt(0); // Lê a primeira letra digitada

        System.out.println("\nVocê digitou:");
        System.out.println("Número inteiro: " + x);
        System.out.println("Número decimal: " + y);
        System.out.println("Nome: " + nome);
        System.out.println("Letra: " + letra);

        sc.close();
    }
}


