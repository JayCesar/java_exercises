package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {
	
	private String name;
	private WorkerLevel WorkerLevel;
	private Double baseSalary;
	
	// Composition relationship
	private Department deparment;
	List<HourContract> ContractList = new ArrayList<>(); 
	
	public Worker() {}

	public Worker(String name, WorkerLevel workerLevel, Double baseSalary, Department deparment) {
		this.name = name;
		WorkerLevel = workerLevel;
		this.baseSalary = baseSalary;
		this.deparment = deparment;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public WorkerLevel getWorkerLevel() {
		return WorkerLevel;
	}


	public void setWorkerLevel(WorkerLevel workerLevel) {
		WorkerLevel = workerLevel;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}
	
	public Department getDeparment() {
		return deparment;
	}

	public void setDeparment(Department deparment) {
		this.deparment = deparment;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public List<HourContract> getListHourContract() {
		return ContractList;
	}

	// Methods
	public void addContract(HourContract contract) {
		ContractList.add(contract);
	}
	
	public void removeContract(HourContract contract) {
		ContractList.remove(contract);
	}
	
	public Double income(Integer year, Integer month) {
		double sum = baseSalary;
		Calendar cal = Calendar.getInstance();
		for (HourContract c : ContractList) {
			cal.setTime(c.getDate());
			int c_year = cal.get(Calendar.YEAR);
			int c_month = 1 + cal.get(Calendar.MONTH);
			if (year == c_year && month == c_month) {
				sum += c.totalValue();
			}
		}
		return sum;
	}

	
	
}	
