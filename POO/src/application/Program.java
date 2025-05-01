package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os dados do produto:");
        System.out.print("Nome: ");
        String name = sc.nextLine();
        System.out.print("Preço: ");
        double price = sc.nextDouble();
        System.out.print("Quantidade em estoque: ");
        int quantity = sc.nextInt();

        Product product = new Product(name, price, quantity);

        System.out.println();
        System.out.println("Dados do produto: " + product);

        System.out.println();
        System.out.print("Digite o número de produtos a ser adicionado ao estoque: ");
        int quantityToAdd = sc.nextInt();
        product.addProducts(quantityToAdd);

        System.out.println();
        System.out.println("Dados atualizados: " + product);

        System.out.println();
        System.out.print("Digite o número de produtos a ser removido do estoque: ");
        int quantityToRemove = sc.nextInt();
        product.removeProducts(quantityToRemove);

        System.out.println();
        System.out.println("Dados atualizados: " + product);

        sc.close();
    }
}
