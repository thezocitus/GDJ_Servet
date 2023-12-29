<%@page import="com.winter.app.regions.RegionDTO"%>
<%@page import="com.winter.app.regions.RegionDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%	
	RegionDAO regionDAO = new RegionDAO();
	RegionDTO regionDTO = new RegionDTO();
	regionDTO.setRegion_id(Integer.parseInt(request.getParameter("region_id")));
	regionDTO.setRegion_name(request.getParameter("region_name"));
	int result = regionDAO.update(regionDTO);
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