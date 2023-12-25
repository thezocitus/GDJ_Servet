package com.winter.app.test;

import java.util.List;

import com.winter.app.departments.DepartmentDAO;
import com.winter.app.regions.RegionDAO;
import com.winter.app.regions.RegionDTO;
import com.winter.app.util.DBConnector;
import com.winter.app.util.DBController;
import com.winter.app.views.View;

public class AppMain {

	public static void main(String[] args) {

		DBController dBcontroller= new DBController();
		dBcontroller.strat();
		
		
	}

}
	