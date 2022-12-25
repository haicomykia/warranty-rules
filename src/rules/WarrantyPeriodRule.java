package rules;

import java.time.LocalDate;

import customer.Customer;
import message.MessageWarrantyExpired;
import warranty.WarrantyEnum;

/**
 * 保証期間のポリシークラス
 */
public class WarrantyPeriodRule implements IWarrantySubscribeRule {
	@Override
	public boolean complyWith(Customer customer, WarrantyEnum warranty) {
		if (LocalDate.now().isBefore(customer.getStartDate())) {
			return false;
		}
		
		LocalDate endDate = customer.hasCanceled() ? 
							customer.getCancelDate() : 
							customer.getStartDate().plusYears(warranty.getYearsOfWarranty());
		
		return !LocalDate.now().isAfter(endDate);
	}
	
	@Override
	public String apply(Customer customer, WarrantyEnum warranty) {
		var messenger = new MessageWarrantyExpired(customer, warranty);
		return messenger.apply();
	}
}
