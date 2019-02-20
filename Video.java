
public class Video extends ElectronicMedia implements Librarian {

	String maleStar;
	String femaleStar;
	
	public Video(String genre, String playTime, String maleStar, String femaleStar, double price,int quantity){
	super(genre,playTime,price,quantity);
	this.maleStar = maleStar;
	this.femaleStar = femaleStar;
	
	}
	public String getMaleStar(){
		return maleStar;
	}
	public String getFemaleStar(){
		return femaleStar;
	}
	public String toString(){
		 return  "\n Movie "  + getGenre() + 
				" \n Male Starring " + getMaleStar() +
				" \n Female Starring " + getFemaleStar() + 
				" \n Runtime " + getPlayTime() +
				" \n Price " + getPrice() + 
				" \n Quantity " + getQuantity();
	}
	
	
}
