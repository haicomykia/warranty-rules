package message;

import customer.Customer;
import warranty.WarrantyEnum;

/**
 * 保証に加入していない場合のメッセージ
 */
public class MessageThisWarrantyHasNoSubscribed implements IMessage {
	@Override
	public String apply(Customer customer, WarrantyEnum warranty) {
		return """
				%sに未加入または保証期間外です。
				""".formatted(warranty.getWarratyName());
	}
}
