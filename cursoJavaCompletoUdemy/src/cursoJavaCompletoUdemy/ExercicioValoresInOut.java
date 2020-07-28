package cursoJavaCompletoUdemy;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioValoresInOut {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n,x, in, out;
		in=0;
		out=0;
		System.out.println("Digite quantos numeros serão solicitados");
		n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			System.out.println("Digite um numero");
			x = sc.nextInt();
			if(x >= 10 && x <= 20) {
				in += 1;
			}else {
				out += 1;
			}
		}
		System.out.printf("%d in %n", in);
		System.out.printf("%d out", out);

	}

}
