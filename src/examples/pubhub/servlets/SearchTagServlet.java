package examples.pubhub.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import examples.pubhub.dao.BookDAOImpl;
import examples.pubhub.model.Book;
import examples.pubhub.model.BookTag;
import examples.pubhub.utilities.DAOUtilities;

/**
 * Servlet implementation class SearchTagServlet
 */
@WebServlet("/SearchTag")
public class SearchTagServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Grab the list of Books from the Database
		BookDAOImpl dao = DAOUtilities.getBookDAO();
		
		List<String> tags = dao.getTagList();
		

		

		// Populate the list into a variable that will be stored in the session
		request.getSession().setAttribute("tags", tags);
	
		request.getRequestDispatcher("bookSearchTag.jsp").forward(request, response);
	}
	
}
    