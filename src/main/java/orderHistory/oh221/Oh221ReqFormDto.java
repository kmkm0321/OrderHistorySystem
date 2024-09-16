package orderHistory.oh221;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Data;


/** 更新用社員編集フォーム
 * @author moriai
 *
 */
@Data
public class Oh221ReqFormDto {
	
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
	String familyKana;
	// 名かな
	@NotBlank
	String firstKana;
	// 電話番号
	@NotBlank
	String phone;
	// メールアドレス
	String email;
	// 生年月日
	@NotBlank
	String birthday;
	// 性別コード
	@NotBlank
	String genderCode;

}
