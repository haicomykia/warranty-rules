package message;

import customer.Customer;
import warranty.WarrantyEnum;

/**
 * 名前付きメッセージを出力するクラス
 */
public class MessageWithNames implements  IMessage {
	@Override
	public String apply(Customer customer, WarrantyEnum warranty) {
//		return """
//				%sは%sを申し込みました。
//				""".formatted(customer.getName(), warranty.getWarratyName());
		return """
				
				""";
	}
}
