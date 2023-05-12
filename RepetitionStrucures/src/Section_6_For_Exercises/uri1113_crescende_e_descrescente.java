package Section_6_For_Exercises;

import java.util.Locale;
import java.util.Scanner;

public class uri1113_crescende_e_descrescente {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		while (i == 0) {
			
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			if (x > y) {
				System.out.println("Descrescente");
			}
			else if (y > x){
				System.out.println("Crescente");
			}else {
				i += i;
			}
		}
		
		sc.close();
		

	}
}
