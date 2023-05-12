// Ler um número inteiro N e calcular todos os seus divisores.

package section6_ForExercises;

import java.util.Locale;
import java.util.Scanner;

public class uri1157_for_calcular_divisores_de_um_numero {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		int n = sc.nextInt();
		
		
		for (int i = 1; i<= 6; i++) {
			if (n % i == 0) {
				System.out.println(i);
			}
		}
		
		sc.close();
	}
}
