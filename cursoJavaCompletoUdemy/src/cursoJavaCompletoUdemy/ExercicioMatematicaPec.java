package cursoJavaCompletoUdemy;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioMatematicaPec {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod1, cod2, qtd1, qtd2;
		double preco1, preco2, valor;
		System.out.println("Digite o codigo da peça:");
		cod1 = sc.nextInt();
		System.out.println("Digite a quantidade de peças");
		qtd1 = sc.nextInt();
		System.out.println("Qual valor da peça");
		preco1 = sc.nextDouble();
		
		System.out.println("Digite o codigo da peça:");
		cod2 = sc.nextInt();
		System.out.println("Digite a quantidade de peças");
		qtd2 = sc.nextInt();
		System.out.println("Digite o valor da peça");
		preco2 = sc.nextDouble();
		
		valor = qtd1 * preco1 + qtd2 * preco2;
		
		System.out.printf("Valor a Pagar = R$%.2f",valor);
		
		
		
	}

}
