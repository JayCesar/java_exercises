package secion4_SequenceStructures;

import java.util.Locale;
import java.util.Scanner;

/*
  Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
casas decimais conforme exemplos.
Fórmula da área: area = π . raio2
Considere o valor de π = 3.14159

 * */

public class uri1002_calcula_raio_de_circulo {
	
	public static void main(String[] args) {

		// Input
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double raio = sc.nextDouble();
		double area;

		// Math
		area = 3.14159 * Math.pow(raio, 2);

		// Output
		System.out.printf("A=%.4f", area);

		sc.close();

	}
}
