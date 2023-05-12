package Section_5_ConditionalDecision;

import java.util.Locale;
import java.util.Scanner;

public class calcula_nota_de_aluno {
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double n1, n2, nf;
		
		n1 = sc.nextDouble();
		n2 = sc.nextDouble();
		
		nf = n1 + n2;
		
		System.out.printf("NOTA FINAL = %.1f%n", nf);
			if (nf < 60) {
				System.out.println("REPROVADO");
			}
	
		sc.close();
	}
}
