public class OperadoresAtribuicao {
    public static void main(String[] args) {
        int numero = 10;

        System.out.println("Valor inicial: " + numero);

        numero += 5;  // número = número + 5
        System.out.println("Após += 5: " + numero);  // 15

        numero -= 3;  // número = número - 3
        System.out.println("Após -= 3: " + numero);  // 12

        numero *= 2;  // número = número * 2
        System.out.println("Após *= 2: " + numero);  // 24

        numero /= 4;  // número = número / 4
        System.out.println("Após /= 4: " + numero);  // 6

        numero %= 4;  // número = número % 4
        System.out.println("Após %= 4: " + numero);  // 2
    }
}
