package testes;

import java.util.Scanner;

public class LacoRepeticaoFor {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String[] nomes = new String[3];
		
		for (int i = 0; i < nomes.length; i++) {
	         System.out.println("Digite o " + (i + 1) + "º nome:");
	         nomes[i] = leia.nextLine();
	     }
	        
	    // Acessando os nomes armazenados no array
		
		for (String n : nomes) {
			System.out.println("Nome: " + n);
		}
	   

	}

}

