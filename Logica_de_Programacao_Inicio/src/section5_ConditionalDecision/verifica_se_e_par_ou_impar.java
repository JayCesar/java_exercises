// Fazer um programa para ler um número inteiro e dizer se este número é par ou ímp

package section5_ConditionalDecision;

import java.util.Locale;
import java.util.Scanner;

public class verifica_se_e_par_ou_impar {
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		
		if (number % 2 == 0 || number == 0) {
			System.out.println("PAR");
		}else {
			System.out.println("IMPAR");
		}
		
		sc.close();
	}
}

