package com.test.src;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class Hello extends HttpServlet{
	  public void init(ServletConfig config) throws ServletException {
	        //初始化Servlet的时候,可以在这里完成某些初始化的方法.
	     // init(config);
		  System.out.println("servlet之前");
	    }
	     
	    protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException 
 {
	        //大部分时候,对于所有请求都是一样的话,可以重写HttpServlet的Service方法来替代doGet/doPost这些方法.
	    	
	    	System.out.println("执行servlet");
	    
	    }
	     
	    @Override
	    public void destroy() {
	        // 在销毁Servlet之前,需要完成某些资源的回收,比如关闭数据库链接等,可以写在这里.
	    	System.out.println("servlet之后");
	    	destroy();
	    }
}
