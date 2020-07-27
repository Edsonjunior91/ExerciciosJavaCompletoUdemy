package cursoJavaCompletoUdemy;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioIntervalo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double valor;
		
		System.out.println("Digite um valor qualquer");
		valor = sc.nextDouble();
		
		if(valor <0 || valor >100) {
			System.out.println("Fora do Intervalo");
		}else if(valor <= 25) {
			System.out.println("intervalo [0,25]");
		}else if(valor <=50) {
			System.out.println("intervalo[25,50]");
		}else if(valor <=75) {
			System.out.println("intervalo [50,75]");
		}else {
			System.out.println("Intervalo [75, 100");
		}

	}

}
