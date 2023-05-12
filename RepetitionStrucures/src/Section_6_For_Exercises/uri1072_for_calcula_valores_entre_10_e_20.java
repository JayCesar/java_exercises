package Section_6_For_Exercises;

import java.util.Scanner;

public class uri1072_for_calcula_valores_entre_10_e_20 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int in = 0;
	    int out = 0;
	    
		int qn = sc.nextInt();
		
	    int numero = 0;
		for (int i = 0; i < qn; i++) {
			numero = sc.nextInt();
			if (numero >= 10 && numero <= 20){
				in++;
			}
			else {
				out++;
			}
		}
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		sc.close();
	}
}

/*
 
Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).

*/