import java.util.Locale;

public class JV2 {

	public static void main(String[] args) {
		int y = 12; 
		double x = 3.14;
		double z = 2.8885144448815;
		System.out.println(x);
		System.out.println(y);
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f%n", z);
		System.out.printf("%.4f%n", z);
		System.out.println("Resultado = " + x + " Metros" );
		System.out.printf("resultado = %.2f metros%n", z);
	}

}
