package orderHistory.oh221;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/** 社員情報編集画面コントローラー
 * @author moriai
 *
 */
@Controller
public class Oh221EmployeesEditFormController {
	@Autowired
	Oh221EmployeesEditFormServise employeesEditFormServise;
	
	/**　社員編集画面からの初期表示
	 * @param empId 社員id
	 * @return　画面遷移先
	 */
	@GetMapping("/oh221/employees_edit/form")
	public String getSalesManaged(Model model, 
			@RequestParam(value = "empId", required = false) String empId) {
		// 編集用社員情報取得
		Oh221EmployeesInfoDto employeesInfoDto = employeesEditFormServise.getEmployeesInfo(empId);
		model.addAttribute("employeesInfo", employeesInfoDto);
		
        return "/oh221/employeesEditForm";
	}
	
	/**　登録ボタン押下
	 * @param　employeesInfoDto 社員情報編集画面表示用dto
	 * @return　画面遷移先
	 */
	@PostMapping("/oh221/employees_edit/submit")
	public String postSelectedArea(@Validated @ModelAttribute("employeesInfo") Oh221EmployeesInfoDto employeesInfoDto, 
			BindingResult bindingResult, 
			Model model) {
		
		// 入力チェック
		if (bindingResult.hasErrors()) {
			 for (FieldError error : bindingResult.getFieldErrors()) {
		            String message = error.getDefaultMessage();
		            System.out.println(message);
		        }
			 model.addAttribute("employeesInfo", employeesInfoDto);
			 return "/oh221/employeesEditForm";
		}
		
		return "/oh221/employeesUpdated";
	}
	
}
