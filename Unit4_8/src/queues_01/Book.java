package queues_01;

public class Book {
	
	//attributes
	private String author;
	private String title;
	private String manufacturer;
	private int stock;
	private float price;
	
	//constructor
	public Book(){}
	
	public Book(String manufacturer, String title, float price, String author){
		this.manufacturer = manufacturer;
		this.title = title;
		this.price = price;
		this.author = author;
	}
	
	//getters and setters
	public String getAuthor(){
		return this.author;
	}
	
	public void setAuthor(String author){
		this.author = author;
	}
	
	public String getTitle(){
		return this.title;
	}
	
	public void setTitle(String title){
		this.title = title;
	}
	
	public String getManufacturer(){
		return this.manufacturer;
	}
	
	public void setManufacturer(String manufacturer){
		this.manufacturer = manufacturer;
	}
	
	public int getStock(){
		return this.stock;
	}
	
	public void setStock(int stock){
		this.stock = stock;
	}
	
	public float getPrice(){
		return this.price;
	}
	
	public void setPrice(float price){
		this.price = price;
	}
}
