package cursoJavaCompletoUdemy;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioImpares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		System.out.println("Digite um valor qualquer");
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		for(int i = 1; i<=x; i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
		}
	}

}
