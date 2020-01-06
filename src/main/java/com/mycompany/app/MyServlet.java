package com.mycompany.app;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
/*
@WebServlet(value="/first",
initParams= {
		@WebInitParam(name="visits",value="10")
})
*/
@WebServlet("/first")
public class MyServlet extends HttpServlet {
	private int visitsCounter;

    /**
     * @throws ServletException
     * @throws IOException
     */
  /*  @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
    	String username=req.getParameter("username");
    	String password=req.getParameter("password");
        PrintWriter writer = resp.getWriter();
        writer.println("your password is"+password);
        String html="<h1>hello"+username+"</h1><br>";
        writer.println(html);
    }

   @Override
   public void init() throws ServletException{
	   ServletConfig servletConfig=getServletConfig();
	   String CounterStr=servletConfig.getInitParameter("visits");
	   visitsCounter=Integer.parseInt(CounterStr);
	   System.out.println("counterval"+visitsCounter);
	   }
	*/   
	   
   
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
    	visitsCounter++;
    	Util util=new Util();
    	ServletContext context=getServletContext();
    	Util.incrementTotalVisits(context);
    	Object totalStr=context.getAttribute("total");  	
    	
    	
    	 PrintWriter writer = resp.getWriter();
          writer.println("visits to this server="+visitsCounter);
          int total=util.getTotalVisitsCount(context);
          writer.println("visits to this app="+total);
    	//System.out.println("Inside first server");
    	//String username=req.getParameter("username");
    	// password=req.getParameter("password");
       // PrintWriter writer = resp.getWriter();
        //writer.println("your password is"+password);
       // String html="/second?username"+username+"&password="+password;
      // writer.println(html);
        //resp.sendRedirect(html);
    	//RequestDispatcher dispatcher=req.getRequestDispatcher("/second");
    	//dispatcher.forward(req,resp);
    	
    }
    }








