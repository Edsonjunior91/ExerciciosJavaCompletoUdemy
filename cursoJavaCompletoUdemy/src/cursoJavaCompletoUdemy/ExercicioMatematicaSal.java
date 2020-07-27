package cursoJavaCompletoUdemy;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioMatematicaSal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int codFun, horas;
		double valHor, salario;
		
		System.out.println("Digite o codigo do funcionario");
		codFun = sc.nextInt();
		System.out.println("Digite Quantas horas trabalhadas");
		horas = sc.nextInt();
		System.out.println("Digite o Valor  por hora desse funcionário");
		valHor = sc.nextDouble();
		
		salario = valHor * horas;
		
		System.out.printf(" Numero = %d %n Salario = U$%.2f",codFun, salario);

	}

}
