package policy;

import customer.Customer;

/**
 * ポリシークラスのインタフェース
 */
public interface IWarrantyPolicy {

	/**
	 * ルールをすべて満たしているか？
	 * @param customer 顧客オブジェクト
	 * @return 保証への加入状況を返す
	 */
	public boolean complyAll(Customer customer);
	
	public String applyMessage(Customer customer);
}
