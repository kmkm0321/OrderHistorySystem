package orderHistory.oh220;

import java.util.List;

import lombok.Data;
import orderHistory.entity.Areas;
import orderHistory.entity.Prefectures;
import orderHistory.entity.Shops;

/*コンボボックスに設定するパラメータ群*/
@Data
public class Oh220ResConboBoxDto {
	
	/*エリア区分リスト*/
	private List<Areas> areas;
	/*都道府県リスト*/
	private List<Prefectures> prefs;
	/*ショップリスト*/
	private List<Shops> shops;

}
