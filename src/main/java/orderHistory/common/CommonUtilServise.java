package orderHistory.common;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Service;

/**
 * @author moriai
 *
 */
@Service
public class CommonUtilServise {
	
	/** 日付のフォーマット変換　⇒　yyyy-MM-dd
	 * @param date 日付
	 * @return formattedDate フォーマット変換後日付
	 */
	public String changeDateFomat(String dateString) {

		try {
			// 文字列をDate型に変換
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date date = sdf.parse(dateString);
			// Date型を再度String型に変換
			dateString = sdf.format(date);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return dateString;
	}

}
