package rules;

import customer.Customer;
import message.IMessage;
import message.MessageUncontracted;
import warranty.WarrantyEnum;

/**
 * 加入状況のポリシークラス
 */
public class SubscribeRule implements IWarrantySubscribeRule {
	
	/**
	 * メッセージクラス
	 */
	final private IMessage message;
	
	public SubscribeRule() {
		this.message = new MessageUncontracted();
	}
	
	@Override
	public boolean complyWith(Customer customer, WarrantyEnum warranty) {
		return customer.hasSubscribed(warranty);
	}
	
	@Override
	public String apply(Customer customer, WarrantyEnum warranty) {
		return this.message.apply(customer, warranty);
	}
}
