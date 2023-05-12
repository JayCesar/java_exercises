package Section_4_SequenceStructures;

import java.util.Scanner;

/*
 Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
 mensagem explicativa, conforme exemplos.
*/

public class uri1003_soma_de_dois_valores {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();
		int soma_result;

		soma_result = x + y;
		System.out.printf("SOMA = %d", soma_result);

		sc.close();

	}

}
