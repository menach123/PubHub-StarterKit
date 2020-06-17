package examples.pubhub.test;

import java.util.List;

import examples.pubhub.dao.DAOlayer;
import examples.pubhub.model.BookTag;

public class TestTagDAO {

	public static void main(String[] args){
		    DAOlayer dao = new DAOlayer();
		    List<BookTag> list = dao.getAllTags();
		    
//		    System.out.println(list);

		    for (int i = 0; i < list.size(); i++){
		    	BookTag t = list.get(i);
		    	System.out.println(t.getIsbn13()+ " "+ t.getTag());
		    }
	}
}
		    	
		    	

