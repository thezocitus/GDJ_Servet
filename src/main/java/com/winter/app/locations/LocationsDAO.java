package com.winter.app.locations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.winter.app.util.DBConnector;

public class LocationsDAO {

	public List<LocationsDTO> getList() throws Exception {
		
		Connection con = DBConnector.getConnetor();
		
		String sql = "SELECT * FROM LOCATIONS";
		
		PreparedStatement st = con.prepareStatement(sql);
		ResultSet rs = st.executeQuery();
		List<LocationsDTO> ar = new ArrayList<LocationsDTO>();
		while(rs.next()) {
			LocationsDTO temp = new LocationsDTO();
			System.out.println(temp);
			temp.setLocation_id(rs.getInt("location_id"));
			temp.setStreet_address(rs.getString("street_address"));
			temp.setPostal_code(rs.getString("postal_code"));
			temp.setCity(rs.getString("city"));
			temp.setState_province(rs.getString("state_province"));
			temp.setCounty_id(rs.getString("country_id"));
			
			ar.add(temp);
		}
		return ar;
	}
}
