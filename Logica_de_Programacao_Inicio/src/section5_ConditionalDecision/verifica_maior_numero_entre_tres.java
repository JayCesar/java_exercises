package section5_ConditionalDecision;

import java.util.Locale;
import java.util.Scanner;

public class verifica_maior_numero_entre_tres {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
		if (n1 < n2 && n1 < n3){
			System.out.printf("MENOR = %d", n1);
		}else if (n2 < n1 && n2 < n3) {
			System.out.printf("MENOR = %d", n2);
		}else if (n3 < n1 && n3 < n2) {
			System.out.printf("MENOR = %d", n3);
		}else if(n1 == n2 && n1 == n3) {
			System.out.printf("MENOR = %d", n1);
		}
			
		sc.close();
	}
}
