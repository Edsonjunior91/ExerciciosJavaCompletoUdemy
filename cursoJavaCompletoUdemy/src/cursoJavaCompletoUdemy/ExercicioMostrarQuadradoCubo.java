package cursoJavaCompletoUdemy;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioMostrarQuadradoCubo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Digite um valor");
		n = sc.nextInt();
		for(int i = 1; i<=n; i++) {
			int primeiro = i;
			int segundo = i*i;
			int terceiro = i*i*i;
			System.out.printf("%d %d %d%n",primeiro,segundo, terceiro);
		}
		sc.close();
	}

}
