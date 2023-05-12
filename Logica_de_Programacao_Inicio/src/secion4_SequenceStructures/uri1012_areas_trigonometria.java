package secion4_SequenceStructures;

import java.util.Locale;
import java.util.Scanner;

/*
 Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
 mostre:
 
 a) a área do triângulo retângulo que tem A por base e C por altura.
 b) a área do círculo de raio C. (pi = 3.14159)
 c) a área do trapézio que tem A e B por bases e C por altura.
 d) a área do quadrado que tem lado B.
 e) a área do retângulo que tem lados A e B.

 * */
public class uri1012_areas_trigonometria {
	public static void main(String[] args) {

		// Input
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double a, b, c, area_t, area_c, area_trap, area_quad, area_ret;

		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();

		// Process
		area_t = (a * c) / 2;
		area_c = 3.14159 * Math.pow(c, 2);
		area_trap = ((a * b) * c) / 2;
		area_quad = b * b;
		area_ret = a * b;

		System.out.printf("TRIANGULO: %.3f%n", area_t);
		System.out.printf("CIRCULO: %.3f%n", area_c);
		System.out.printf("TRAPEZIO: %.3f%n", area_trap);
		System.out.printf("TRAPEZIO: %.3f%n", area_quad);
		System.out.printf("TRAPEZIO: %.3f%n", area_ret);

		sc.close();

	}
}
