package examples.pubhub.test;

import java.util.List;

import examples.pubhub.dao.BookDAOImpl;
import examples.pubhub.model.Book;
import examples.pubhub.model.BookTag;

public class TestTagDAO {

	public static void main(String[] args){
		BookDAOImpl dao = new BookDAOImpl();
		String isbn = "12315454297";
		boolean a = dao.deleteBookTagByISBN(isbn, "Cultural Appropriation"); 
		    
		
		}
	}


		    	
		    	

