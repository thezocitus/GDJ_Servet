package com.winter.app.test;

import java.util.List;

import com.winter.app.departments.DepartmentDAO;
import com.winter.app.regions.RegionDAO;
import com.winter.app.regions.RegionDTO;
import com.winter.app.util.DBConnector;
import com.winter.app.views.View;

public class AppMain {

	public static void main(String[] args) {

		DepartmentDAO dao = new DepartmentDAO();
		RegionDAO regionDAO = new RegionDAO();
		View view = new View();
		
		try {
			RegionDTO regionDTO = new RegionDTO();
			regionDTO.setRegion_id(1);
			regionDTO = regionDAO.getDetail(regionDTO);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
