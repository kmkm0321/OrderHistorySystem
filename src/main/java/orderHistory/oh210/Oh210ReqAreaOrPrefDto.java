package orderHistory.oh210;

import lombok.Data;

/*コンボボックスを制御するためのajaxからのコンボボックスのキーと値*/
@Data
public class Oh210ReqAreaOrPrefDto {
	
	/* "area" or "pref" */
	private String key;
	/*エリアか都道府県の選択値*/
	private String value;

}
