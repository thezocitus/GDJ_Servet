<%@page import="com.winter.app.departments.DepartmentDAO"%>
<%@page import="com.winter.app.departments.DepartmentDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	DepartmentDAO departmentDAO = new DepartmentDAO();
	DepartmentDTO departmentDTO = new DepartmentDTO();
	departmentDTO.setDepartment_id(Integer.parseInt(request.getParameter("department_id")));
	departmentDTO.setDepartment_name(request.getParameter("department_name"));
	departmentDTO.setManager_id(Integer.parseInt(request.getParameter("manager_id")));
	departmentDTO.setLocation_id(Integer.parseInt(request.getParameter("location_id")));
	
	int result = departmentDAO.update(departmentDTO);
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<script type="text/javascript">
		let result = <%=result %>;
		if(result>0){
			alert('수정성공')
		}else{
			alert('실패')
		}
		alert("첫화면으로 돌아갑니다.");
		window.location.href="./list.jsp";
		
	</script>

</body>
</html>