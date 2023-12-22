package com.winter.app.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBConnector {

public void getConnetor() {
		
		String user="user01";
		String password="user01";
//		String url="3.36.131.0:1521"
		String url="jdbc:oracle:thin:@3.36.131.0:1521:xe";
		String driver="oracle.jdbc.driver.OracleDriver";
		
		//1.driver를 메모리에 로딩(객체생성) to loaded dirver at memory; 
		
		try {
			
			Class.forName(driver);
			//2. DB연결 i in a vionet circle is meaning Interface;
			Connection con = DriverManager.getConnection(url, user, password);
			
			//3. Sql문 생성
			String sql = "SELECT * FROM REGION";
			
			//4. SQL문 미리 전송
			PreparedStatement st = con.prepareStatement(sql);
			
			
			
			
			//6.최종 전송 및 ㄱ결과 처리
			ResultSet rs = st.executeQuery();
			
			
			while(rs.next()) {
				//rs = 1, Europe
				int n = rs.getInt(1);
				String name = rs.getString(2);
				System.out.println(n+" : "+name);
				System.out.println("================");
			}
			
			
			System.out.println(con);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
	
	
}
