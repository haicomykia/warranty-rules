import java.time.LocalDate;
import java.util.HashMap;

import customer.Customer;
import policy.BasicWarrantyPolicy;
import policy.IWarrantyPolicy;
import policy.ThreeYearsWarrantyPolicy;
import warranty.WarrantyEnum;

public class App {
	public static void main(String[] args) {
		var taro = Customer.of("太郎");
		taro.subscribeWarranty(WarrantyEnum.BASIC_WARRANTY, LocalDate.of(2019, 12, 1));
		
		HashMap<WarrantyEnum, IWarrantyPolicy> policies = new HashMap<>();
		policies.put(WarrantyEnum.BASIC_WARRANTY, new BasicWarrantyPolicy());
		policies.put(WarrantyEnum.THEERY_YEARS_WARRANTY, new ThreeYearsWarrantyPolicy());
		
		var policy = policies.get(WarrantyEnum.THEERY_YEARS_WARRANTY);
		String message = policy.applyMessage(taro);
		
		System.out.println(message);
	}
}
