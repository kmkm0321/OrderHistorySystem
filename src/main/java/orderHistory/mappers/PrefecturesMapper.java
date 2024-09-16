package orderHistory.mappers;

import java.util.List;
import orderHistory.entity.Prefectures;
import orderHistory.entity.PrefecturesExample;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PrefecturesMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table prefectures
	 * @mbg.generated  Sat Sep 14 06:48:47 JST 2024
	 */
	long countByExample(PrefecturesExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table prefectures
	 * @mbg.generated  Sat Sep 14 06:48:47 JST 2024
	 */
	int deleteByExample(PrefecturesExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table prefectures
	 * @mbg.generated  Sat Sep 14 06:48:47 JST 2024
	 */
	int deleteByPrimaryKey(Integer prefectureCode);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table prefectures
	 * @mbg.generated  Sat Sep 14 06:48:47 JST 2024
	 */
	int insert(Prefectures row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table prefectures
	 * @mbg.generated  Sat Sep 14 06:48:47 JST 2024
	 */
	int insertSelective(Prefectures row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table prefectures
	 * @mbg.generated  Sat Sep 14 06:48:47 JST 2024
	 */
	List<Prefectures> selectByExample(PrefecturesExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table prefectures
	 * @mbg.generated  Sat Sep 14 06:48:47 JST 2024
	 */
	Prefectures selectByPrimaryKey(Integer prefectureCode);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table prefectures
	 * @mbg.generated  Sat Sep 14 06:48:47 JST 2024
	 */
	int updateByExampleSelective(@Param("row") Prefectures row, @Param("example") PrefecturesExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table prefectures
	 * @mbg.generated  Sat Sep 14 06:48:47 JST 2024
	 */
	int updateByExample(@Param("row") Prefectures row, @Param("example") PrefecturesExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table prefectures
	 * @mbg.generated  Sat Sep 14 06:48:47 JST 2024
	 */
	int updateByPrimaryKeySelective(Prefectures row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table prefectures
	 * @mbg.generated  Sat Sep 14 06:48:47 JST 2024
	 */
	int updateByPrimaryKey(Prefectures row);
}