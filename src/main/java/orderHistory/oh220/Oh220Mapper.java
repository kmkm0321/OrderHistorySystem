package orderHistory.oh220;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface Oh220Mapper {
	
	/*編集用社員一覧取得用メソッド*/
	public List<Oh220ResEmployeesListDto> getEmployeesList(Oh220ReqSearchDto reqSearch);

}
