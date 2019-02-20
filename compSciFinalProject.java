import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

public class compSciFinalProject  {
	private JFrame frmLibraryItemManager;
	private JLabel welcomeLabel;
	private JComboBox<LibraryItem> bookCmbo;
	private JComboBox<LibraryItem> articleCmbo;
	private JComboBox<LibraryItem> magCmbo;
	private JComboBox<ElectronicMedia> dvdCmbo;
	private JComboBox<ElectronicMedia> cdCmbo;
	private JLabel bookLabel;
	private JLabel articleLabel;
	private JLabel magLabel;
	private JLabel dvdList;
	private JLabel cdList;
	private JButton bookAdd;
	private JButton cartCheck;
	private JButton articleAdd;
	private JButton magAdd;
	private JButton dvdAdd;
	private JButton cdAdd;
	 String itemCart = "";
	 String mediaCart = "";
	 int price;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		
		
       
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					compSciFinalProject window = new compSciFinalProject();
					window.frmLibraryItemManager.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public compSciFinalProject() {
		initComponents();
		
		
		
	}
///////////////////////////////////////////
//This method contains all of the code for creating and initializing components
///////////////////////////
private void initComponents() {

	
	
	frmLibraryItemManager = new JFrame();
	frmLibraryItemManager.setTitle("Library Item Manager");
	frmLibraryItemManager.setBounds(100, 100, 867, 691);
	frmLibraryItemManager.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frmLibraryItemManager.getContentPane().setLayout(null);
	
	String name = JOptionPane.showInputDialog("Please enter your name");
	
	
	welcomeLabel = new JLabel("Welcome to the Library item Checkout Manager "    + " ! ");
	welcomeLabel.setBackground(Color.BLACK);
	welcomeLabel.setFont(new Font("Gadugi", Font.BOLD | Font.ITALIC, 18));
	welcomeLabel.setBounds(145, 11, 443, 73);
	frmLibraryItemManager.getContentPane().add(welcomeLabel);
	
	
	
	final int max = 6;
	List<LibraryItem> inventory = new ArrayList<LibraryItem>();
	List<ElectronicMedia> eInventory = new ArrayList<ElectronicMedia>();
	
	///////////////////////////////////////////
	////////////////// BOOKS
	//////////////////////////////////////////
	LibraryItem[] Books = new LibraryItem[max];
	
	Books[0] = new Book(215231,"Calculus Early Trancendentals","19 April 2000","James Stewart",50,4);
    Books[1] = new Book(31241, " Under the Stars ","January 12 2006", "Jake Timer",21,3);
	Books[2] = new Book(1100 , "Cat in The Hat" , "April 21 1992" , "Dr.Seuss" ,15,4);
	Books[3] = new Book(1100 , "The Betrayal of the Seven" , "April 21 1990" , "Robert Baldwin",23 ,3);
	Books[4] = new Book(1100 , "The Story of the Twins" , "June 2 1832" , "Eleanor Tulip" ,45,3);
	Books[5] = new Book(1100 , "Fighters" , "April 16 1945" , "Susie Gold" ,5,2);
	
	
	
	
	bookLabel = new JLabel("Book List ");
	bookLabel.setForeground(Color.RED);
	bookLabel.setHorizontalAlignment(SwingConstants.CENTER);
	bookLabel.setFont(new Font("Gadugi", Font.BOLD, 18));
	bookLabel.setBounds(50, 63, 147, 25);
	frmLibraryItemManager.getContentPane().add(bookLabel);
	
	
	
	DefaultComboBoxModel<LibraryItem> bookModel = new DefaultComboBoxModel<LibraryItem>(Books);
	bookCmbo = new JComboBox<LibraryItem>(bookModel); 
	bookCmbo.setFont(new Font("Tahoma", Font.PLAIN, 10));
	
	bookCmbo.setBounds(60, 99, 127, 194);
	frmLibraryItemManager.getContentPane().add(bookCmbo);
	
	
	
	bookAdd = new JButton("Add Book ");
	bookAdd.setFont(new Font("Malgun Gothic", Font.BOLD | Font.ITALIC, 16));
	bookAdd.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			LibraryItem thing1 = (LibraryItem) bookCmbo.getSelectedItem();
			int test = JOptionPane.showConfirmDialog(bookCmbo, "Add " + thing1 + " to cart? ");
			
			if(thing1.getQuantity()== 0){
				JOptionPane.showMessageDialog(null, "Sorry That item is out of stock! Please Choose another Item! ");
			}
			
			if (test == 0 && thing1.getQuantity() > 0){
				JOptionPane.showMessageDialog(null, "Book added to Cart! ");
				inventory.add(thing1);
				thing1.setQuantity(thing1.getQuantity()-1);
				price += thing1.getPrice();
		}
		}
		}
	);
	
	
	bookAdd.setBounds(64, 305, 123, 43);
	frmLibraryItemManager.getContentPane().add(bookAdd);
	
	//////////////////////////////////////////////////////
	//////////// ARTICLES
	///////////////////////////////////////////////////////
	
	LibraryItem[] Articles = new LibraryItem[max];
	Articles[0] = new Article(214,"Wars In the Middle East","History",15,4);
	Articles[1] = new Article (66,"Drugs on Wall Street","Informational",6,6);
	Articles[2] = new Article(25,"Most popular Instruments", "Music Info",12,6);
	Articles[3] = new Article(62,"Scanning for Gold","Informational",7,8);
	Articles[4] = new Article(15,"Bringing back Americas Jobs","Political", 6,10);
	Articles[5] = new Article(66,"Legendary Sea Creatures","Oceanography",12,7);
	
	
	
	
	articleLabel = new JLabel("Article List ");
	articleLabel.setForeground(Color.RED);
	articleLabel.setFont(new Font("Gadugi", Font.BOLD, 18));
	articleLabel.setBounds(248, 64, 104, 23);
	frmLibraryItemManager.getContentPane().add(articleLabel);
	
	
	DefaultComboBoxModel<LibraryItem> articleModel = new DefaultComboBoxModel<LibraryItem>(Articles);
	articleCmbo = new JComboBox<LibraryItem>(articleModel);
	articleCmbo.setFont(new Font("Tahoma", Font.PLAIN, 10));
	articleCmbo.setBounds(248, 100, 123, 194);
	frmLibraryItemManager.getContentPane().add(articleCmbo);
	
	articleAdd = new JButton(" Add Article ");
	articleAdd.setFont(new Font("Malgun Gothic", Font.BOLD, 16));
	articleAdd.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			LibraryItem artSelect = (LibraryItem) articleCmbo.getSelectedItem();
			int test = JOptionPane.showConfirmDialog(articleCmbo, "Add " + artSelect + " to cart? ");
			
			if(artSelect.getQuantity()== 0){
				JOptionPane.showMessageDialog(null, "Sorry That item is out of stock! Please Choose another Item! ");
			}
			
			if (test == 0 && artSelect.getQuantity() > 0){
				JOptionPane.showMessageDialog(null, "Article added to Cart! ");
				inventory.add(artSelect);
				artSelect.setQuantity(artSelect.getQuantity() - 1);
				price += artSelect.getPrice();
				
		}
	}
	});
	articleAdd.setBounds(238, 305, 133, 43);
	frmLibraryItemManager.getContentPane().add(articleAdd);
	
	
	
	
	///////////////////////////////////////
	/////// MAGAZINES
	///////////////////////////////////////
	
	
	LibraryItem[] Magazines = new LibraryItem[max];
	Magazines[0] = new Magazine(2313,"Skateboading Made Simple","Skateboarding","26 June 2013",15,3);
	Magazines[1] = new Magazine(2600,"Tilted Streamers", "Comedy", "23 July 2017",13,4);
	Magazines[2] = new Magazine(1133,"Best Home furniture for 2017!","Informational", "12 December 2012",5,6);
	Magazines[3] = new Magazine(999,"Celebrity Gossip!","Celebrity","7 June 2014",16,23);
	Magazines[4] = new Magazine(232,"Scientific Advancements of Solar Energy","Science,", "15 August 2016",12,4);
	Magazines[5] = new Magazine(1780, "Best Looking homes of 2017!","Home Improvement","1 October 2016",5,6);
	
	
	
	magLabel = new JLabel("Magazine List ");
	magLabel.setForeground(Color.RED);
	magLabel.setFont(new Font("Gadugi", Font.BOLD, 18));
	magLabel.setBounds(430, 64, 122, 23);
	frmLibraryItemManager.getContentPane().add(magLabel);
	
	DefaultComboBoxModel<LibraryItem> magModel = new DefaultComboBoxModel<LibraryItem>(Magazines);
	magCmbo = new JComboBox<LibraryItem>(magModel);
	magCmbo.setFont(new Font("Tahoma", Font.PLAIN, 10));
	magCmbo.setBounds(425, 100, 127, 194);
	frmLibraryItemManager.getContentPane().add(magCmbo);
	
	magAdd = new JButton("Add Magazine ");
	magAdd.setFont(new Font("Malgun Gothic", Font.BOLD, 16));
	magAdd.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			LibraryItem thing1 = (LibraryItem) magCmbo.getSelectedItem();
			int test = JOptionPane.showConfirmDialog(magCmbo, "Add " + thing1 + " to cart? ");
			
			if(thing1.getQuantity()== 0){
				JOptionPane.showMessageDialog(null, "Sorry That item is out of stock! Please Choose another Item! ");
			}
			
			if (test == 0 && thing1.getQuantity() > 0){
				JOptionPane.showMessageDialog(null, "Magazine added to Cart! ");
				inventory.add(thing1);
				thing1.setQuantity(thing1.getQuantity()-1);
				price += thing1.getPrice();
		}
		}
		}
	);
	magAdd.setBounds(405, 305, 157, 43);
	frmLibraryItemManager.getContentPane().add(magAdd);
	
	/////////////////////////////////////////
	////////////// VIDEOS
	////////////////////////////////////////
	
	
	ElectronicMedia[] Videos = new ElectronicMedia[max];
	Videos[0] = new Video("Sports", "20:00", "Michael Jordan","none",20,8);
	Videos[1] = new Video("Comedy", "1:45:23","Adam Sandler", "Jennifer Aniston", 15,4);
	Videos[2] = new Video("Mystery","2:00:32","John Travolta", "Uma Thurman" , 15,5);
	Videos[3] = new Video("Comedy", "1:44:23" , "Jason Statham" , "Melissa Mccarthy", 15,3);
	Videos[4] = new Video("Kung Fu", "1:25:13" , "Jackie Chan" , "Liu Yifei", 15,4);
	Videos[5] = new Video("Comedy" , "1:45:12", "Jerry GoldField", "Jane Simmones" , 5,3);
	
	
	
	dvdList = new JLabel("DVD List ");
	dvdList.setForeground(Color.RED);
	dvdList.setFont(new Font("Gadugi", Font.BOLD, 18));
	dvdList.setBounds(74, 365, 85, 25);
	frmLibraryItemManager.getContentPane().add(dvdList);
	
	
	
	DefaultComboBoxModel<ElectronicMedia> dvdModel = new DefaultComboBoxModel<ElectronicMedia>(Videos);
	dvdCmbo = new JComboBox<ElectronicMedia>(dvdModel);
	dvdCmbo.setFont(new Font("Tahoma", Font.PLAIN, 10));
	
	dvdCmbo.setBounds(60, 401, 127, 194);
	frmLibraryItemManager.getContentPane().add(dvdCmbo);
	
	dvdAdd = new JButton("Add DVD ");
	dvdAdd.setForeground(Color.BLACK);
	dvdAdd.setFont(new Font("Malgun Gothic", Font.BOLD, 16));
	dvdAdd.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			ElectronicMedia dvdSelect = (ElectronicMedia) dvdCmbo.getSelectedItem();
			int test = JOptionPane.showConfirmDialog(dvdCmbo, "Add " + dvdSelect + " to cart? ");
			
			
			if(dvdSelect.getQuantity()== 0){
				JOptionPane.showMessageDialog(null, "Sorry That item is out of stock! Please Choose another Item! ");
			}
			
			
			if (test == 0 && dvdSelect.getQuantity() > 0){
				JOptionPane.showMessageDialog(null, "DVD added to Cart! ");
				eInventory.add(dvdSelect);
				dvdSelect.setQuantity((dvdSelect.getQuantity())-1);
				price += dvdSelect.getQuantity();
		}
		}
	});
	dvdAdd.setBounds(64, 606, 123, 43);
	frmLibraryItemManager.getContentPane().add(dvdAdd);
	
	
	
	/////////////////////////////////////
	///////// CDS
	/////////////////////////////////////
	
	
	
	ElectronicMedia[] CDS = new ElectronicMedia[max];
	CDS[0] = new CD("Jazz" ,"15:00" , "Best Jazz of the 70's",20,4);
	CDS[1] = new CD("Pop"," 12;31", "Kids Bop 12",15,7);
	CDS[2] = new CD("Hip-Hop","37:00","Recovery",12,4);
	CDS[3] = new CD("Pop","13:00","Millenium",20,3);
	CDS[4] = new CD("Rock","7:36","Curt Cobain Secret Tracks",12,5);
	CDS[5] = new CD("Pop","15:00","2016 Best Hits",12,6);
	
	cdList = new JLabel("CD List ");
	cdList.setForeground(Color.RED);
	cdList.setFont(new Font("Gadugi", Font.BOLD, 18));
	cdList.setBounds(269, 366, 85, 23);
	frmLibraryItemManager.getContentPane().add(cdList);
	
	
	
	DefaultComboBoxModel<ElectronicMedia> cdModel = new DefaultComboBoxModel<ElectronicMedia>(CDS);
	cdCmbo = new JComboBox<ElectronicMedia>(cdModel);
	cdCmbo.setFont(new Font("Tahoma", Font.PLAIN, 10));
	cdCmbo.setBounds(238, 400, 127, 194);
	frmLibraryItemManager.getContentPane().add(cdCmbo);
	
	cdAdd = new JButton("Add CD ");
	cdAdd.setForeground(Color.BLACK);
	cdAdd.setFont(new Font("Malgun Gothic", Font.BOLD, 16));
	cdAdd.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			
			ElectronicMedia cdSelection = (ElectronicMedia) cdCmbo.getSelectedItem();
			int test = JOptionPane.showConfirmDialog(cdCmbo, "Add " + cdSelection + " to cart? ");
			
			
			if(cdSelection.getQuantity()== 0){
				JOptionPane.showMessageDialog(null, "Sorry That item is out of stock! Please Choose another Item! ");
			}
			
			
			if (test == 0 && cdSelection.getQuantity() > 0){
				JOptionPane.showMessageDialog(null, " CD added to Cart! ");
				eInventory.add(cdSelection);
				cdSelection.setQuantity(cdSelection.getQuantity()-1);
				price += cdSelection.getPrice();
		}
		}
	});
	cdAdd.setBounds(243, 605, 123, 44);
	frmLibraryItemManager.getContentPane().add(cdAdd);
	
	cartCheck = new JButton("Check Cart");
	cartCheck.setFont(new Font("Malgun Gothic", Font.BOLD, 16));


	cartCheck.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			  for (int i = 0; i < inventory.size(); i++)
			    {
			        
			        itemCart += ("  " +  inventory.get(i) + "\n ");
			    }
			  
			  for (int i = 0; i <eInventory.size(); i++){
				  
				  mediaCart += (" " + eInventory.get(i) + " \n");
			  }
			  
			  String dope = (itemCart + mediaCart);
			
			int lol = JOptionPane.showConfirmDialog(null,"Your cart consists of " + dope + " Would you like to checkout? ");
			
			
			
			if (lol == 0 && dope.equals("") ){
				JOptionPane.showMessageDialog(null, " Sorry you selected no books" );
				
			}
				
			else if (lol == 0){
				
				JOptionPane.showMessageDialog(null, "Thank you for using our Library Item Serivice  " +    name +   " Your order has been logged and your books are ready for pickup! " + " \n Your price is " + price  +" dollars"   );
				frmLibraryItemManager.setVisible(false);
			}
		
		
			 
			
			
			
			
		}
		
		
	});
	cartCheck.setBounds(425, 433, 123, 43);
	frmLibraryItemManager.getContentPane().add(cartCheck);
	
	

	


}





}
