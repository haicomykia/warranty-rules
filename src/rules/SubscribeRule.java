package rules;

import customer.Customer;
import message.MessageUncontracted;
import warranty.WarrantyEnum;

/**
 * 加入状況のポリシークラス
 */
public class SubscribeRule implements IWarrantySubscribeRule {
	
	@Override
	public boolean complyWith(Customer customer, WarrantyEnum warranty) {
		return customer.hasSubscribed(warranty);
	}
	
	@Override
	public String apply(Customer customer, WarrantyEnum warranty) {
		var messenger = new MessageUncontracted(customer, warranty);
		return messenger.apply();
	}
}
