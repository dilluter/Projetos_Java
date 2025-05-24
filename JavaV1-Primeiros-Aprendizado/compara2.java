import java.util.Scanner;

public class compara2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double a = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double b = sc.nextDouble();

        System.out.println("\nOperações básicas:");
        System.out.println("Soma: " + (a + b));
        System.out.println("Subtração: " + (a - b));
        System.out.println("Multiplicação: " + (a * b));

        if (b != 0) {
            System.out.println("Divisão: " + (a / b));
            System.out.println("Resto da divisão (módulo): " + (a % b));
        } else {
            System.out.println("Divisão e módulo: impossível dividir por zero.");
        }

        sc.close();
    }
}