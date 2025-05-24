import java.util.Scanner;

public class JV8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int idade = sc.nextInt();
		sc.nextLine(); // consome a quebra de linha que sobra do nextInt
		
		String nome = sc.nextLine(); // agora funciona corretamente
		
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);

		sc.close();
	}
}

