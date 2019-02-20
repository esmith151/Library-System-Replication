
public class Article extends LibraryItem implements Librarian {
String articleOf;

public Article(int id, String title, String articleOf, double price,int quantity){
	super(id,title,price,quantity);
	this.articleOf = articleOf;
}
public String getArticleOf(){
	return articleOf;
}
public String toString(){
	return  " \n ID: "  + getId() + 
			" \n Title " + getTitle() +
			" \n Article About " + getArticleOf() +
			" \n Price " + getPrice() +
			" \n Quantity " + getQuantity();
}

}
