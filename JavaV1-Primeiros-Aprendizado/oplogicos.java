import java.util.Scanner;

public class oplogicos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Digite sua idade: ");
	        int idade = sc.nextInt();

	        System.out.print("Digite sua renda mensal: ");
	        double renda = sc.nextDouble();

	        boolean maiorDeIdade = idade >= 18;
	        boolean rendaSuficiente = renda >= 2000;

	        System.out.println("\nVerificações com operadores lógicos:");

	        System.out.println("É maior de idade E tem renda suficiente? " + (maiorDeIdade && rendaSuficiente));
	        System.out.println("É maior de idade OU tem renda suficiente? " + (maiorDeIdade || rendaSuficiente));
	        System.out.println("NÃO é maior de idade? " + (!maiorDeIdade));

	        sc.close();
	    }
	}