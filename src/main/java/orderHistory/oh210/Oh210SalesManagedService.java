package orderHistory.oh210;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import orderHistory.entity.Areas;
import orderHistory.entity.Prefectures;
import orderHistory.entity.Shops;


@Service
public class Oh210SalesManagedService {
	@Autowired
	Oh210SalesManagedRepository repository;
	@Autowired
	Oh210ResConboBoxDto resConboBox;
	
	public Oh210ResConboBoxDto getConboBoxValue() {
		/*エリア区分を取得、返却値にセット*/
		List<Areas> areas = repository.getAreaDivisionAll();
		resConboBox.setAreas(areas);		
		
		return resConboBox;		
	}

	public Oh210ResConboBoxDto getConboBoxValue(Oh210ReqAreaOrPrefDto kv) {
		/*パラメータがエリア区分か都道府県かキーをもとに判別*/
		if(kv.getKey().equals("area")) {
			/*エリアに紐づく都道府県を取得、返却値にセット*/
			List<Prefectures> prefs = repository.getPrefs(kv.getValue());
			resConboBox.setPrefs(prefs);
		}else {
			/*都道府県に紐づくショップを取得、返却値にセット*/
			List<Shops> shops = repository.getShops(kv.getValue());
			resConboBox.setShops(shops);
		}	
		return resConboBox;		
	}
	
	public List<Oh210ResSalesHistoryDto> getSalesHistory(Oh210ReqSearchDto reqSearch){
		return repository.getSalesHistorryList(reqSearch);
	}
	
	/*test*/
	public void getTest(Oh210ReqTestValueDto test){
		repository.getTestList(test);
	}

}
