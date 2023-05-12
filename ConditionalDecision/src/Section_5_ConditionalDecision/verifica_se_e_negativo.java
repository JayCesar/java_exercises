// Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

package Section_5_ConditionalDecision;

import java.util.Locale;
import java.util.Scanner;

public class verifica_se_e_negativo {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		
		if (number == 0) {
			System.out.println("NAO NEGATIVO");
		}
		else if (number < 0) {
			System.out.println("NEGATIVO");
		}else {
			System.out.println("POSITIVO");
		}
		
		sc.close();
	}
}
