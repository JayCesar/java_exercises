package section5_ConditionalDecision;

import java.util.Scanner;

public class uri1046_calcula_hora_do_jogo {

	/** 
	 Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, 
	 sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma duração 
	 mínima de 1 hora e máxima de 24 horas
	**/
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int horaInicial  = sc.nextInt();
		int horaFinal = sc.nextInt();
		
		int duracao;
		if (horaFinal > horaInicial) {
			duracao = horaFinal - horaInicial;
		}
		else {
			duracao = 24 - horaInicial + horaFinal;
			//duracao = 24 - horaFinal + horaInicial;
		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		
		
		sc.close();
	}
}


