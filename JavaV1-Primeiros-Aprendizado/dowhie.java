import java.util.Scanner;

public class dowhie {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x;
        int soma = 0;

        do {
            x = sc.nextInt();     // Lê o número
            soma += x;            // Soma com o total
        } while (x != 0);          // Continua até digitar 0

        System.out.println("SOMA: " + soma);
        sc.close();
    }
}

