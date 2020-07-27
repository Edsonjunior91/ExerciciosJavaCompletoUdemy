package cursoJavaCompletoUdemy;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioWhileCombustivel {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		int alcool, gasolina, diesel, cod;
		alcool = 0;
		gasolina = 0;
		diesel = 0;
		System.out.printf("Qual tipo de combustivel usado %n1 - Alcool %n2 - Gasolina "
				+ "%n3 - Diesel %n4 = Encerrar e mostrar contagem ");
		cod = sc.nextInt();
		
		while (cod != 4) {
			while(cod < 1 || cod > 4) {
				System.out.printf("Codigo Inválido - Digite um codigo válido"
						+ "%n1 - Alcool %n2 - Gasolina %n3 - Diesel %n4 = Encerrar e mostrar contagem%n%n");
				cod = sc.nextInt();
			}
			if(cod == 1) {
				alcool += 1;
				System.out.printf("%n%nAlcool = "+ alcool);
			}else if(cod == 2) {
				gasolina += 1;
				System.out.printf("%n%nGasolina = "+ gasolina);
			}else {
				diesel += 1;
				System.out.printf("%n%nDiesel = "+ diesel);
			}
			System.out.printf("%n%nQual tipo de combustivel usado %n1 - Alcool %n2 - Gasolina "
					+ "%n3 - Diesel %n4 = Encerrar e mostrar contagem %n%n");
			cod = sc.nextInt();
			
		}
		
		System.out.printf("MUITO OBRIGADO %n Alcool: %d %n Gasolina: %d %n Diesel: %d", alcool, gasolina, diesel);
		
		

	}

}
