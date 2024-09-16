package orderHistory.oh210;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import orderHistory.entity.Areas;
import orderHistory.entity.AreasExample;
import orderHistory.entity.Prefectures;
import orderHistory.entity.PrefecturesExample;
import orderHistory.entity.Shops;
import orderHistory.entity.ShopsExample;
import orderHistory.mappers.AreasMapper;
import orderHistory.mappers.PrefecturesMapper;
import orderHistory.mappers.ShopsMapper;


@Repository
public class Oh210SalesManagedRepository {
	@Autowired
	AreasMapper areasMapper;
	AreasExample areasExample = new AreasExample();
	@Autowired
	PrefecturesMapper prefsMapper;
	PrefecturesExample prefsExample = new PrefecturesExample();
	@Autowired
	ShopsMapper shopsMapper;
	ShopsExample shopsExample = new ShopsExample();
	@Autowired
	Oh210Mapper mapper;
	
	/*エリア区分リスト取得メソッド　全て*/
	public List<Areas> getAreaDivisionAll() {
		areasExample.clear();
		return areasMapper.selectByExample(areasExample);
	}
	
	/*都道府県リスト取得メソッド　全て*/
	public List<Prefectures> getPrefAll(){
		prefsExample.clear();
		return prefsMapper.selectByExample(prefsExample);
	}
	
	/*ショップリスト取得メソッド　全て*/
	public List<Shops> getShopsAll(){
		shopsExample.clear();
		return shopsMapper.selectByExample(shopsExample);
	}
	
	/*都道府県リスト取得メソッド　条件：エリア区分コード*/
	public List<Prefectures> getPrefs(String value){
		int num = Integer.parseInt(value);
		prefsExample.clear();
		prefsExample.createCriteria().andAreaCodeEqualTo(num);
		return prefsMapper.selectByExample(prefsExample);
	}
	
	/*ショップリスト取得メソッド　条件：都道府県コード*/
	public List<Shops> getShops(String value){
		int num = Integer.parseInt(value);
		shopsExample.clear();
		shopsExample.createCriteria().andPrefectureCodeEqualTo(num);
		return shopsMapper.selectByExample(shopsExample);
	}
	
	/*売り上げ履歴取得用メソッド*/
	public List<Oh210ResSalesHistoryDto> getSalesHistorryList(Oh210ReqSearchDto reqSearch) {
		return mapper.selectSalesHistory(reqSearch);
	}
	
	/*テストメソッド*/
	public void getTestList(Oh210ReqTestValueDto test) {
		test.setShopCode("27-01");
		List<Oh210ResTestMapDto> result = mapper.selectTest(test);
		System.out.print(result);
	}

}
