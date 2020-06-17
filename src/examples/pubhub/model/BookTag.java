package examples.pubhub.model;

public class BookTag {
	
	private String isbn13;			// International Standard Book Number, unique
	private String tag;			// Tag keyword(s) that description the book	
	
	
	
	//	Setting Constructor 
	public BookTag(String i, String tag) {
		this.isbn13 = i;
		this.tag = tag;
	}
	//  Setting Constructor with ISBN 13
	public BookTag(String tag) {
		this.tag = tag;
	}

			 	
	public String getIsbn13() {
		return this.isbn13;
	}
	
	public void setIsbn13(String isbn13) {
		this.isbn13 = isbn13;
	}
	
	public String getTag() {
		return tag;
	}
	
	public void setTag(String tag) {
		this.tag = tag;
	}
	

}
