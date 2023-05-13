package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class WorkerProgram {
	
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter department's name: ");
		String dpName = sc.nextLine();
		Department department = new Department(dpName);
		
		
		System.out.println("Enter worker data:");
		System.out.print("Name: ");
		String workerName = sc.nextLine();
		System.out.print("Level: ");
		WorkerLevel level = WorkerLevel.valueOf(sc.next());
		System.out.print("Base salary: ");
		Double baseSalary = sc.nextDouble();
		
		Worker worker = new Worker(workerName, level, baseSalary, department);
		
		System.out.print("How many contracts to this worker? ");
		int nContracts = sc.nextInt();
		
		for (int i = 1; i <= nContracts; i++) {
			System.out.println("Enter contract #" + i + " data:");
			System.out.print("Date (DD/MM/YYYY): ");
			String date = sc.next();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			System.out.print("Duration (hours): ");
			int hours = sc.nextInt();
			HourContract contract = new HourContract(sdf.parse(date), valuePerHour, hours); 
			worker.addContract(contract);
		}
		
		System.out.println();
		
		System.out.println("Enter month and year to calculate income (MM/YYYY): ");
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		System.out.printf("Name: %s%n", worker.getName());
		System.out.printf("Department: %s%n", worker.getDeparment());
		System.out.printf("Income for " + monthAndYear + ": " +  String.format("%.2f", worker.income(year, month)));
		
		
		sc.close();
		
		
		
		
		
		
	}
	
}
