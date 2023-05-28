package testes;

import java.util.Scanner;

public class CamilaTeste {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        String continua = "s";
        int idade, sexo, categoria, pessoasBack = 0, mulheresFront = 0, homensMob = 0, mulheresFull = 0;


        while (continua.equals("s")) {

            System.out.println("Digite a idade da pessoa colaboradora:");
            idade = leia.nextInt();

            System.out.println("Sexo (escolha uma opção): \nDigite 1 para Masculino - 2 para Feminino - 3 para Outros");
            sexo = leia.nextInt();

            System.out.println("Categoria (escolha uma opção): \nDigite 1 para BackEnd - 2 para FrontEnd - 3 para Mobile - 4 para FullStack");
            categoria = leia.nextInt();

            System.out.println("Deseja continuar? (s/n)");
            continua = leia.next();

            if (categoria == 1) {
            	pessoasBack++;
            }else if(categoria == 2 && sexo == 2) {
            	mulheresFront++;
            }else if(categoria == 3 && sexo == 1 & idade > 40) {
            	homensMob++;
            }else if(categoria == 4 && sexo == 2 && idade < 30) {
            	mulheresFull++;
            }
          

        }

        System.out.println("O número de pessoas Dev's Backend é:" + pessoasBack);
        System.out.println("O número de mulheres Dev's Frontend é: " + mulheresFront);
        System.out.println("O número de homens Dev's Mobile é: " + homensMob);
        System.out.println("O número de mulheres Dev's Fullstack é: " + mulheresFull);
    }
}