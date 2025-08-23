package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas alturas você vai digitar? ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("O número de alturas deve ser maior que zero.");
            sc.close();
            return;
        }

        double[] heights = readHeights(sc, n);
        double average = calculateAverage(heights);

        System.out.printf("ALTURA MÉDIA: %.2f%n", average);

        sc.close();
    }

  
    private static double[] readHeights(Scanner sc, int n) {
        double[] vect = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Digite a altura da pessoa %d: ", i + 1);
            vect[i] = sc.nextDouble();
        }
        return vect;
    }

    private static double calculateAverage(double[] vect) {
        double sum = 0.0;
        for (double value : vect) {
            sum += value;
        }
        return sum / vect.length;
    }
}

