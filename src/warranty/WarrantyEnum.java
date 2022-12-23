package warranty;

/**
 * 保証の列挙体
 */
public enum WarrantyEnum implements IWarranty {
	
	/**
	 * なし
	 */
	NONE {		
		@Override
		public int getYearsOfWarranty() {
			return 0;
		}
		
		@Override
		public int getWarratyCode() {
			return 101;
		}
		
		@Override
		public String getWarratyName() {
			return "未加入";
		}
	},
	/*
	 * ベーシック保証
	 */
	BASIC_WARRANTY {
		@Override
		public int getYearsOfWarranty() {
			return 1;
		}
		
		@Override
		public int getWarratyCode() {
			return 101;
		}
		
		@Override
		public String getWarratyName() {
			return "ベーシック保証";
		}
	},
	/**
	 * 3年保証
	 */
	THEERY_YEARS_WARRANTY {
		@Override
		public int getYearsOfWarranty() {
			return 3;
		}
		
		@Override
		public int getWarratyCode() {
			return 301;
		}
		
		@Override
		public String getWarratyName() {
			return "3年保証";
		}
	},
	
	/**
	 * 5年保証
	 */
	FIVE_YEARS_WARRANTY {
		@Override
		public int getYearsOfWarranty() {
			return 5;
		}
		
		@Override
		public int getWarratyCode() {
			return 401;
		}
		
		@Override
		public String getWarratyName() {
			return "5年保証";
		}
	};
}
