package message;

import customer.Customer;
import warranty.WarrantyEnum;

/**
 * メッセージインタフェース
 * 各文章は実装クラスにて定義
 */
public interface IMessage {
	/**
	 * 顧客名と保証情報メッセージの雛形に当てはめて返す
	 * @param customer 顧客オブジェクト
	 * @param warranty 保証の列挙体メンバ
	 * @return メッセージ
	 */
	public String apply(Customer customer, WarrantyEnum warranty);
}
