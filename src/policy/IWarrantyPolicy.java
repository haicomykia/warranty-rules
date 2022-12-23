package policy;

import customer.Customer;
import message.IMessage;

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
	
	/**
	 * メッセージを返す
	 * @param message メッセージインタフェースの実装クラス
	 * @param customer 顧客オブジェクト
	 * @return メッセージ
	 */
	public String apply(IMessage message, Customer customer);
}
