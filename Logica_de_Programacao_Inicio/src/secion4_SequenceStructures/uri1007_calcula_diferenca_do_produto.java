package secion4_SequenceStructures;

import java.util.Scanner;

/*
   Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
   de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
*/
public class uri1007_calcula_diferenca_do_produto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c, d, dif_produto;

		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();

		dif_produto = (a * b) - (c * d);

		System.out.printf("DIFERENCA = %d", dif_produto);

		sc.close();

	}
}
