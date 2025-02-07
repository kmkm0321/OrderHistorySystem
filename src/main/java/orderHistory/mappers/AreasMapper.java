package orderHistory.mappers;

import java.util.List;
import orderHistory.entity.Areas;
import orderHistory.entity.AreasExample;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AreasMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table areas
	 * @mbg.generated  Sat Sep 14 06:48:47 JST 2024
	 */
	long countByExample(AreasExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table areas
	 * @mbg.generated  Sat Sep 14 06:48:47 JST 2024
	 */
	int deleteByExample(AreasExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table areas
	 * @mbg.generated  Sat Sep 14 06:48:47 JST 2024
	 */
	int deleteByPrimaryKey(Integer areaCode);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table areas
	 * @mbg.generated  Sat Sep 14 06:48:47 JST 2024
	 */
	int insert(Areas row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table areas
	 * @mbg.generated  Sat Sep 14 06:48:47 JST 2024
	 */
	int insertSelective(Areas row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table areas
	 * @mbg.generated  Sat Sep 14 06:48:47 JST 2024
	 */
	List<Areas> selectByExample(AreasExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table areas
	 * @mbg.generated  Sat Sep 14 06:48:47 JST 2024
	 */
	Areas selectByPrimaryKey(Integer areaCode);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table areas
	 * @mbg.generated  Sat Sep 14 06:48:47 JST 2024
	 */
	int updateByExampleSelective(@Param("row") Areas row, @Param("example") AreasExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table areas
	 * @mbg.generated  Sat Sep 14 06:48:47 JST 2024
	 */
	int updateByExample(@Param("row") Areas row, @Param("example") AreasExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table areas
	 * @mbg.generated  Sat Sep 14 06:48:47 JST 2024
	 */
	int updateByPrimaryKeySelective(Areas row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table areas
	 * @mbg.generated  Sat Sep 14 06:48:47 JST 2024
	 */
	int updateByPrimaryKey(Areas row);
}