package orderHistory.oh221;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import orderHistory.common.CommonUtilServise;
import orderHistory.mappers.EmployeesMapper;

/**
 * @author moriai
 *
 */
@Service
public class Oh221EmployeesEditFormServise {
//	@Autowired
//	Oh221EmployeeEditformRepository repository;
	@Autowired
	EmployeesMapper employeesMapper;
	@Autowired
	CommonUtilServise commonUtilServise;
	@Autowired
	Oh221Mapper oh221mapper;
	
	/** 編集用既存社員情報を取得
	 * @param empId 社員テーブルid
	 * @return empInfo 編集用既存社員情報
	 */
	public Oh221EmployeesInfoDto getEmployeesInfo(String empId) {
		
		//　編集用既存社員情報を取得
		Oh221EmployeesInfoDto employeesInfoDto = oh221mapper.getEmployeesInfo(empId);
		// 生年月日をyyyy-MM-ddにフォーマット、HTMLで表示させるため
		String birthday = commonUtilServise.changeDateFomat(employeesInfoDto.getBirthday());
		employeesInfoDto.setBirthday(birthday);
		
		return employeesInfoDto;
	}
	
}