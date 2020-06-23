package examples.pubhub.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import examples.pubhub.dao.BookDAO;
import examples.pubhub.dao.BookDAOImpl;
import examples.pubhub.model.Book;
import examples.pubhub.utilities.DAOUtilities;

/**
 * Servlet implementation class ViewBookDetailsServlet
 */

// This is a "View" servlet, and has been named accordingly. All it does is send the user to a new JSP page
// But it also takes the opportunity to populate the session or request with additional data as needed.
@WebServlet("/ViewTag")
public class ViewTagServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// The bookTagDetails.jsp page needs to have the details of the selected book saved to the request,
		// Otherwise it won't know what details to display. Ergo, we need to fetch those details before we
		// Actually redirect the user.
		String tag = request.getParameter("tag");
		System.out.println(tag);
		BookDAOImpl dao = DAOUtilities.getBookDAO();
		List<Book> books = dao.getBooksByTag(tag);
		
		request.setAttribute("books", books);
		
		// We can use a forward here, because if a user wants to refresh their browser on this page,
		// it will just show them the most recent details for their book. There's no risk of data
		// miss-handling here.
		request.getRequestDispatcher("bookTagDetails.jsp").forward(request, response);
		
	}

}
