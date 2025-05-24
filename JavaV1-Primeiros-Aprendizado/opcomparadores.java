import java.util.Scanner;

public class opcomparadores {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Digite o primeiro número (a): ");
	        int a = sc.nextInt();

	        System.out.print("Digite o segundo número (b): ");
	        int b = sc.nextInt();

	        System.out.println("\nResultados das comparações:");

	        System.out.println("a == b : " + (a == b)); // Igual
	        System.out.println("a != b : " + (a != b)); // Diferente
	        System.out.println("a > b  : " + (a > b));  // Maior que
	        System.out.println("a < b  : " + (a < b));  // Menor que
	        System.out.println("a >= b : " + (a >= b)); // Maior ou igual
	        System.out.println("a <= b : " + (a <= b)); // Menor ou igual

	        sc.close();
	    }
	}