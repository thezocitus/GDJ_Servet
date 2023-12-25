package com.winter.app.employees;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.winter.app.util.DBConnector;

public class EmployeesDAO {

	public List<EmployeesDTO> list(EmployeesDTO employeesDTO) throws Exception {
		
		Connection con = DBConnector.getConnetor();
		String sql = "SELECT * FROM EMPLOYEES";
		PreparedStatement st = con.prepareStatement(sql);
		ResultSet rs = st.executeQuery();
		
		List<EmployeesDTO> ar = new ArrayList<EmployeesDTO>();
		
		while(rs.next()) {
			EmployeesDTO temp = new EmployeesDTO();
			temp.setEMPLOYEE_ID(rs.getInt(1));
			temp.setFIRST_NAME(rs.getString(2));
			temp.setLAST_NAME(rs.getString(3));
			temp.setEMAIL(rs.getString(4));
			temp.setPHONE_NUMBER(rs.getString(5));
			temp.setHIRE_DATE(rs.getString(6));
			temp.setJOB_ID(rs.getString(7));
			temp.setSALARY(rs.getInt(8));			
			temp.setCOMMISSION_PCT(rs.getDouble(9));
			temp.setMANAGER_ID(rs.getInt(10));
			temp.setDEPARTMENT_ID(rs.getInt(11));
			
			ar.add(temp);
			
		}
		return ar;
	}
	
	
}
