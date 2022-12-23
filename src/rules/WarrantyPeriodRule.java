package rules;

import java.time.LocalDate;

import customer.Customer;
import message.IMessage;
import message.MessageWarrantyExpired;
import warranty.WarrantyEnum;

/**
 * 保証期間のポリシークラス
 */
public class WarrantyPeriodRule implements IWarrantySubscribeRule {
	
	/**
	 * メッセージクラス
	 */
	final private IMessage message;
	
	public WarrantyPeriodRule() {
		this.message = new MessageWarrantyExpired();
	}
	
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
		return this.message.apply(customer, warranty);
	}
}
