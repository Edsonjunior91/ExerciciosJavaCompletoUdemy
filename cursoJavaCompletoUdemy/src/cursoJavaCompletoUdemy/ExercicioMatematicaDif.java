package cursoJavaCompletoUdemy;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioMatematicaDif {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		int a, b, c, d, diferenca;
		
		System.out.println("Digite o valor de A");
		a = sc.nextInt();
		System.out.println("Digite o valor de B");
		b = sc.nextInt();
		System.out.println("Digite o valor de C");
		c = sc.nextInt();
		System.out.println("Digite o valor de D");
		d = sc.nextInt();
		
		diferenca = (a * b - c * d);
		
		System.out.println("A diferença do valor de A * B - C * D é:" + diferenca);
	}

}
