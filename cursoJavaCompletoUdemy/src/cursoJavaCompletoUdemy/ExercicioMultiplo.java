package cursoJavaCompletoUdemy;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioMultiplo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		int a, b;
		
		System.out.println("Digite o primeiro numero");
		a = sc.nextInt();
		System.out.println("Digite o segundo numero");
		b = sc.nextInt();
		
		if ((a % b == 0) || (b % a == 0)) {
			System.out.println("São Multiplos");
		}else {
			System.out.println("Não São Multiplos");
		}
	}

}
