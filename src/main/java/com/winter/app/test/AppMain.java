package com.winter.app.test;



import java.sql.Date;
import java.util.List;
import java.util.Map;

import com.winter.app.departments.DepartmentDAO;
import com.winter.app.employees.EmployeesDAO;
import com.winter.app.employees.EmployeesDTO;
import com.winter.app.regions.RegionDAO;
import com.winter.app.regions.RegionDTO;
import com.winter.app.util.DBConnector;
import com.winter.app.util.DBController;
import com.winter.app.views.View;

public class AppMain {

	public static void main(String[] args) {
		EmployeesDAO dao = new EmployeesDAO();
		
		EmployeesDTO employeeDTO = new EmployeesDTO();
		employeeDTO.setemployee_id(Integer.parseInt("207"));
		employeeDTO.setfirst_name("first_name");
		employeeDTO.setlast_name("last_name");
		employeeDTO.setemail("email");
		employeeDTO.setphone_number("010");
		employeeDTO.sethire_date(Date.valueOf("2023-12-27"));
		employeeDTO.setjob_id("AC_MGR");
		employeeDTO.setsalary(Double.parseDouble("5000"));
		employeeDTO.setcommission_pct(0.12);
		employeeDTO.setmanager_id(205);
		employeeDTO.setdepartment_id(10);
		
		
		try {
			int result = dao.add(employeeDTO);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
}

	