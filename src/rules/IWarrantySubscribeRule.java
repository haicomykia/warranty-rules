package rules;

import customer.Customer;
import warranty.WarrantyEnum;

/**
 * 保証加入状況のルール
 */
public interface IWarrantySubscribeRule {
	
	/**
	 * 顧客が保証に加入しているか？
	 * @param customer 顧客クラスのオブジェクト
	 * @param warranty 保証の列挙体メンバ
	 * @return 加入していれば <code>true</code>
	 */
	public boolean complyWith(Customer customer, WarrantyEnum warranty);
	
	/**
	 * @param customer 顧客クラスのオブジェクト
	 * @param warranty 保証の列挙体メンバ
	 * @return ルールに適合または不適合のときメッセージ
	 */
	public String apply(Customer customer, WarrantyEnum warranty);
}
