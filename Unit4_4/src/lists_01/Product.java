package lists_01;

public class Product {
	
	private String productName;
	private float productPrice;
	private String productInventoryNumber;
	
	public Product(){}
	
	public Product(String name, float price){
		this.productName = name;
		this.productPrice = price;
	}
	
	public Product(String name, float price, String inventoryNumber){
		this.productName = name;
		this.productPrice = price;
		this.productInventoryNumber = inventoryNumber;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public float getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(float productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductInventoryNumber() {
		return productInventoryNumber;
	}

	public void setProductInventoryNumber(String productInventoryNumber) {
		this.productInventoryNumber = productInventoryNumber;
	}
	
	@Override
	public String toString(){
		String content = "Product name:" + productName 
						+ "\n Product price:" + productPrice 
						+ "\n";
		return content;
	}
		
}
