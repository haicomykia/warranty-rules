package policy;

import customer.Customer;
import rules.SubscribeRule;
import rules.WarrantyPeriodRule;
import warranty.WarrantyEnum;

/**
 * 三年保証のポリシークラス
 */
public class ThreeYearsWarrantyPolicy implements IWarrantyPolicy {
	
	/**
	 * 保証
	 */
	final private WarrantyEnum warranty;
	
	/**
	 * 保証のポリシークラス
	 */
	final private WarrantyPolicy policy;
	
	public ThreeYearsWarrantyPolicy() {
		this.warranty = WarrantyEnum.THEERY_YEARS_WARRANTY;
		
		this.policy = new WarrantyPolicy(this.warranty);
		this.policy.add(new SubscribeRule());
		this.policy.add(new WarrantyPeriodRule());
	}
	
	@Override
	public boolean complyAll(Customer customer) {
		return this.policy.complyAll(customer);
	}
	
	@Override
	public String apply(Customer customer) {
		return this.policy.apply(customer);
	}
}
