package message;

/**
 * メッセージインタフェース
 * 各文章は実装クラスにて定義
 */
public interface IMessage {
	/**
	 * 顧客名と保証情報メッセージの雛形に当てはめて返す
	 * @return メッセージ
	 */
	public String apply();
}
