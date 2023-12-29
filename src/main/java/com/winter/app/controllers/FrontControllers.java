package com.winter.app.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.plaf.synth.Region;

import com.winter.app.regions.RegionDAO;
import com.winter.app.regions.RegionDTO;

/**
 * Servlet implementation class FrontControllers
 */
@WebServlet("/FrontControllers")
public class FrontControllers extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FrontControllers() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		String contextPath = request.getContextPath();
//		
//		System.out.println(contextPath);
//		
//		String method =request.getMethod();
//		
//		System.out.println("method"+method);
//		
//		String pathInfo = request.getPathInfo();
//		
//		System.out.println("pathinfo : " + pathInfo);
//		
//		String uri=request.getRequestURI();
//		String url=request.getRequestURL().toString();
//		
//		System.out.println("URI : " + uri);
//		System.out.println("URL: : " + url);
//		String[] names = uri.split("/");
//		System.out.println(names.length);
//		for(String n:names) {
//			System.out.println(n);
//		}
		String uri = request.getRequestURI();
		System.out.println("URI : " + uri);	
		String[] names = uri.split("/");
		String v = "/WEB-INF/views/index.jsp";
		for(int i=0 ; i<names.length ; i++  ) {
			
			System.out.println(names[i]);
		}
		try {
			if(names[1].equals("region")){
				RegionDAO regionDAO = new RegionDAO();
				if(names[2].equals("list")) {
					List<RegionDTO> ar = regionDAO.getList();
					request.setAttribute("list", ar);
					v="/WEB-INF/views/regions/list.jsp";
				}else if(names[2].equals("detail")) {
					RegionDTO regionDTO = new RegionDTO();
					regionDTO.setRegion_id(Integer.parseInt(request.getParameter("region_id")));
					regionDTO  = regionDAO.getDetail(regionDTO);
					request.setAttribute("DTO", regionDTO);
					v="/WEB-INF/views/regions/detail.jsp";					
				}
				
				
			}else if(names[1].equals("conuntries")) {
				
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		RequestDispatcher view = request.getRequestDispatcher(v);
		view.forward(request, response);
		
		
		
		// TODO Auto-generated method stub
//		RegionDAO regionDAO = new RegionDAO();
//		try {
//			List<RegionDTO> ar = regionDAO.getList();
//			PrintWriter out = response.getWriter();
//			out.print("<h1>MyHome</h1>");
//			out.println("<table>");			
//			for(RegionDTO regionDTO:ar) {
//				out.println("<tr>");
//				out.println("<td>");
//				out.println(regionDTO.getRegion_id());
//				out.println("</td>");
//				out.println("<td>");
//				out.println(regionDTO.getRegion_name());
//				out.println("</td>");
//				out.println("<tr>");
//			}
//			out.println("</table>");	
//			out.close();
//			
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
