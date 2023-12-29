<%@page import="com.winter.app.departments.DepartmentDAO"%>
<%@page import="com.winter.app.departments.DepartmentDTO"%>
<%@page import="com.winter.app.regions.RegionDTO"%>
<%@page import="com.winter.app.regions.RegionDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
DepartmentDTO departmentDTO = new DepartmentDTO();
DepartmentDAO departmentDAO = new DepartmentDAO();

departmentDTO.setDepartment_id(Integer.parseInt(request.getParameter("department_id")));

departmentDTO=departmentDAO.getdetail(departmentDTO);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>department update</h1>>
	<form action="./updateProcess.jsp">
	
	<div>
		department_id<input type="text"  name="department_id" value="<%= departmentDTO.getDepartment_id()%>">
	</div>
	<div>
		department_name<input type='text' name='department_name' value="<%= departmentDTO.getDepartment_name()%>">;
	</div>
	<div>
		manager_id<input type='text'  name='manager_id' value="<%= departmentDTO.getManager_id()%>">;
	</div>
	<div>
		location_id<input type='text' name='location_id' value="<%=departmentDTO.getLocation_id()%>">;
	</div>
	<button>수정</button>	
	</form>
	
</body>
</html>