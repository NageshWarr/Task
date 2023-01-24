import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {

public void doGet (HttpServletRequest request, HttpServletResponse response){
		try{

	
	
		
		String n=request.getParameter("userName");
		String pass=request.getParameter("password");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<h1>Welcome "+n+"</h1>");

		//appending the username in the query string
		response.sendRedirect("SecondServlet?name="+n+"&pass="+pass);
				
		out.close();

                }catch(Exception e){System.out.println(e);}
	}

}

