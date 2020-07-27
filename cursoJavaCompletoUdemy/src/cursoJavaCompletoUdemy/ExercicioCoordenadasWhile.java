package cursoJavaCompletoUdemy;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioCoordenadasWhile {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		System.out.println("Digite o valor da coordenada X");
		x = sc.nextInt();
		
		System.out.println("Digite o valor da coordenada Y");
		y = sc.nextInt();
		
		while(x != 0 && y != 0) {
			if(x>0 && y>0) {
				System.out.println("primeiro");
			}else if(x > 0 && y < 0) {
				System.out.println("quarto");
			}else if(x<0 && y<0) {
				System.out.println("terceiro");
			}else {
				System.out.println("segundo");
			}
			System.out.println("Digite o valor da coordenada X");
			x = sc.nextInt();
			
			System.out.println("Digite o valor da coordenada Y");
			y = sc.nextInt();
		}
		System.out.println(" ");

	}

}
