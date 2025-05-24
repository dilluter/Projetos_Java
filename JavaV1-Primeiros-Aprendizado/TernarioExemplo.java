import java.util.Scanner;

public class TernarioExemplo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        // Operador ternário: condição ? valor_se_verdadeiro : valor_se_falso
        String status = (idade >= 18) ? "Maior de idade" : "Menor de idade";

        System.out.println("Você é: " + status);

        sc.close();
    }
}
