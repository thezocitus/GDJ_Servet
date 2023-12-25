package com.winter.app.util;

import java.util.List;
import java.util.Scanner;

import com.winter.app.counttries.CountriesDTO;
import com.winter.app.counttries.CountriesDAO;
import com.winter.app.departments.DepartmentDAO;
import com.winter.app.departments.DepartmentDTO;
import com.winter.app.employees.EmployeesDAO;
import com.winter.app.employees.EmployeesDTO;
import com.winter.app.locations.LocationsDAO;
import com.winter.app.locations.LocationsDTO;
import com.winter.app.regions.RegionDAO;
import com.winter.app.regions.RegionDTO;
import com.winter.app.views.View;

public class DBController {

	
		public void strat() {
			
			
			Scanner sc = new Scanner(System.in);
			
			
			DepartmentDAO departmentDAO = new DepartmentDAO();
			RegionDAO regionDAO = new RegionDAO();
			CountriesDAO countriesDAO = new CountriesDAO();
			LocationsDAO locationsDAO = new LocationsDAO();
			EmployeesDAO employeesDAO = new EmployeesDAO();
			View view = new View();
			
			boolean check =  true;
			while(check) {
				System.out.println("1.디파트먼트  2.레기온  3.컨트리스   4.로케이션   5.직원   6.종료");
				int select = sc.nextInt();
				
				switch (select) {
				case 1:
					DepartmentDTO departmentDTO = new DepartmentDTO();
					try {
						List<DepartmentDTO> ar = departmentDAO.getList(departmentDTO);
						view.departmentView(ar);
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					break;
				
				case 2:
					System.out.println("대륙번호입력 1~4");
					int n = sc.nextInt();
					try {
						RegionDTO regionDTO = new RegionDTO();
						regionDTO.setRegion_id(n);
						regionDTO = regionDAO.getDetail(regionDTO);
						
						if(regionDTO!=null) {
							System.out.println(regionDTO.getRegion_name());
						}else {
							System.out.println("없는 ID");
						}
						
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
				case 3:{
					CountriesDTO countriesDTO = new CountriesDTO();
					try {
						List<CountriesDTO> ar = countriesDAO.list(countriesDTO);
						view.countrisView(ar);
						
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
				}
				case 4:{
					LocationsDTO locationsDTO = new LocationsDTO();
					
					try {
						List<LocationsDTO> ar = locationsDAO.list(locationsDTO);
						view.locationView(ar);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				case 5:{
					EmployeesDTO employeesDTO = new EmployeesDTO();
					
					try {
						List<EmployeesDTO> ar = employeesDAO.list(employeesDTO);
						view.employeesView(ar);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
				}
					case 6:{
						check =! true;				
					}
				default:
					break;
				}
				
				
			}
			
			
			
		}
		
}
