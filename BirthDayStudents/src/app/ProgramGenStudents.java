package app;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.GenStudent;

public class ProgramGenStudents {

	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		
		// Lista dos alunos e Lista de aniversariantes
		List<GenStudent> genStudentsList = new ArrayList<>();
		List<GenStudent> birthDayStudents = new ArrayList<>();
		
		// Adicionando os estudantes na lista de alunos
		genStudentsList.add(new GenStudent("Lucas Vinicius de Castro Cruz Barbato", LocalDate.parse("12/07/2003", fmt), "Câncer", "https://www.youtube.com/watch?v=CJOZc02VwJM&ab_channel=RoddyRicch"));
		genStudentsList.add(new GenStudent("Thayron Nogueira", LocalDate.parse("06/12/1993", fmt), "Sagitário", "https://www.youtube.com/watch?v=uGAxnjss9g0"));
		genStudentsList.add(new GenStudent("Bianca Dantas Jacob", LocalDate.parse("29/06/1996", fmt), "Câncer", "https://www.youtube.com/watch?v=3AyMjyHu1bA"));
		genStudentsList.add(new GenStudent("Pedro Henrique", LocalDate.parse("13/07/1993", fmt), "Câncer", "https://www.youtube.com/watch?v=zMBKjt_hQl4&ab_channel=DevastoProd"));
		genStudentsList.add(new GenStudent("Tainara Karolina Santana de Mello", LocalDate.parse("04/09/1997", fmt), "Virgem", "https://www.youtube.com/watch?v=IXdNnw99-Ic"));
		genStudentsList.add(new GenStudent("Felipe Santana Vitorino", LocalDate.parse("03/07/2001", fmt), "Câncer", "https://www.youtube.com/watch?v=og1SfJ7nOAU"));
		genStudentsList.add(new GenStudent("Emily Vitoria Ramos dos Santos", LocalDate.parse("11/09/2003", fmt), "Virgem", "https://www.youtube.com/watch?v=y2ZCGXGnVuU"));
		genStudentsList.add(new GenStudent("Larissa Santos Bueno", LocalDate.parse("04/06/1989", fmt), "Gêmeos", "https://www.youtube.com/watch?v=OfZREiUWOuY"));
		genStudentsList.add(new GenStudent("Elise Marie Kretzschmar", LocalDate.parse("16/07/1990", fmt), "Câncer", "https://www.youtube.com/watch?v=iYYRH4apXDo"));	
		genStudentsList.add(new GenStudent("Israel Bernardo", LocalDate.parse("02/10/1998", fmt), "Libra", "https://youtu.be/oQ09Bw2Q4nI"));
		genStudentsList.add(new GenStudent("Sabrina Porfilia", LocalDate.parse("05/08/1999", fmt), "Leão", "https://www.youtube.com/watch?v=jbrLub_Bae8"));
		genStudentsList.add(new GenStudent("Fabiana Alves Pereira Russo", LocalDate.parse("25/10/1987", fmt), "Escorpião", "https://youtu.be/Ij99dud8-0A"));
		genStudentsList.add(new GenStudent("Isabella Ingrid Miguel Gonçalves ", LocalDate.parse("27/06/2001", fmt), "Câncer", "https://www.youtube.com/watch?v=CvBfHwUxHIk"));
		genStudentsList.add(new GenStudent("Mateus Ferreira da Costa", LocalDate.parse("31/08/2002", fmt), "Virgem", "https://www.youtube.com/watch?v=wuO4_P_8p-Q&ab_channel=KanyeWest-Topic"));
		genStudentsList.add(new GenStudent("Raissa Rillary Ferreira", LocalDate.parse("19/10/2003", fmt), "Libra", "https://youtu.be/L1oehf583LE"));
		genStudentsList.add(new GenStudent("Isabella Ingrid Miguel Gonçalves ", LocalDate.parse("27/06/2001", fmt), "Câncer", "https://www.youtube.com/watch?v=CvBfHwUxHIk"));
		genStudentsList.add(new GenStudent("Rita Angélica Jesus de Almeida", LocalDate.parse("10/10/1992", fmt), "Libra", "https://youtu.be/3A9OY1MPu9k"));
		genStudentsList.add(new GenStudent("Pedro Estevam de Matos", LocalDate.parse("17/12/2003", fmt), "Sagitário", "https://youtu.be/iywaBOMvYLI"));
		genStudentsList.add(new GenStudent("Kauan Hassani", LocalDate.parse("14/10/2004", fmt), "Libra", "https://www.youtube.com/watch?v=a1PkVEHV-w8"));
		genStudentsList.add(new GenStudent("Camila Caroline Ramos do Nascimento", LocalDate.parse("23/11/1997", fmt), "Sagitário", "https://www.youtube.com/watch?v=4NRXx6U8ABQ"));
		genStudentsList.add(new GenStudent("Mayara Souza Costa", LocalDate.parse("18/10/1994", fmt), "Libra", "https://www.youtube.com/watch?v=R8jR7UOXijw"));
		genStudentsList.add(new GenStudent("Julia stefani Nóbrega Bernardes ", LocalDate.parse("29/07/1996", fmt), "Leão", "https://youtu.be/zWxuc8L0W_Y"));
		
		// testes:
		genStudentsList.add(new GenStudent("Julio ", LocalDate.parse("29/05/1996", fmt), "Leão", "https://youtu.be/zWxuc8L0W_Y"));
		genStudentsList.add(new GenStudent("Julio ", LocalDate.parse("29/05/1996", fmt), "Leão", "https://youtu.be/zWxuc8L0W_Y"));
		genStudentsList.add(new GenStudent("Julio ", LocalDate.parse("29/05/1996", fmt), "Leão", "https://youtu.be/zWxuc8L0W_Y"));
		
		
		// Verifica se há aniversariantes e adiona na lista de aniversariantes:
		int amountBrithDates = 0;
		for (GenStudent gStudent : genStudentsList) {
			if(gStudent.getBirthDate().getMonth() == now.getMonth() && gStudent.getBirthDate().getDayOfMonth() == now.getDayOfMonth()) {
				amountBrithDates++;
				birthDayStudents.add(gStudent);
			}
		}
		
		// Imprime aniversariantes
		if (amountBrithDates > 1) {
			System.out.println("Aniversariantes do dia: \n");
			for (GenStudent student : birthDayStudents) {
				System.out.println(student);
			}
		}
		else if(amountBrithDates == 1) {
			System.out.println("Aniversariante do dia: \n");
			for (GenStudent student : birthDayStudents) {
				System.out.println(student);
			}
		}
		else {
			System.out.println("Nenhum alune faz aniversário hoje");
		}
		
		sc.close();
	}

}

