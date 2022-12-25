import java.time.LocalDate;

import customer.Customer;
import policy.WarrantyPolicies;
import warranty.WarrantyEnum;

public class App {
	public static void main(String[] args) {
		var taro = Customer.of("太郎");
		taro.subscribeWarranty(WarrantyEnum.BASIC_WARRANTY, LocalDate.of(2019, 12, 24));
		
		var policy = new WarrantyPolicies(taro);
		System.out.println(policy.apply(WarrantyEnum.THEERY_YEARS_WARRANTY));
	}
}
