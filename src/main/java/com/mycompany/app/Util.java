package com.mycompany.app;

import javax.servlet.ServletContext;

public class Util {

	public static void incrementTotalVisits(ServletContext context) {
		int total=getTotalVisitsCount(context);
		total++;
		context.setAttribute("total",total);
		
	}
	public static int getTotalVisitsCount(ServletContext context) {
		Object totalStr=context.getAttribute("total");
		int total=0;
		if(totalStr!=null) {
			total=Integer.parseInt(totalStr.toString());
			
		}
		return total;
		
		
	}
}
