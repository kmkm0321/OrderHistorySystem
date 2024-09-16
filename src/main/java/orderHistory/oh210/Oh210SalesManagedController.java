package orderHistory.oh210;

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

@Controller
public class Oh210SalesManagedController {
	@Autowired
	Oh210SalesManagedService oh210SalesManagedService;
		
	@GetMapping("/oh210/sales_managed")
	public ModelAndView getSalesManaged(ModelAndView mv) {
		/*コンボボックスに設定するパラメータを取得、エリア区分をセット*/
		mv.addObject("areas", oh210SalesManagedService.getConboBoxValue().getAreas());
		/*レスポンスのHTMLリソース場所をセット*/
		mv.setViewName("/oh210/salesManaged");
		
		return mv;
	}
	
	@PostMapping("/oh210/postSelectedArea")
	@ResponseBody
	public List<Prefectures> postSelectedArea(@RequestBody Oh210ReqAreaOrPrefDto kv) {
		List<Prefectures> prefs = oh210SalesManagedService.getConboBoxValue(kv).getPrefs();
		return prefs;
	}
	
	@PostMapping("/oh210/postSelectedPref")
	@ResponseBody
	public List<Shops> postSelectedPref(@RequestBody Oh210ReqAreaOrPrefDto kv) {
		List<Shops> shops = oh210SalesManagedService.getConboBoxValue(kv).getShops();
		return shops;
	}
	
	@PostMapping("/oh210/postSearch")
	@ResponseBody
	public List<Oh210ResSalesHistoryDto> postSearch(@RequestBody Oh210ReqSearchDto reqSearch){
		List<Oh210ResSalesHistoryDto> res = oh210SalesManagedService.getSalesHistory(reqSearch);
		return res;
	}

}
