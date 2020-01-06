package com.mycompany.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/second")
public class Servlet2  extends HttpServlet{
	private int serviceCount;
	  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	            throws ServletException, IOException {
		 
		serviceCount++;
		Util util=new Util();
    	ServletContext context=getServletContext();
    	Util.incrementTotalVisits(context);
    	Object totalStr=context.getAttribute("total");  	
    	
    	
    	 PrintWriter writer = resp.getWriter();
          writer.println("visits to this server="+serviceCount);
          int total=util.getTotalVisitsCount(context);
          writer.println("visits to this app="+total);
		  
	    /*	String username1=req.getParameter("username");
	    	String password1=req.getParameter("password");
	        PrintWriter writer = resp.getWriter();
	        String html2="inside second servlet";
		      writer.println(html2);
	      writer.println("your password is"+password1);
	       
	      writer.println("your name is"+username1);
	      */
	       
}
}