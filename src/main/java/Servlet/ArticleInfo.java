package Servlet;


import java.io.IOException;
import java.util.Enumeration;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet(urlPatterns = "/articleinfo")
public class ArticleInfo extends HttpServlet{

	//constructor
	public ArticleInfo(){
	}

	@Override
	   protected void doGet(
			   HttpServletRequest request,
	           HttpServletResponse response) 
	        		   throws ServletException, IOException {
	       
		//recuperation des données de session
		HttpSession session = request.getSession();
		//recuperation de l'objet ARTICLE1
		Article article = (Article) session.getAttribute("ARTICLE1");
		
		//si il n'y a pas d'article on le redirige vers la page session
		if(article == null) {
			response.sendRedirect(this.getServletContext().getContextPath() + "/homepage");
			return;
		}
		
		request.setAttribute("article", article);

	       request.getRequestDispatcher("/WEB-INF/articleInfo.jsp").forward(request,response);

      
	   }

	   @Override
	   protected void doPost(HttpServletRequest request,
	           HttpServletResponse response) throws ServletException, IOException {
	       
	   }
	   
	   
}