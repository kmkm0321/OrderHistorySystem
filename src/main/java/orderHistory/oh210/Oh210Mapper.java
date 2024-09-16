package orderHistory.oh210;


import java.util.List;


import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface Oh210Mapper {
	
	/*テスト用セレクトインターフェース*/
	public List<Oh210ResTestMapDto> selectTest(Oh210ReqTestValueDto test);
	
	/*売り上げ履歴取得用メソッド*/
	public List<Oh210ResSalesHistoryDto> selectSalesHistory(Oh210ReqSearchDto reqSearch);

}