package com.winter.app.views;

import java.util.List;

import com.winter.app.departments.DepartmentDTO;
import com.winter.app.regions.RegionDTO;

public class View {

	//Regions를 출력
	
	public void departmentView(List<DepartmentDTO> ar) {
		for(DepartmentDTO departmentDTO:ar) {
			System.out.println(departmentDTO.getDepartment_id()+" : "+departmentDTO.getDepartment_name()+" : "+departmentDTO.getManager_id()+" : "+departmentDTO.getLocation_id());
		}			
	}
	public void regionView(List<RegionDTO> ar) {
		for(RegionDTO regionDTO:ar) {
			System.out.println(regionDTO.getRegion_id()+" : "+regionDTO.getRegion_name());
			System.out.println("==============================");
		}
	}
}