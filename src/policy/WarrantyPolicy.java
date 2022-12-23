package policy;

import java.util.LinkedHashSet;
import java.util.Set;

import customer.Customer;
import rules.IWarrantySubscribeRule;
import warranty.WarrantyEnum;

/**
 * 
 * 保証のポリシークラス
 *
 */
public class WarrantyPolicy {
	
	/**
	 * ルール
	 */
	final private Set<IWarrantySubscribeRule> rules;
	
	/**
	 * 保証
	 */
	final private WarrantyEnum warranty;
	
	public WarrantyPolicy(WarrantyEnum warraty) {
		// 判定順を追加順にしたいのでLinkedHashSet
		this.rules = new LinkedHashSet<>(); 
		this.warranty = warraty;
	}
	
	/**
	 * ルールを追加
	 * @param rule ルール
	 */
	public void add(IWarrantySubscribeRule rule) {
		this.rules.add(rule);
	}
	
	/**
	 * 顧客が保証の加入状況のルールに一致しているか？
	 * @param customer 顧客オブジェクトのインスタンス
	 * @return 顧客が保証の加入状況のルールにすべて一致していれば<code>true</code>
	 */
	public boolean complyAll(Customer customer) {
		for (IWarrantySubscribeRule rule : rules) {
			if (!rule.complyWith(customer, this.warranty)) {
				return false;
			}
		}
		
		return true;
	}
	
	/**
	 * 加入状況を調べて、条件を満たさない場合は該当するメッセージを返す
	 * @param customer 顧客オブジェクト
	 * @return メッセージ
	 */
	public String apply(Customer customer) {
		for (IWarrantySubscribeRule rule : rules) {
			if (!rule.complyWith(customer, this.warranty)) {
				return rule.apply(customer, this.warranty);
			}
		}
		
		return "";
	}
}
