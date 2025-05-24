public class verificador {

    // Função que retorna true se o número for par, senão false
    public static boolean ehPar(int numero) {
        return numero % 2 == 0;
    }

    public static void main(String[] args) {
        int n = 7;

        if (ehPar(n)) {
            System.out.println(n + " é par.");
        } else {
            System.out.println(n + " é ímpar.");
        }
    }
}
