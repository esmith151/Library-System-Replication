
public class Magazine extends LibraryItem implements Librarian {
String magType;
String magDate;

public Magazine(int id, String title, String magType, String magDate, double price, int quantity){
	super(id,title,price,quantity);
	this.magType= magType;
	this.magDate = magDate;
}
public String getMagType(){
	return magType;
}
public String getMagDate(){
	return magDate;
}
public String toString(){
	return  " \n ID: "  + getId() + 
			" \n Title " + getTitle() +
			" \n Magazine Type " + getMagType()  + 
			" \n Magazine release Date " + getMagDate() +
			" \n Price " + getPrice() +
			" \n Quantity " + getQuantity();
}
}
