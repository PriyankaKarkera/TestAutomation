package com.sg.Testscript;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class CreatingHTMLfile {

	public static void main(String[] args)
	{
     creatingHTMLfile();
	}

	private static void creatingHTMLfile()
	{
		BufferedWriter bw=null;
		try
		{
			
		bw=new BufferedWriter(new FileWriter("D:\\ExampleAutomation\\Test123.html"));
		
		bw.write("<html>");
		bw.write("<head><title>TEST WEB PAGE </head></title>");
		bw.write("<body>");
		bw.write("<h1 align center>SERIOUS INFORMATION</h1>");
		bw.write("<p>Java is a programming language </p>");
		bw.write("<p>Python is a scripting language </p>");
		
		bw.write("</body>");
		bw.write("</html>");	
		System.out.println("Html file is created ");
			
			
		}catch(Exception e)
		   {
			e.printStackTrace();
		   }
		
	finally
	{
		try
	      {
		    bw.flush();
		    bw.close();
          }catch(Exception e)
	         {
		       e.printStackTrace();
	         }
	}
  }
}
