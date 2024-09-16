package orderHistory.oh220;

import lombok.Data;

@Data
public class Oh220ResEmployeesListDto {
	
	/* 役職名 */
	String titleName;
	/* 社員コード */
	String empCode;
	/* 社員フルネーム */
	String fullName;
	/* 店舗名 */
	String shopName;
	/* 都道府県名 */
	String prefName;
	/* エリア名 */
	String areaName;
	/* 社員テーブルID */
	String empId;

}
