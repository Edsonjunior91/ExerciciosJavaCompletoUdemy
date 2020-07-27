package cursoJavaCompletoUdemy;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioDuracao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int horaIni, horaFim, duracao;
		System.out.println("Digite a hora inicial");
		horaIni = sc.nextInt();
		System.out.println("Digite a hora final");
		horaFim = sc.nextInt();
		
		if(horaIni < horaFim) {
			duracao = horaFim - horaIni;
		}else {
			duracao = 24 - horaIni + horaFim;
		}
		System.out.printf("O Jogo durou %d hora(s)", duracao);

	}

}
