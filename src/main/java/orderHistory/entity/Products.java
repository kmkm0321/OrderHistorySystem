package orderHistory.entity;

public class Products {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column products.product_code
	 * @mbg.generated  Sat Sep 14 06:48:47 JST 2024
	 */
	private String productCode;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column products.product_name
	 * @mbg.generated  Sat Sep 14 06:48:47 JST 2024
	 */
	private String productName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column products.size
	 * @mbg.generated  Sat Sep 14 06:48:47 JST 2024
	 */
	private String size;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column products.price
	 * @mbg.generated  Sat Sep 14 06:48:47 JST 2024
	 */
	private Integer price;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column products.product_code
	 * @return  the value of products.product_code
	 * @mbg.generated  Sat Sep 14 06:48:47 JST 2024
	 */
	public String getProductCode() {
		return productCode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column products.product_code
	 * @param productCode  the value for products.product_code
	 * @mbg.generated  Sat Sep 14 06:48:47 JST 2024
	 */
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column products.product_name
	 * @return  the value of products.product_name
	 * @mbg.generated  Sat Sep 14 06:48:47 JST 2024
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column products.product_name
	 * @param productName  the value for products.product_name
	 * @mbg.generated  Sat Sep 14 06:48:47 JST 2024
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column products.size
	 * @return  the value of products.size
	 * @mbg.generated  Sat Sep 14 06:48:47 JST 2024
	 */
	public String getSize() {
		return size;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column products.size
	 * @param size  the value for products.size
	 * @mbg.generated  Sat Sep 14 06:48:47 JST 2024
	 */
	public void setSize(String size) {
		this.size = size;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column products.price
	 * @return  the value of products.price
	 * @mbg.generated  Sat Sep 14 06:48:47 JST 2024
	 */
	public Integer getPrice() {
		return price;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column products.price
	 * @param price  the value for products.price
	 * @mbg.generated  Sat Sep 14 06:48:47 JST 2024
	 */
	public void setPrice(Integer price) {
		this.price = price;
	}
}