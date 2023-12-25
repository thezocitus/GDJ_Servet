package com.winter.app.counttries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.winter.app.util.DBConnector;

public class CountriesDAO {
	
	public List<CountriesDTO> list(CountriesDTO conCountriesDTO) throws Exception {
		
		Connection con = DBConnector.getConnetor();
		String sql = "SELECT * FROM COUNTRIES";		
		PreparedStatement st = con.prepareStatement(sql);				
		ResultSet rs = st.executeQuery(); 
		List<CountriesDTO> ar = new ArrayList<CountriesDTO>();
		
		while(rs.next()) {
			CountriesDTO temp = new CountriesDTO();
			temp.setCOUNTRY_ID(rs.getString("COUNTRY_ID"));
			temp.setCOUNTRY_NAME(rs.getString("COUNTRY_NAME"));
			temp.setREGION_ID(rs.getInt("REGION_ID"));
			ar.add(temp);
		}
		return ar;
		
	}
}
