package services;

import java.time.LocalDate;

import entities.Contract;
import entities.Installment;

public class ContractService {
	
	private OnlinePaymentService onlinePaymentService;

	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}
	
	public void processContract(Contract contract, int months) {
		// Cálculos (1% de juros simples mensal + 2% taxa de pagamento)
		
		double basicQuota = contract.getTotalValue() / months;
		
		for (int i = 1; i <= months; i++) {
			LocalDate dueDate = contract.getDate().plusMonths(i);
			// Quando começar o for, eu pego a data original do contrado e adicono um mês - utilizando o método pulsMonths();
			
			double interest = onlinePaymentService.interest(basicQuota, i); // Acha o valor de imposto (200 + 1% * 1 = 202)
			double fee = onlinePaymentService.paymentFee(basicQuota + interest); // Acha o valor a se pagar de taxa (202 + 2% = 206.04)
			double totalQuota = basicQuota + interest + fee;
			
			contract.getInstallments().add(new Installment(dueDate, totalQuota));
			// Adiciona uma nova parcela / installment
		}
	}

	
}
