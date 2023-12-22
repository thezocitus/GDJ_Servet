package com.winter.app.regions;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.winter.app.util.DBConnector;

public class RegionDAO {
	
		public RegionDTO getDetail(RegionDTO regionDTO) throws Exception {
			Connection con = DBConnector.getConnetor();
			String sql = "SELECT * FROM REGION WHERE REGIONS_ID=? ";//+regionDTO.getRegion_id();
			
			PreparedStatement st = con.prepareStatement(sql);
			
			st.setInt(1, regionDTO.getRegion_id());
			
			ResultSet rs = st.executeQuery();
			
			RegionDTO resultDTO=null;
						
			if(rs.next()) {
				resultDTO = new RegionDTO();
				resultDTO.setRegion_id(rs.getInt("REGIONS_ID"));
				resultDTO.setRegion_name(rs.getString("REGIONS_NAME"));
			}
			
			return resultDTO;   
		}

		public List<RegionDTO> getList() throws Exception{
			
			
				Connection con = DBConnector.getConnetor();				
			
				//3. Sql문 생성
				String sq = "SELECT REGION_NAME, REGION_ID FROM REGIONS";
				
				//4. SQL문 미리 전송
				PreparedStatement st = con.prepareStatement(sq);
			
				
				//6.최종 전송 및 ㄱ결과 처리
			
				ResultSet rs = st.executeQuery();
				List<RegionDTO> ar = new ArrayList<RegionDTO>();
				
				
				while(rs.next()) {
					//rs = 1, Europe
					RegionDTO regionDTO = new RegionDTO();
					int n = rs.getInt("REGION_ID");
					regionDTO.setRegion_id(n);
					regionDTO.setRegion_name(rs.getString("REGION_NAME"));

					ar.add(regionDTO);
				}
						
				System.out.println(con);
				DBConnector.disConnect(rs, st, con);
				return ar;
	}
	
}
