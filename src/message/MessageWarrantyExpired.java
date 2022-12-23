package message;

import customer.Customer;
import warranty.WarrantyEnum;

public class MessageWarrantyExpired implements IMessage {
	@Override
	public String apply(Customer customer, WarrantyEnum warranty) {
		return """
				%sは保証期間を過ぎています。
				""".formatted(warranty.getWarratyName());
	}
}
