package policy;

import java.util.HashMap;

import customer.Customer;
import warranty.WarrantyEnum;

/**
 * 保証への加入状況を調べるクラス 
 */
public class WarrantyPolicies {
	
	final private Customer customer;
	
	public WarrantyPolicies(Customer customer) {
		this.customer = customer;
	}
	
	public String apply(WarrantyEnum warranty) {
		HashMap<WarrantyEnum, IWarrantyPolicy> policies = new HashMap<>();
		policies.put(WarrantyEnum.BASIC_WARRANTY, new BasicWarrantyPolicy());
		policies.put(WarrantyEnum.THEERY_YEARS_WARRANTY, new ThreeYearsWarrantyPolicy());
		
		var policy = policies.get(warranty);
		
		return policy.apply(this.customer);
	}
}
