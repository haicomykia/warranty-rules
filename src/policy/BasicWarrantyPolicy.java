package policy;

import customer.Customer;
import rules.SubscribeRule;
import rules.WarrantyPeriodRule;
import warranty.WarrantyEnum;

/**
 * ベーシック保証のポリシー
 */
public class BasicWarrantyPolicy implements IWarrantyPolicy {

	/**
	 * 保証
	 */
	final private WarrantyEnum warranty;
	
	/**
	 * 保証のポリシークラス
	 */
	final private WarrantyPolicy policy;
	
	public BasicWarrantyPolicy() {
		this.warranty = WarrantyEnum.BASIC_WARRANTY;
		
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
