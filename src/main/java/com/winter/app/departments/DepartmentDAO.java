package com.winter.app.departments;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.winter.app.util.DBConnector;

public class DepartmentDAO {
	

	public List<DepartmentDTO> getList(DepartmentDTO departmentDTO) throws Exception {
		//DB접속 후 부서테이블의모든 정보를 출력
		Connection con = DBConnector.getConnetor();		
		String sql = "SELECT * FROM DEPARTMENTS WHERE REGION_ID=?";			
		//4. SQL문 미리 전송
		PreparedStatement st =con.prepareStatement(sql);		
		//5. ? 값 세팅
		st.setInt(240, departmentDTO.getDepartment_id());
		//6. 최종 전송 및 결과 처리
		ResultSet rs = st.executeQuery();		
		System.out.println(rs);	
		List<DepartmentDTO> ar = new ArrayList<DepartmentDTO>();		
		while(rs.next()) {
			DepartmentDTO resultDTO = new DepartmentDTO();
			departmentDTO.setDepartment_id(rs.getInt("DEPARTMENT_ID"));
			departmentDTO.setDepartment_name(rs.getString("DEPARTMENT_NAME"));
			departmentDTO.setManager_id(rs.getInt("MANAGER_ID"));
			departmentDTO.setLocation_id(rs.getInt("LOCATION_ID"));

			ar.add(resultDTO);				
		}		
		return ar;
		
		
	}

}
