import java.time.LocalDate;
import java.util.HashMap;

import customer.Customer;
import message.MessageThisWarrantyHasNoSubscribed;
import policy.BasicWarrantyPolicy;
import policy.IWarrantyPolicy;
import warranty.WarrantyEnum;

public class App {
	public static void main(String[] args) {
		var taro = Customer.of("太郎");
		taro.subscribeWarranty(WarrantyEnum.BASIC_WARRANTY, LocalDate.now());
		
		HashMap<WarrantyEnum, IWarrantyPolicy> policies = new HashMap<>();
		policies.put(WarrantyEnum.BASIC_WARRANTY, new BasicWarrantyPolicy());
		
		var policy = policies.get(WarrantyEnum.BASIC_WARRANTY);
		var message = new MessageThisWarrantyHasNoSubscribed();
		
		if (policy.complyAll(taro)) {
			System.out.println(policy.apply(message, taro));
		}
		
	}
}
