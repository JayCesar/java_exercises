package Section_4_SequenceStructures;

import java.util.Locale;
import java.util.Scanner;

/*
 
 Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
 hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
 decimais.
 
* */

public class uri1008_calcula_funcionario_dados {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int id_employe, hoursW;
		double wageH, income;

		id_employe = sc.nextInt();
		hoursW = sc.nextInt();
		wageH = sc.nextDouble();

		income = (hoursW * wageH);

		System.out.printf("NUMBER = %d%n", id_employe);
		System.out.printf("SALARY = U$ %.2f", income);

		sc.close();

	}
}
