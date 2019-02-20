
public class ElectronicMedia implements Librarian {

	int id;
	String title;
	String genre;
	String playTime;
	double price;
	int quantity;
	
	public ElectronicMedia(String genre, String playTime, double price, int quantity){
		this.genre = genre;
		this.playTime = playTime;
		this.price = price;
		this.quantity = quantity;
	}
	public int getId(){
		return id;
	}
	public String getTitle() {
		return title;
	}
	public String getGenre() {
		return genre;
	}
	public String getPlayTime() {
		return playTime;
	}
	public double getPrice() {
		return price;
	}
	public int getQuantity(){
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
}
