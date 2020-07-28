package cursoJavaCompletoUdemy;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioMediaPonderada {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		System.out.println("Digite a quantidade de valores para calcular a média");
		n = sc.nextInt();
		for(int i = 1; i<=n; i++) {
			double v1,v2,v3;
			double media;
			
			System.out.println("Digite o Valor 1");
			v1 = sc.nextDouble();
			
			System.out.println("Digite o Valor 2");
			v2 = sc.nextDouble();
			
			System.out.println("Digite o Valor 3");
			v3 = sc.nextDouble();
			
			media= ((v1*2)+(v2*3)+(v3*5))/(2+3+5);
			
			System.out.printf("Média: %.1f%n", media);
			
		}
		sc.close();
	}

}
