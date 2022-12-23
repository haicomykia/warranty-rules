package customer;
import java.time.LocalDate;

import warranty.WarrantyEnum;

/**
 * 顧客オブジェクト
 */
public class Customer {
	
	/**
	 * 名前
	 */
	private String name;
	
	/**
	 * 加入している保証
	 */
	private WarrantyEnum warranty;
	
	/**
	 * 保証開始日
	 */
	private LocalDate startDate;
	
	/*
	 * 保証解約日
	 */
	private LocalDate cancelDate;
	
	private Customer(String name, WarrantyEnum warranty, LocalDate startDate) {
		this.name = name;
		this.warranty = warranty;
		this.startDate = startDate;
		this.cancelDate = null;
	}
	
	/**
	 * 顧客オブジェクトのファクトリメソッド
	 * @param name 顧客名
	 * @return 顧客オブジェクトのインスタンス
	 */
	static public Customer of(String name) {
		return new Customer(name, WarrantyEnum.BASIC_WARRANTY, LocalDate.now());
	}
	
	/**
	 * 保証に加入
	 * @param warranty 加入する保証
	 * @param startDate 開始日
	 * @return 顧客クラスのインスタンス
	 */
	public void subscribeWarranty(WarrantyEnum warranty, LocalDate startDate) {
		this.warranty = warranty;
		this.startDate = startDate;
	}

	/**
	 * ユーザーが保証に加入しているか
	 * @return ユーザーが保証に加入しているか？
	 */
	public boolean hasSubscribed(WarrantyEnum warranty) {
		return this.warranty == warranty;
	}
	
	/**
	 * 解約
	 */
	public void cancelWarranty() {
		this.cancelDate = LocalDate.now();
	}

	/**
	 * 顧客の名前を返す
	 * @return 顧客の名前
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * 保証開始日を取得
	 * @return 保証開始日
	 */
	public LocalDate getStartDate() {
		return this.startDate;
	}
	
	/**
	 * 解約日を取得
	 * @return 解約日
	 */
	public LocalDate getCancelDate() {
		return this.cancelDate;
	}
	
	/**
	 * 解約済みか？
	 * @return 解約ずみなら<code>true</code>
	 */
	public boolean hasCanceled() {
		return this.cancelDate != null && LocalDate.now().compareTo(this.cancelDate) >= 0;
	}
}
