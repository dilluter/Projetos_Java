import java.util.Scanner;

public class SaudacaoPorHorario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a hora do dia (0 a 23): ");
        int hora = scanner.nextInt();

        if (hora >= 6 && hora < 12) {
            System.out.println("Bom dia!");
        } else if (hora >= 12 && hora < 18) {
            System.out.println("Boa tarde!");
        } else if ((hora >= 18 && hora <= 23) || (hora >= 0 && hora < 6)) {
            System.out.println("Boa noite!");
        } else {
            System.out.println("Hora inválida!");
        }

        scanner.close();
    }
}
