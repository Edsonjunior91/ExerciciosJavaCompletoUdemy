package cursoJavaCompletoUdemy;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioMatematicaPi {
	public static final double PI =3.14159;
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double raio, area;
		
		System.out.println("Digite um valor para o raio");
		raio = sc.nextDouble();
		area = raio*raio * PI;
		
		System.out.printf("Valor da area deste circulo é: %.4f ", area);
		
		
		

	}

}
