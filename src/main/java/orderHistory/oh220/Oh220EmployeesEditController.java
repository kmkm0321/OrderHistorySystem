package orderHistory.oh220;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import orderHistory.entity.Prefectures;
import orderHistory.entity.Shops;


/** 社員編集（検索）画面コントローラー
 * @author moriai
 *
 */
@Controller
public class Oh220EmployeesEditController {
	@Autowired
	Oh220EmployeesEditServise oh220EmployeesEditServise;
		
	@GetMapping("/oh220/employees_edit")
	public ModelAndView getSalesManaged(ModelAndView mv) {
		/*コンボボックスに設定するパラメータを取得、エリア区分をセット*/
		mv.addObject("areas", oh220EmployeesEditServise.getConboBoxValue().getAreas());
		/*レスポンスのHTMLリソース場所をセット*/
		mv.setViewName("/oh220/employeesEdit");
		
		return mv;
	}
	
	@PostMapping("/oh220/postSelectedArea")
	@ResponseBody
	public List<Prefectures> postSelectedArea(@RequestBody Oh220ReqAreaOrPrefDto dto) {
		List<Prefectures> prefs = oh220EmployeesEditServise.getConboBoxValue(dto).getPrefs();
		return prefs;
	}
	
	@PostMapping("/oh220/postSelectedPref")
	@ResponseBody
	public List<Shops> postSelectedPref(@RequestBody Oh220ReqAreaOrPrefDto dto) {
		List<Shops> shops = oh220EmployeesEditServise.getConboBoxValue(dto).getShops();
		return shops;
	}
	
	@PostMapping("/oh220/postSearch")
	@ResponseBody
	public List<Oh220ResEmployeesListDto> postSearch(@RequestBody Oh220ReqSearchDto reqSearch){
		List<Oh220ResEmployeesListDto> res = oh220EmployeesEditServise.getEmployeeList(reqSearch);
		return res;
	}
	
}
