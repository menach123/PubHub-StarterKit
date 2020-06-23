package examples.pubhub.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import examples.pubhub.dao.BookDAO;
import examples.pubhub.dao.BookDAOImpl;
import examples.pubhub.model.Book;
import examples.pubhub.model.BookTag;
import examples.pubhub.utilities.DAOUtilities;

/**
 * Servlet implementation class UpdateBookServlet
 */
@WebServlet("/DeleteTag")
public class DeleteTagServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		boolean isSuccess= false;
		boolean isTagSuccess = false;
		String isbn = request.getParameter("isbn13");
		String tag = request.getParameter("tag");
		
		BookDAOImpl dao = DAOUtilities.getBookDAO();
		
		isSuccess = dao.deleteBookTagByISBN(isbn, tag);
				
		if(isSuccess){
			request.getSession().setAttribute("message", "Tag Removed");
			request.getSession().setAttribute("messageClass", "alert-success");
			response.sendRedirect("ViewBookDetails?isbn13=" + isbn);
		}else {
			request.getSession().setAttribute("message", "There was a problem removing the tag");
			request.getSession().setAttribute("messageClass", "alert-danger");
			request.getRequestDispatcher("bookDetails.jsp").forward(request, response);

		}
		
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}