package rules;

import customer.Customer;
import warranty.WarrantyEnum;

/**
 * 保証加入のルール
 */
public interface IWarrantySubscribeRule {
	
	/**
	 * 顧客が保証に加入しているか？
	 * @param customer 顧客クラスのオブジェクト
	 * @param warranty 保証
	 * @return 加入していれば <code>true</code>
	 */
	public boolean complyWith(Customer customer, WarrantyEnum warranty);
}
