import java.util.*;
public interface Librarian
{
   public int getId();
   public String getTitle();
   public double getPrice();
   void setQuantity(int quantity);
}
public abstract class LibraryItem {
int id;
String title;
double price;
int quantity;

public LibraryItem(int id, String title, double price, int quantity){
	this.id= id;
	this.title = title;
	this.price = price;
	this.quantity = quantity;
}

public int getId(){
	return this.id;
}
public String getTitle(){
	return this.title;
}
public double getPrice(){
	return price;
}
public int getQuantity(){
	return quantity;
}

public void setQuantity(int quantity) {
	this.quantity = quantity;
}


	

}

