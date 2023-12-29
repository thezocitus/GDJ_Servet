<%@page import="com.winter.app.regions.RegionDTO"%>
<%@page import="com.winter.app.regions.RegionDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	/* RegionDAO dao = new RegionDAO();
	RegionDTO regionDTO = new RegionDTO();
	String n = request.getParameter("region_id");
	int num = Integer.parseInt(n);
	regionDTO.setRegion_id(num);	
	regionDTO= dao.getDetail(regionDTO);	 */
	
	
/* 	RegionDTO regionDTO = (RegionDTO)request.getAttribute("DTO");
	request.getSession().getServletContext(); */


%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Region Detail</h1>
	<h3>${requestScope.DTO.region_id}</h3>
	<h3>${requestScope.DTO.region_name}</h3>
	<input type="hidden" id="alt" value="${requestScope.DTO.region_id}">
	<button id="btn">수정</button>
	<a href="./update.jsp?region_id=${requestScope.DTO.region_id}">수정 </a>
	
	
	<script type="text/javascript">
	 	let btn = document.getElementById("btn");	
		let v = document.getElementById("alt");
	 	btn.addEventListener("click", function(){
			alert(v.value); 		
	 		
	 		window.location.href="./update.jsp?region_id="+v.value;
	 	});	
	</script>
	
</body>
</html>