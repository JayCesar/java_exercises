package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import entities.Student;

public class ProgramStudent {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Instantiating
		Student a1 = new Student("Guilherme", 21);
		Student a2 = new Student("Amanda", 35);
		Student a3 = new Student("Geovana", 22);
		Student a4 = new Student("Júlio", 50);
		Student a5 = new Student("Paula", 42);
		Student a6 = new Student("Danilo", 13);
		
		// Saving them into the courses
		List<Student> courseA = new ArrayList<>(Arrays.asList(a1, a2, a3));
		List<Student> courseB = new ArrayList<>(Arrays.asList(a1, a4));
		List<Student> courseC = new ArrayList<>(Arrays.asList(a5, a2, a6));
		
		// Create the TeacherList;
		Set<Student> setList = new HashSet<>(); // It does not accept repetitive objects
		
		// Checking courseA
		System.out.print("How many sudents for course A? ");
		System.out.println(courseA.size());
		courseA.forEach(s -> {
			setList.add(s);
			System.out.println(s.getId());
		});
		
		// Checking courseB
		System.out.print("How many sudents for course B? ");
		System.out.println(courseB.size());
		courseB.forEach(s -> {
			setList.add(s);
			System.out.println(s.getId());
		});
		
		// Checking courseC
		System.out.print("How many sudents for course C? ");
		System.out.println(courseC.size());
		courseC.forEach(s -> {
			setList.add(s);
			System.out.println(s.getId());
		});
		
		// Counting the total amount
		System.out.print("Total students: " + setList.size());
		
		sc.close();

	}

}
