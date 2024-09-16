package orderHistory.oh221;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;
import orderHistory.validation.Hankaku;
import orderHistory.validation.Hiragana;
import orderHistory.validation.NumberCheck;

/**　社員情報編集画面表示用dto
 * @author moriai
 *
 */
@Data
public class Oh221EmployeesInfoDto {
	
	// 社員テーブルid
	@NotNull
	String empId;
	// 社員コード
	@NotBlank
	String empCode;
	// 性
	@NotBlank
	String familyName;
	// 名
	@NotBlank
	String firstName;
	// 性かな
	@NotBlank
	@Hiragana
	String familyKana;
	// 名かな
	@NotBlank
	@Hiragana
	String firstKana;
	// 電話番号
	@NotBlank
	@Size(min = 10, max = 11)
	@Hankaku
	@NumberCheck
	String phone;
	// メールアドレス
	String email;
	// 生年月日
	@NotBlank
	String birthday;
	// 性別コード
	@NotBlank
	String genderCode;
	// 店舗コード
	String shopCode;
	// 店舗名
	String shopName;
	// 役職コード
	String titleCode;
	// 役職名
	String titleName;

}
