
public class CD extends ElectronicMedia implements Librarian {

	String albumTitle;
	
	public CD(String genre, String playTime, String albumTitle, double price,int quantity){
		super(genre,playTime,price,quantity);
		this.albumTitle = albumTitle;
	}
	public String getAlbumTitle(){
		return albumTitle;
	}
	public String toString(){
	return "\n Item Type: CD " + 
	"\n Album Title: "  + getAlbumTitle() + 
	"\n Album Genre " + getGenre() +
	"\n Duration of CD " + getPlayTime() +  
	"\n Price: " + getPrice() + 
	"\n Quantity " + getQuantity();
	}
	
	
	
}
