package orderHistory.oh221;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface Oh221Mapper {
	
	/*編集用社員情報取得用メソッド*/
	public Oh221EmployeesInfoDto getEmployeesInfo(String empId);

}
