package libaryDatabaseSolutions;

public class Book {

	// Data Members
	private String refNum;
	private String title;
	private String author;
	
	// Default Constructor
	public Book()  {
		this.refNum = "";
		this.title = "";
		this.author = "";
	}
	
	// Parameterized Constructor
	public Book(String r, String t, String a)  {
		this.refNum = r;
		this.title = t;
		this.author = a;
	}
	
	// Set Methods
	public void setRefNum(String r)  {

		this.refNum = r;
	}
	
	public void setTitle(String t)  {

		this.title = t;
	}
	
	public void setAuthor(String a)  {

		this.author = a;
	}
	
	// Get Methods
	public String getRefNum()  {
		
		return this.refNum;
	}
	
	public String getTitle()  {
		
		return this.title;
	}
	
	public String getAuthor()  {
		
		return this.author;
	}

	// Override .toString();
	public String toString() {

		return this.refNum + "." + this.title + "." + this.author;
	}
}
