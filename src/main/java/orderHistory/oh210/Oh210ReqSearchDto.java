package orderHistory.oh210;

import lombok.Data;

/*検索押下時のajaxからの検索条件値*/
@Data
public class Oh210ReqSearchDto {
	// 年月
	private String yearAndMonth;
	// エリア
    private int areasValue;
    // 都道府県
    private int prefsValue;
    // 店舗
    private String shopsValue;
    
}
