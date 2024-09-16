package orderHistory.entity;

import java.util.ArrayList;
import java.util.List;

public class ShopsExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table shops
	 * @mbg.generated  Sat Sep 14 06:48:47 JST 2024
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table shops
	 * @mbg.generated  Sat Sep 14 06:48:47 JST 2024
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table shops
	 * @mbg.generated  Sat Sep 14 06:48:47 JST 2024
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table shops
	 * @mbg.generated  Sat Sep 14 06:48:47 JST 2024
	 */
	public ShopsExample() {
		oredCriteria = new ArrayList<>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table shops
	 * @mbg.generated  Sat Sep 14 06:48:47 JST 2024
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table shops
	 * @mbg.generated  Sat Sep 14 06:48:47 JST 2024
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table shops
	 * @mbg.generated  Sat Sep 14 06:48:47 JST 2024
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table shops
	 * @mbg.generated  Sat Sep 14 06:48:47 JST 2024
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table shops
	 * @mbg.generated  Sat Sep 14 06:48:47 JST 2024
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table shops
	 * @mbg.generated  Sat Sep 14 06:48:47 JST 2024
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table shops
	 * @mbg.generated  Sat Sep 14 06:48:47 JST 2024
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table shops
	 * @mbg.generated  Sat Sep 14 06:48:47 JST 2024
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table shops
	 * @mbg.generated  Sat Sep 14 06:48:47 JST 2024
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table shops
	 * @mbg.generated  Sat Sep 14 06:48:47 JST 2024
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table shops
	 * @mbg.generated  Sat Sep 14 06:48:47 JST 2024
	 */
	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1, Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andShopCodeIsNull() {
			addCriterion("shop_code is null");
			return (Criteria) this;
		}

		public Criteria andShopCodeIsNotNull() {
			addCriterion("shop_code is not null");
			return (Criteria) this;
		}

		public Criteria andShopCodeEqualTo(String value) {
			addCriterion("shop_code =", value, "shopCode");
			return (Criteria) this;
		}

		public Criteria andShopCodeNotEqualTo(String value) {
			addCriterion("shop_code <>", value, "shopCode");
			return (Criteria) this;
		}

		public Criteria andShopCodeGreaterThan(String value) {
			addCriterion("shop_code >", value, "shopCode");
			return (Criteria) this;
		}

		public Criteria andShopCodeGreaterThanOrEqualTo(String value) {
			addCriterion("shop_code >=", value, "shopCode");
			return (Criteria) this;
		}

		public Criteria andShopCodeLessThan(String value) {
			addCriterion("shop_code <", value, "shopCode");
			return (Criteria) this;
		}

		public Criteria andShopCodeLessThanOrEqualTo(String value) {
			addCriterion("shop_code <=", value, "shopCode");
			return (Criteria) this;
		}

		public Criteria andShopCodeLike(String value) {
			addCriterion("shop_code like", value, "shopCode");
			return (Criteria) this;
		}

		public Criteria andShopCodeNotLike(String value) {
			addCriterion("shop_code not like", value, "shopCode");
			return (Criteria) this;
		}

		public Criteria andShopCodeIn(List<String> values) {
			addCriterion("shop_code in", values, "shopCode");
			return (Criteria) this;
		}

		public Criteria andShopCodeNotIn(List<String> values) {
			addCriterion("shop_code not in", values, "shopCode");
			return (Criteria) this;
		}

		public Criteria andShopCodeBetween(String value1, String value2) {
			addCriterion("shop_code between", value1, value2, "shopCode");
			return (Criteria) this;
		}

		public Criteria andShopCodeNotBetween(String value1, String value2) {
			addCriterion("shop_code not between", value1, value2, "shopCode");
			return (Criteria) this;
		}

		public Criteria andShopNameIsNull() {
			addCriterion("shop_name is null");
			return (Criteria) this;
		}

		public Criteria andShopNameIsNotNull() {
			addCriterion("shop_name is not null");
			return (Criteria) this;
		}

		public Criteria andShopNameEqualTo(String value) {
			addCriterion("shop_name =", value, "shopName");
			return (Criteria) this;
		}

		public Criteria andShopNameNotEqualTo(String value) {
			addCriterion("shop_name <>", value, "shopName");
			return (Criteria) this;
		}

		public Criteria andShopNameGreaterThan(String value) {
			addCriterion("shop_name >", value, "shopName");
			return (Criteria) this;
		}

		public Criteria andShopNameGreaterThanOrEqualTo(String value) {
			addCriterion("shop_name >=", value, "shopName");
			return (Criteria) this;
		}

		public Criteria andShopNameLessThan(String value) {
			addCriterion("shop_name <", value, "shopName");
			return (Criteria) this;
		}

		public Criteria andShopNameLessThanOrEqualTo(String value) {
			addCriterion("shop_name <=", value, "shopName");
			return (Criteria) this;
		}

		public Criteria andShopNameLike(String value) {
			addCriterion("shop_name like", value, "shopName");
			return (Criteria) this;
		}

		public Criteria andShopNameNotLike(String value) {
			addCriterion("shop_name not like", value, "shopName");
			return (Criteria) this;
		}

		public Criteria andShopNameIn(List<String> values) {
			addCriterion("shop_name in", values, "shopName");
			return (Criteria) this;
		}

		public Criteria andShopNameNotIn(List<String> values) {
			addCriterion("shop_name not in", values, "shopName");
			return (Criteria) this;
		}

		public Criteria andShopNameBetween(String value1, String value2) {
			addCriterion("shop_name between", value1, value2, "shopName");
			return (Criteria) this;
		}

		public Criteria andShopNameNotBetween(String value1, String value2) {
			addCriterion("shop_name not between", value1, value2, "shopName");
			return (Criteria) this;
		}

		public Criteria andPrefectureCodeIsNull() {
			addCriterion("prefecture_code is null");
			return (Criteria) this;
		}

		public Criteria andPrefectureCodeIsNotNull() {
			addCriterion("prefecture_code is not null");
			return (Criteria) this;
		}

		public Criteria andPrefectureCodeEqualTo(Integer value) {
			addCriterion("prefecture_code =", value, "prefectureCode");
			return (Criteria) this;
		}

		public Criteria andPrefectureCodeNotEqualTo(Integer value) {
			addCriterion("prefecture_code <>", value, "prefectureCode");
			return (Criteria) this;
		}

		public Criteria andPrefectureCodeGreaterThan(Integer value) {
			addCriterion("prefecture_code >", value, "prefectureCode");
			return (Criteria) this;
		}

		public Criteria andPrefectureCodeGreaterThanOrEqualTo(Integer value) {
			addCriterion("prefecture_code >=", value, "prefectureCode");
			return (Criteria) this;
		}

		public Criteria andPrefectureCodeLessThan(Integer value) {
			addCriterion("prefecture_code <", value, "prefectureCode");
			return (Criteria) this;
		}

		public Criteria andPrefectureCodeLessThanOrEqualTo(Integer value) {
			addCriterion("prefecture_code <=", value, "prefectureCode");
			return (Criteria) this;
		}

		public Criteria andPrefectureCodeIn(List<Integer> values) {
			addCriterion("prefecture_code in", values, "prefectureCode");
			return (Criteria) this;
		}

		public Criteria andPrefectureCodeNotIn(List<Integer> values) {
			addCriterion("prefecture_code not in", values, "prefectureCode");
			return (Criteria) this;
		}

		public Criteria andPrefectureCodeBetween(Integer value1, Integer value2) {
			addCriterion("prefecture_code between", value1, value2, "prefectureCode");
			return (Criteria) this;
		}

		public Criteria andPrefectureCodeNotBetween(Integer value1, Integer value2) {
			addCriterion("prefecture_code not between", value1, value2, "prefectureCode");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table shops
	 * @mbg.generated  Sat Sep 14 06:48:47 JST 2024
	 */
	public static class Criterion {
		private String condition;
		private Object value;
		private Object secondValue;
		private boolean noValue;
		private boolean singleValue;
		private boolean betweenValue;
		private boolean listValue;
		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
			return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table shops
     *
     * @mbg.generated do_not_delete_during_merge Sun Sep 18 20:43:32 JST 2022
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }
}