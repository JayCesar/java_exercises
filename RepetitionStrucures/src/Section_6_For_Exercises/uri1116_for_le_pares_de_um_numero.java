// Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
// segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".

package Section_6_For_Exercises;

import java.util.Locale;
import java.util.Scanner;

public class uri1116_for_le_pares_de_um_numero {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i <= 3; i ++) {
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			if (n2== 0) {
				System.out.println("Divisão impossível");
			}else {
				double div = (double) n1 / n2;
				System.out.printf("%.1f%n", div);
				
			}
		}
		
		
		
		sc.close();
		

	}
}
