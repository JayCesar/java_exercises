// Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
// começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
// exemplo.

package section6_ForExercises;

import java.util.Locale;
import java.util.Scanner;

public class uri1143_for_imprime_quadro_e_cubo {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 1; i <= 5; i++) {
			int quad = i * i;
			int cubo = i * i * i;
			System.out.println(i + " " + quad + " " + cubo);
		}
		
		sc.close();

	}
}
