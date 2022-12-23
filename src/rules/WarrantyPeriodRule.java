package rules;

import java.time.LocalDate;

import customer.Customer;
import warranty.WarrantyEnum;

public class WarrantyPeriodRule implements IWarrantySubscribeRule {
	@Override
	public boolean complyWith(Customer customer, WarrantyEnum warranty) {
		if (customer.getStartDate().isBefore(LocalDate.now())) {
			return false;
		}
		
		LocalDate endDate = customer.hasCanceled() ? 
							customer.getCancelDate() : 
							customer.getStartDate().plusYears(warranty.getYearsOfWarranty());
		
		return !LocalDate.now().isAfter(endDate);
	}
}
