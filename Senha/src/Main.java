public class Main {
    public static void main(String[] args) {
        int senha = 2934;

        for (int i = 0; i <= 5000; i++) {
            System.out.println(i);
            if (i == senha) {
                System.out.println("Senha encontrada: " + i);
                break; 
            }
        }
    }
}
