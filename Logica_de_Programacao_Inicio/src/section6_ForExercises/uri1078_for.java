package section6_ForExercises;

import java.util.Locale;
import java.util.Scanner;

public class uri1078_for {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int resultado = 0;
		
		for (int i = 1; i <= 10; i++) {
			resultado = i * N;
			System.out.printf("%d x %d = %d%n", i, N, resultado);
			//System.out.println(i + " x " + N + " = " + resultado);
		}

		sc.close();

	}
}
