package rules;

import customer.Customer;
import warranty.WarrantyEnum;

/**
 * 加入状況のルールクラス
 */
public class SubscribeRule implements IWarrantySubscribeRule {
	
	@Override
	public boolean complyWith(Customer customer, WarrantyEnum warranty) {
		return customer.hasSubscribed(warranty);
	}
}
