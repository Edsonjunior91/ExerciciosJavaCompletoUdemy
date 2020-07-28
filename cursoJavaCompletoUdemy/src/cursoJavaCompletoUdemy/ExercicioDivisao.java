package cursoJavaCompletoUdemy;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioDivisao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Digite Quantas operações deseja");
		n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			int n1, n2;
			double divisao;
			System.out.println("Digite o primeiro valor");
			n1 = sc.nextInt();
			
			System.out.println("Digite o segundo valor");
			n2 = sc.nextInt();
			
			divisao =(double) n1 / n2;
			if(n2== 0 ) {
				System.out.println("divisao impossivel");
			}else {
				System.out.printf("%.1f %n", divisao);
			}
		}
	}

}
