package com.winter.app.employees;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.naming.spi.DirStateFactory.Result;

import com.winter.app.util.DBConnector;

public class EmployeesDAO {

	//사원 급여 합계
	
	public Map getsalary() throws Exception {
		Map<String, Integer>  map =new HashMap<String, Integer>();
		
		Connection con = DBConnector.getConnetor();		
		
		String qul="SELECT SUM(salary), COUNT(employee_id) FROM EMPLOYEES";		
		
		PreparedStatement st = con.prepareStatement(qul);		
		
		ResultSet rs = st.executeQuery();		
				
		rs.next();		
		
		int sum = rs.getInt("SUM(salary)");	
		int count = rs.getInt("COUNT(employee_id)");
		
		map.put("count", count);
		map.put("sum", sum);
		
		DBConnector.disConnect(rs, st, con);
		
		return map;
	}
	
	
	public int add(EmployeesDTO employeesDTO) throws Exception{
		Connection con = DBConnector.getConnetor();
		
		String sql ="INSERT INTO FROM EMPLOYEES"
				+" VALUE(?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setInt(1, employeesDTO.getemployee_id());
		st.setString(2,employeesDTO.getfirst_name());
		st.setString(3, employeesDTO.getlast_name());
		st.setString(4, employeesDTO.getemail());
		st.setString(5,employeesDTO.getphone_number());
		st.setDate(6, employeesDTO.gethire_date());
		st.setString(7, employeesDTO.getjob_id());
		st.setDouble(8, employeesDTO.getsalary());
		st.setDouble(9, employeesDTO.getcommission_pct());
		st.setInt(10, employeesDTO.getmanager_id());
		st.setInt(11,employeesDTO.getdepartment_id());
		
		int result = st.executeUpdate();
		
		DBConnector.disConnect(st, con);
		
		return result;
		
	}
	
	
	
	//하나조회

	public EmployeesDTO getDitail(EmployeesDTO employeesDTO) throws Exception {
		Connection con = DBConnector.getConnetor();
		String sql = "SELECT * FROM EMPLOYEES WHERE employee_id=?";
		PreparedStatement st = con.prepareStatement(sql);
		st.setInt(1, employeesDTO.getdepartment_id());
		ResultSet rs = st.executeQuery();		
					
		if(rs.next()) {
			employeesDTO.setfirst_name(rs.getString("first_name"));
		}else {
			employeesDTO=null;
		}
		DBConnector.disConnect(rs, st, con);
		
		return employeesDTO;
		
		
	}
	
	
	
	public List<EmployeesDTO> list() throws Exception {
		
		Connection con = DBConnector.getConnetor();
		String sql = "SELECT * FROM EMPLOYEES";
		PreparedStatement st = con.prepareStatement(sql);
		ResultSet rs = st.executeQuery();
		
		List<EmployeesDTO> ar = new ArrayList<EmployeesDTO>();
		
		while(rs.next()) {
			EmployeesDTO temp = new EmployeesDTO();
			temp.setemployee_id(rs.getInt("employee_id"));
			temp.setfirst_name(rs.getString(2));
			temp.setlast_name(rs.getString(3));
			temp.setemail(rs.getString(4));
			temp.setphone_number(rs.getString(5));
			temp.sethire_date(rs.getDate(6));
			temp.setjob_id(rs.getString(7));
			temp.setsalary(rs.getInt(8));			
			temp.setcommission_pct(rs.getDouble(9));
			temp.setmanager_id(rs.getInt(10));
			temp.setdepartment_id(rs.getInt(11));
			
			ar.add(temp);
			
		}
		return ar;
	}
	
	
}
