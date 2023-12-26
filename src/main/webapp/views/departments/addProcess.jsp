<%@page import="com.winter.app.regions.RegionDTO"%>
<%@page import="com.winter.app.departments.DepartmentDAO"%>
<%@page import="com.winter.app.departments.DepartmentDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>    
<%
DepartmentDTO departmentDTO = new DepartmentDTO();
DepartmentDAO departmentDAO = new DepartmentDAO();
String id = request.getParameter("department_id");
String name = request.getParameter("department_name");
String mid = request.getParameter("manager_id");
String loid = request.getParameter("location_id");
departmentDTO.setDepartment_id(Integer.parseInt(id));
departmentDTO.setDepartment_name(name);
departmentDTO.setManager_id(Integer.parseInt(mid));
departmentDTO.setLocation_id(Integer.parseInt(loid));
int result =  departmentDAO.add(departmentDTO);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>DEPARTMENT ADD PROCESS</h1>
		<script type="text/javascript">
			let result='<%= result%>';
			if(result>0){
				alert('등록성공');
			}else{
				alert('등록실패');
			}
			window.location.href="./list.jsp"
		</script>		
		
	
</body>
</html>