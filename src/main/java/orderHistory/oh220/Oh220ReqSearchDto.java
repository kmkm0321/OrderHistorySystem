package orderHistory.oh220;

import lombok.Data;

/*検索押下時のajaxからの検索条件値*/
@Data
public class Oh220ReqSearchDto {
	// エリア
    private int areasValue;
    // 都道府県
    private int prefsValue;
    // 店舗
    private String shopsValue;

}
