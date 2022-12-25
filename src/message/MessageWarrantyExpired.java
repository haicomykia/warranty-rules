package message;

import customer.Customer;
import warranty.WarrantyEnum;

public class MessageWarrantyExpired implements IMessage {
	
	final private Customer customer;
	
	final private WarrantyEnum warranty;
	
	public MessageWarrantyExpired(Customer customer, WarrantyEnum warranty) {
		this.customer = customer;
		this.warranty = warranty;
	}
	
	@Override
	public String apply() {
		return """
				%sは保証期間を過ぎています。
				""".formatted(warranty.getWarratyName());
	}
}
