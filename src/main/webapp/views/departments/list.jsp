<%@page import="com.winter.app.departments.DepartmentDTO"%>
<%@page import="java.util.List"%>
<%@page import="com.winter.app.departments.DepartmentDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%
 DepartmentDAO departmentDAO = new DepartmentDAO();

 List<DepartmentDTO> ar = departmentDAO.getList();
 
 %>   
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Department List</h1>
	<table>
		<thead>
			<tr>
				<td>DEPRTMENT_ID</td>
				<td>DEPRTMENT_NAME</td>
				<td>MANAGER_ID</td>
				<td>LOCATION_ID</td>
			</tr>
		</thead>
		<tbody>
			<%for(DepartmentDTO departmentDTO:ar){%>
				<tr>
					<td><%= departmentDTO.getDepartment_id()%></td>
					<td>
					<a href="./detail.jsp?department_id=<%=departmentDTO.getDepartment_id()%>">
														<%-- <%= departmentDTO.getDepartment_name()%>
														<%= departmentDTO.getManager_id()%>
														<%= departmentDTO.getLocation_id()%>">	 --%>													
														<%= departmentDTO.getDepartment_name()%>
														</a>
														</td>
					<td><%= departmentDTO.getManager_id() %></td>
					<td><%= departmentDTO.getLocation_id() %></td>
				</tr>				
			<% } %>
		
		</tbody>		
		
	</table>
	<a href="./add.jsp">추가</a>
</body>
</html>