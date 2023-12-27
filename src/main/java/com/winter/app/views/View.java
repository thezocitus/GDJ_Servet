package com.winter.app.views;

import java.util.List;

import com.winter.app.departments.DepartmentDTO;
import com.winter.app.employees.EmployeesDTO;
import com.winter.app.locations.LocationsDTO;
import com.winter.app.regions.RegionDTO;
import com.winter.app.counttries.CountriesDTO;

public class View {

	//Regions를 출력
	
	public void departmentView(List<DepartmentDTO> ar) {
		for(DepartmentDTO departmentDTO:ar) {
			System.out.println(departmentDTO.getDepartment_id()+" : "+departmentDTO.getDepartment_name()+" : "+departmentDTO.getManager_id()+" : "+departmentDTO.getLocation_id());
			System.out.println("==============================");
		}			
	}
	public void regionView(List<RegionDTO> ar) {
		for(RegionDTO regionDTO:ar) {
			System.out.println(regionDTO.getRegion_id()+" : "+regionDTO.getRegion_name());
			System.out.println("==============================");
		}
	}
	public  void countrisView(List<CountriesDTO> ar) {
		
		for(CountriesDTO countriesDTO:ar) {
			System.out.println(countriesDTO.getCOUNTRY_ID()+" : "+countriesDTO.getCOUNTRY_NAME()+" : "+countriesDTO.getREGION_ID());
			System.out.println("==============================");
		}
		
	}
	public void locationView(List<LocationsDTO> ar) {
		for(LocationsDTO locationsDTO : ar) {
			System.out.println(locationsDTO.getLOCATION_ID()+" : "+locationsDTO.getSSTREET_ADDRESS()+" : "+locationsDTO.getPOSTAL_CODE()+" : "+locationsDTO.getCITY()+" : "+locationsDTO.getSTATE_PROVINCE()+" : "+locationsDTO.getCOUNTRY_ID());
			System.out.println("==============================");
		}
	}
	public void employeesView(List<EmployeesDTO> ar) {
		for(EmployeesDTO employeesDTO : ar) {
			System.out.println(employeesDTO.getemployee_id()+" : "+employeesDTO.getfirst_name()+" : "+employeesDTO.getlast_name()+" : "+employeesDTO.getemail()+" : "+employeesDTO.getphone_number()+" : "+employeesDTO.gethire_date()+" : "+employeesDTO.getjob_id()+" : "+employeesDTO.getsalary()+" : "+employeesDTO.getcommission_pct()+" : "+employeesDTO.getmanager_id()+" : "+employeesDTO.getdepartment_id());
		}
	}
	
}