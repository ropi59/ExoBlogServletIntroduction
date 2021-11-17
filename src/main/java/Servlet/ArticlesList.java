package Servlet;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet(urlPatterns = "/articlesList")
public class ArticlesList extends HttpServlet{

	//constructor
	public ArticlesList() {
		
	}
	
	@Override
	   protected void doGet(
			   HttpServletRequest request,
	           HttpServletResponse response) 
	        		   throws ServletException, IOException {
	       
		//recuperation des données de session
		HttpSession session = request.getSession();
		
//		//recuperation de l'objet ARTICLE1
//		Article article1 = (Article) session.getAttribute("ARTICLE1");
//		//recuperation de l'objet ARTICLE2
//		Article article2 = (Article) session.getAttribute("ARTICLE2");
//		//recuperation de l'objet ARTICLE3
//		Article article3 = (Article) session.getAttribute("ARTICLE3");
//		
//		//si il n'y a pas d'article on le redirige vers la page session
//		if(article1 == null) {
//			response.sendRedirect(this.getServletContext().getContextPath() + "/homepage");
//			return;
//		}
//		
//		request.setAttribute("article1", article1);
//		request.setAttribute("article2", article2);
//		request.setAttribute("article3", article3);
		
		//recuperation de la liste des articles
		List<Article> listArticles = (List<Article>) session.getAttribute("ARTICLELIST");
		
		//si il n'y a pas de liste d'articles on le redirige vers la page session
		if(listArticles == null) {
			response.sendRedirect(this.getServletContext().getContextPath() + "/homepage");
			return;
		}
		
		//parcours de la liste pour recuperer les articles
		for (int i=0; i < listArticles.size(); i++){
			String articleName = article(i).getTitle();
		}
		
		request.setAttribute("listArticles", listArticles);

	       request.getRequestDispatcher("/WEB-INF/articlesList.jsp").forward(request,response);


	   }

	   @Override
	   protected void doPost(HttpServletRequest request,
	           HttpServletResponse response) throws ServletException, IOException {
	       
	   }
	   
	   
}
