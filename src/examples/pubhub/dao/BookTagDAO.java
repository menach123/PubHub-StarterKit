package examples.pubhub.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import examples.pubhub.model.Book;
import examples.pubhub.model.BookTag;
import examples.pubhub.utilities.DAOUtilities;

public interface BookTagDAO {
	
	Connection connection = null;	// Our connection to the database
	PreparedStatement stmt = null;	// We use prepared statements to help protect against SQL injection

	public List<BookTag> getAllTags();
	public List<Book> getBooksByTag(String title);
	public List<BookTag> getTagByISBN(String isbn);
	
	public boolean addBookTag(BookTag tag);
	public boolean updateBookTag(BookTag tag);
	public boolean deleteBookTagByISBN(String isbn, String tag);
}

