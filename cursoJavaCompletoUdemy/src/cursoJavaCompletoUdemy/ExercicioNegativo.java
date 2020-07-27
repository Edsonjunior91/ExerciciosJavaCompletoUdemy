package cursoJavaCompletoUdemy;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioNegativo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int numero;
		numero = sc.nextInt();
		
		if(numero < 0) {
			System.out.println("NEGATIVO");
		}else if(numero > 0) {
			System.out.println("NÃO NEGATIVO");
		}else {
			System.out.println("NUMERO NULO");
		}
	}

}
