package Servlet;


import java.io.IOException;
import java.util.Enumeration;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet(urlPatterns = "/userinfo")
public class UserInfo extends HttpServlet{

	//constructor
	public UserInfo(){
	}

	@Override
	   protected void doGet(
			   HttpServletRequest request,
	           HttpServletResponse response) 
	        		   throws ServletException, IOException {
	       
		//recuperation des données de session
		HttpSession session = request.getSession();
		//recuperation de l'objet USERLAMBDA
		User user = (User) session.getAttribute("USERLAMBDA");
		
//		//recuperation de l'objet USERADMINISTRATOR
//		User user = (User) session.getAttribute("USERADMINISTRATOR");
		
		//si il n'est pas connecté on le redirige vers la page session
		if(user == null) {
			response.sendRedirect(this.getServletContext().getContextPath() + "/homepage");
			return;
		}
		
		request.setAttribute("user", user);
	       //ServletOutputStream out = response.getOutputStream();
	       request.getRequestDispatcher("/WEB-INF/userInfo.jsp").forward(request,response);

	   }

	   @Override
	   protected void doPost(HttpServletRequest request,
	           HttpServletResponse response) throws ServletException, IOException {
	       
	   }
	   
	   
}
