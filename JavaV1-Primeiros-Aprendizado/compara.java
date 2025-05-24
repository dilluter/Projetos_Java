import java.util.Scanner;

public class compara {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int a = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("O primeiro número é maior que o segundo.");
        } else if (a < b) {
            System.out.println("O segundo número é maior que o primeiro.");
        } else {
            System.out.println("Os dois números são iguais.");
        }

        sc.close();
    }
}
