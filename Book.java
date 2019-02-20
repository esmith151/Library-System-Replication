
public class Book extends LibraryItem implements Librarian {

	String author;
	String publisher;
	String publishYear;
	
	
	public Book(int id,String title, String publishYear, String author, double price, int quantity){
		super(id,title,price,quantity);
		this.author = author;
		this.publishYear = publishYear;
	}
	
	public String getAuthor(){
		return author;
	}
	public String getPublisher(){
		return publisher;
	}
	public String getPublishYear(){
		return  publishYear;
	}
	public void setQuantity(int quantity){
		this.quantity = quantity;
	}
	
	public String toString()
	{
		return 
	" \n ID: "  + getId() +   
	" \n Title " + getTitle() +
	" \n Author " + getAuthor() + 
	" \n Publish Year " + getPublishYear() +
	" \nPrice " + getPrice() +
	" \n Book Quantity: " + getQuantity() +
	" ";
	
}
}