package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contract {

	private Integer number;
	private LocalDate date;
	private Double totalValue;
	
	// Assossiation / Composition relationship
	List<Installment> instalments = new ArrayList<>();
	
	public Contract() {}

	public Contract(Integer number, LocalDate date, Double totalValue, List<Installment> instalments) {
		this.number = number;
		this.date = date;
		this.totalValue = totalValue;
		this.instalments = instalments;
	}
	
	
	
	
}
