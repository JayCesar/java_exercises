package section5_ConditionalDecision;

import java.util.Locale;
import java.util.Scanner;

public class uri1051_calcula_imposto_de_renda {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double renda = sc.nextDouble();
		double imposto;
		
		if (renda > 2000.00 && renda <= 3000.00) {
			imposto = (18 * renda) / 100;
			System.out.printf("R$ %.2f", imposto);
		}
		else if(renda > 3000.00 && renda <= 4500.00) {
			double taxa1 = ((8 * 1000) / 100);
			double taxa2 = ((renda - 3000) * 18) / 100;
			imposto = taxa1 + taxa2;
			System.out.printf("R$ %.2f", imposto);
		}
		else if (renda > 4500.00) {
			double taxa1 = ((8 * 1000) / 100);
			double taxa2 = (1500 * 18) / 100;
			double taxa3 = ((renda - 4500) * 28) / 100;
			imposto = taxa1 + taxa2 + taxa3;
			System.out.printf("R$ %.2f", imposto);
		}else {
			System.out.println("Isento");
		}
		
		
		sc.close();
	}
}
