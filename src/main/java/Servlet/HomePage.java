package Servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import org.apache.jasper.tagplugins.jstl.core.ForEach;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet(urlPatterns = "/homepage")
public class HomePage extends HttpServlet{

	//constructor
	public HomePage(){
	}

	@Override
	   protected void doGet(
			   HttpServletRequest request,
	           HttpServletResponse response) 
	        		   throws ServletException, IOException {
		
		//session creation
		HttpSession session = (HttpSession) request.getSession();
	       
		//user's creation
		User lambda = new User ( "Jackie", 1523, "jackie&M@mail.com", false);
		User administrator = new User ("Michelle", 12564, "j&michel@mail.com", true);
		
		//set attribute lambda to userlambda
		session.setAttribute("USERLAMBDA", lambda);
				
		//set attribute administrator to useradministrator
		session.setAttribute("USERADMINISTRATOR", administrator);
		
		//articles creation
		Article article1 = new Article("Welcome", "Welcome, Lorem ipsum dolor sit amet, "
				+ "consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore"
				+ " et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud "
				+ "exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. "
				+ "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum "
				+ "dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non "
				+ "proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
		
		Article article2 = new Article("Travels", "Travels, Lorem ipsum dolor sit amet, "
				+ "consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore"
				+ " et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud "
				+ "exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. "
				+ "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum "
				+ "dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non "
				+ "proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
		
		Article article3 = new Article("Discover", "Discover, Lorem ipsum dolor sit amet, "
				+ "consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore"
				+ " et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud "
				+ "exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. "
				+ "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum "
				+ "dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non "
				+ "proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
		
		//set attribute of first article to ARTICLE1
		session.setAttribute("ARTICLE1", article1);
		
		//set attribute of second article to ARTICLE2
		session.setAttribute("ARTICLE2", article2);
		
		//set attribute of third article to ARTICLE3
		session.setAttribute("ARTICLE3", article3);
		
		//Article's list creation
		List<Article> listArticles = new ArrayList<Article> ();
		listArticles.add(article1);
		listArticles.add(article2);
		listArticles.add(article3);
		
		//set attribute of article's list to ARTICLELIST
		session.setAttribute("ARTICLELIST", listArticles);
			
	    request.getRequestDispatcher("index.jsp").forward(request,response);	       
	   }

	   @Override
	   protected void doPost(HttpServletRequest request,
	           HttpServletResponse response) throws ServletException, IOException {	       
	   }
	   
	  
	   
}