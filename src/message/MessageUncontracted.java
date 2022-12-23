package message;

import customer.Customer;
import warranty.WarrantyEnum;

public class MessageUncontracted implements IMessage {
	@Override
	public String apply(Customer customer, WarrantyEnum warranty) {
		return """
				%sは%sに未加入です。
				""".formatted(customer.getName(), warranty.getWarratyName());
	}
}
