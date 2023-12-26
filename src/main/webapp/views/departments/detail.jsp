<%@page import="com.winter.app.departments.DepartmentDAO"%>
<%@page import="com.winter.app.departments.DepartmentDTO"%>
<%@page import="com.winter.app.regions.RegionDAO"%>
<%@page import="com.winter.app.regions.RegionDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%
	DepartmentDTO departmentDTO = new DepartmentDTO();
 	DepartmentDAO departmentDAO = new DepartmentDAO();
 	departmentDTO.setDepartment_id(Integer.parseInt(request.getParameter("department_id")));
 	/* departmentDTO.setDepartment_name(request.getParameter("department_name"));
 	departmentDTO.setManager_id(Integer.parseInt(request.getParameter("manager_id")));
 	departmentDTO.setLocation_id(Integer.parseInt(request.getParameter("location_id")));
 	 */
 	departmentDTO=departmentDAO.getdetail(departmentDTO);
 %>   
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>DEPARTMENT DETAIL</h1>
	<h3><%= departmentDTO.getDepartment_name()%></h3>
	<a href="./update.jsp?department_id=<%=departmentDTO.getDepartment_id()%>">수정</a>
	
</body>
</html>