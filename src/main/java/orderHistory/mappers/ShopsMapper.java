package orderHistory.mappers;

import java.util.List;
import orderHistory.entity.Shops;
import orderHistory.entity.ShopsExample;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ShopsMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table shops
	 * @mbg.generated  Sat Sep 14 06:48:47 JST 2024
	 */
	long countByExample(ShopsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table shops
	 * @mbg.generated  Sat Sep 14 06:48:47 JST 2024
	 */
	int deleteByExample(ShopsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table shops
	 * @mbg.generated  Sat Sep 14 06:48:47 JST 2024
	 */
	int deleteByPrimaryKey(String shopCode);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table shops
	 * @mbg.generated  Sat Sep 14 06:48:47 JST 2024
	 */
	int insert(Shops row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table shops
	 * @mbg.generated  Sat Sep 14 06:48:47 JST 2024
	 */
	int insertSelective(Shops row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table shops
	 * @mbg.generated  Sat Sep 14 06:48:47 JST 2024
	 */
	List<Shops> selectByExample(ShopsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table shops
	 * @mbg.generated  Sat Sep 14 06:48:47 JST 2024
	 */
	Shops selectByPrimaryKey(String shopCode);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table shops
	 * @mbg.generated  Sat Sep 14 06:48:47 JST 2024
	 */
	int updateByExampleSelective(@Param("row") Shops row, @Param("example") ShopsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table shops
	 * @mbg.generated  Sat Sep 14 06:48:47 JST 2024
	 */
	int updateByExample(@Param("row") Shops row, @Param("example") ShopsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table shops
	 * @mbg.generated  Sat Sep 14 06:48:47 JST 2024
	 */
	int updateByPrimaryKeySelective(Shops row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table shops
	 * @mbg.generated  Sat Sep 14 06:48:47 JST 2024
	 */
	int updateByPrimaryKey(Shops row);
}