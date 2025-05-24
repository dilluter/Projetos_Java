import java.util.Scanner;

public class fuçoes2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número (double): ");
        double x = sc.nextDouble();

        System.out.println("\nFunções matemáticas com o número " + x + ":\n");

        System.out.println("Valor absoluto: " + Math.abs(x));
        System.out.println("Raiz quadrada: " + Math.sqrt(x));
        System.out.println("Potência (x^2): " + Math.pow(x, 2));
        System.out.println("Arredondado para cima (ceil): " + Math.ceil(x));
        System.out.println("Arredondado para baixo (floor): " + Math.floor(x));
        System.out.println("Arredondado normal (round): " + Math.round(x));
        System.out.println("Seno (em radianos): " + Math.sin(x));
        System.out.println("Cosseno (em radianos): " + Math.cos(x));
        System.out.println("Tangente (em radianos): " + Math.tan(x));
        System.out.println("Número PI: " + Math.PI);
        System.out.println("Número E (base dos logaritmos): " + Math.E);
        System.out.println("Logaritmo natural (ln): " + Math.log(x));
        System.out.println("Logaritmo base 10: " + Math.log10(x));
        System.out.println("Valor máximo entre x e 10: " + Math.max(x, 10));
        System.out.println("Valor mínimo entre x e 10: " + Math.min(x, 10));

        sc.close();
    }
}
