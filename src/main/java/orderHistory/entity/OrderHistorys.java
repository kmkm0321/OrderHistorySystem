package orderHistory.entity;

import java.util.Date;

public class OrderHistorys {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order_historys.order_code
	 * @mbg.generated  Sat Sep 14 06:48:47 JST 2024
	 */
	private String orderCode;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order_historys.order_date
	 * @mbg.generated  Sat Sep 14 06:48:47 JST 2024
	 */
	private Date orderDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order_historys.product_code
	 * @mbg.generated  Sat Sep 14 06:48:47 JST 2024
	 */
	private String productCode;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order_historys.quantity
	 * @mbg.generated  Sat Sep 14 06:48:47 JST 2024
	 */
	private Integer quantity;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order_historys.shop_code
	 * @mbg.generated  Sat Sep 14 06:48:47 JST 2024
	 */
	private String shopCode;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order_historys.seller
	 * @mbg.generated  Sat Sep 14 06:48:47 JST 2024
	 */
	private String seller;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order_historys.buyer
	 * @mbg.generated  Sat Sep 14 06:48:47 JST 2024
	 */
	private String buyer;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order_historys.order_code
	 * @return  the value of order_historys.order_code
	 * @mbg.generated  Sat Sep 14 06:48:47 JST 2024
	 */
	public String getOrderCode() {
		return orderCode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order_historys.order_code
	 * @param orderCode  the value for order_historys.order_code
	 * @mbg.generated  Sat Sep 14 06:48:47 JST 2024
	 */
	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order_historys.order_date
	 * @return  the value of order_historys.order_date
	 * @mbg.generated  Sat Sep 14 06:48:47 JST 2024
	 */
	public Date getOrderDate() {
		return orderDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order_historys.order_date
	 * @param orderDate  the value for order_historys.order_date
	 * @mbg.generated  Sat Sep 14 06:48:47 JST 2024
	 */
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order_historys.product_code
	 * @return  the value of order_historys.product_code
	 * @mbg.generated  Sat Sep 14 06:48:47 JST 2024
	 */
	public String getProductCode() {
		return productCode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order_historys.product_code
	 * @param productCode  the value for order_historys.product_code
	 * @mbg.generated  Sat Sep 14 06:48:47 JST 2024
	 */
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order_historys.quantity
	 * @return  the value of order_historys.quantity
	 * @mbg.generated  Sat Sep 14 06:48:47 JST 2024
	 */
	public Integer getQuantity() {
		return quantity;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order_historys.quantity
	 * @param quantity  the value for order_historys.quantity
	 * @mbg.generated  Sat Sep 14 06:48:47 JST 2024
	 */
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order_historys.shop_code
	 * @return  the value of order_historys.shop_code
	 * @mbg.generated  Sat Sep 14 06:48:47 JST 2024
	 */
	public String getShopCode() {
		return shopCode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order_historys.shop_code
	 * @param shopCode  the value for order_historys.shop_code
	 * @mbg.generated  Sat Sep 14 06:48:47 JST 2024
	 */
	public void setShopCode(String shopCode) {
		this.shopCode = shopCode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order_historys.seller
	 * @return  the value of order_historys.seller
	 * @mbg.generated  Sat Sep 14 06:48:47 JST 2024
	 */
	public String getSeller() {
		return seller;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order_historys.seller
	 * @param seller  the value for order_historys.seller
	 * @mbg.generated  Sat Sep 14 06:48:47 JST 2024
	 */
	public void setSeller(String seller) {
		this.seller = seller;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order_historys.buyer
	 * @return  the value of order_historys.buyer
	 * @mbg.generated  Sat Sep 14 06:48:47 JST 2024
	 */
	public String getBuyer() {
		return buyer;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order_historys.buyer
	 * @param buyer  the value for order_historys.buyer
	 * @mbg.generated  Sat Sep 14 06:48:47 JST 2024
	 */
	public void setBuyer(String buyer) {
		this.buyer = buyer;
	}
}