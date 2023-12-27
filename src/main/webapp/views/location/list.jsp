<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.winter.app.locations.LocationsDAO"%>
<%@page import="com.winter.app.locations.LocationsDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	LocationsDAO locationsDAO = new LocationsDAO();
	//locationsDTO.setLOCATION_ID(Integer.parseInt(request.getParameter("location_id")));
	
	List<LocationsDTO> ar  = locationsDAO.getList();

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>LOCATION LIST</h1>
	<table>
		<thead>
			<tr>
				<td>LOCATION ID</td>
				<td>STREET ADDRESS</td>
				<td>POSTAL CODE</td>
				<td>CITY</td>
				<td>STATE PROVINCE</td>
				<td>COUNTRY ID</td>
			</tr>
		<thead>		
		<tbody>
			<% for(LocationsDTO locationsDTO : ar ){ %>
			<tr>
				<td><%=locationsDTO.getLocation_id()%></td>
				<td><%=locationsDTO.getStreet_address()%> </td>
				<td><%=locationsDTO.getPostal_code()%></td>
				<td><%=locationsDTO.getCity()%></td>
				<td><%=locationsDTO.getState_province()%></td>
				<td><%=locationsDTO.getCounty_id()%></td>	
			</tr>
		<% } %>		
		</tbody>	
	</table>
</body>
</html>