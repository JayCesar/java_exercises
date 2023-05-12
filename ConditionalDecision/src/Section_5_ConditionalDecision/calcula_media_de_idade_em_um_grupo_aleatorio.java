package Section_5_ConditionalDecision;

import java.util.Locale;
import java.util.Scanner;

public class calcula_media_de_idade_em_um_grupo_aleatorio {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double media = 0;
		int soma = 0;
		int i = 0;
		
		
		int idade = sc.nextInt();
		if (idade > -1) {
			while (idade > -1) {
				soma += idade;
				i++;
				idade = sc.nextInt();
			}
			media = (double) soma / i; // Utilizamos o Casting!
			System.out.printf("%.2f", media);
		}else {
			System.out.println("Impossível calcular");
		}
		
		
		sc.close();

	
	}
}
