package books.java.exceptions;

public class Book {

	  private String title;
	  private int pages;
	  private String author;
	  private String publisher;
	  
//	COSTRUTTORE  
	public Book(String title, int pages, String author, String publisher) throws Exception {
		super();
		this.title = title;
		validateTitolo(title);
		this.pages = pages;
		this.author = author;
		this.publisher = publisher;
	}
	
	public void validateTitolo(String title)throws Exception{
		if (title.length()==0) {
			throw new Exception("ERRORE");
		}
	}

// 	GETTERS E SETTERS
	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public int getPages() {
		return pages;
	}


	public void setPages(int pages) {
		this.pages = pages;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public String getPublisher() {
		return publisher;
	}


	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
}

