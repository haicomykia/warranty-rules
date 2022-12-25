package message;

import customer.Customer;
import warranty.WarrantyEnum;

public class MessageUncontracted implements IMessage {
	
	final private Customer customer;
	
	final private WarrantyEnum warranty;
	
	public MessageUncontracted(Customer customer, WarrantyEnum warranty) {
		this.customer = customer;
		this.warranty = warranty;
	}
	
	@Override
	public String apply() {
		return """
				%sは%sに未加入です。
				""".formatted(customer.getName(), warranty.getWarratyName());
	}
}
