import java.util.Scanner;

public class PlanoTelefonia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double PLANO_BASICO = 50.0;
        final int MINUTOS_INCLUSOS = 100;
        final double CUSTO_MINUTO_EXTRA = 2.0;

        System.out.print("Digite a quantidade de minutos utilizados: ");
        int minutosUsados = scanner.nextInt();

        double totalAPagar;

        if (minutosUsados <= MINUTOS_INCLUSOS) {
            totalAPagar = PLANO_BASICO;
        } else {
            int minutosExcedentes = minutosUsados - MINUTOS_INCLUSOS;
            totalAPagar = PLANO_BASICO + (minutosExcedentes * CUSTO_MINUTO_EXTRA);
        }

        System.out.printf("Total a pagar: R$ %.2f\n", totalAPagar);
        scanner.close();
    }
}
