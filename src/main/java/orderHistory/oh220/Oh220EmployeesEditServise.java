package orderHistory.oh220;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import orderHistory.entity.Areas;
import orderHistory.entity.Prefectures;
import orderHistory.entity.Shops;

@Service
public class Oh220EmployeesEditServise {
	@Autowired
	Oh220EmployeesEditRepository oh220EmployeesEditRepository;
	@Autowired
	Oh220ResConboBoxDto resConboBox;
	
	public Oh220ResConboBoxDto getConboBoxValue() {
		/*エリア区分を取得、返却値にセット*/
		List<Areas> areas = oh220EmployeesEditRepository.getAreaDivisionAll();
		resConboBox.setAreas(areas);		
		
		return resConboBox;
	}
	
	public Oh220ResConboBoxDto getConboBoxValue(Oh220ReqAreaOrPrefDto dto) {
		/*パラメータがエリア区分か都道府県かキーをもとに判別*/
		if(dto.getKey().equals("area")) {
			/*エリアに紐づく都道府県を取得、返却値にセット*/
			List<Prefectures> prefs = oh220EmployeesEditRepository.getPrefs(dto.getValue());
			resConboBox.setPrefs(prefs);
		}else {
			/*都道府県に紐づくショップを取得、返却値にセット*/
			List<Shops> shops = oh220EmployeesEditRepository.getShops(dto.getValue());
			resConboBox.setShops(shops);
		}	
		return resConboBox;		
	}
	
	/*編集用社員一覧取得用メソッド*/
	public List<Oh220ResEmployeesListDto> getEmployeeList(Oh220ReqSearchDto reqSearch) {
		return oh220EmployeesEditRepository.getEmployeesList(reqSearch);
	}
	
}