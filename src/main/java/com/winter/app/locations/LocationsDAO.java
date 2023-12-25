package com.winter.app.locations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.winter.app.util.DBConnector;

public class LocationsDAO {

	public List<LocationsDTO> list(LocationsDTO locationsDTO) throws Exception {
		
		Connection con = DBConnector.getConnetor();
		
		String sql = "SELECT * FROM LOCATIONS";
		
		PreparedStatement st = con.prepareStatement(sql);
		ResultSet rs = st.executeQuery();
		List<LocationsDTO> ar = new ArrayList<LocationsDTO>();
		while(rs.next()) {
			LocationsDTO temp = new LocationsDTO();
			temp.setLOCATION_ID(rs.getInt("LOCATION_ID"));
			temp.setSSTREET_ADDRESS(rs.getString("STREET_ADDRESS"));
			temp.setPOSTAL_CODE(rs.getString("POSTAL_CODE"));
			temp.setCITY(rs.getString(4));
			temp.setSTATE_PROVINCE(rs.getString(5));
			temp.setCOUNTRY_ID(rs.getString(6));
			
			ar.add(temp);
		}
		return ar;
	}
}
