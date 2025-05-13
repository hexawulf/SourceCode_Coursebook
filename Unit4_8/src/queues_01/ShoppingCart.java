package queues_01;

import java.util.LinkedList;
import java.util.List;

public class ShoppingCart {
	
	private int numberProducts;
	private double productsSum;
	private boolean voucherHonored;
	private List<Book> productList = new LinkedList<Book>(); 
	
	public ShoppingCart(){}
	
	public ShoppingCart(int numberOfProducts, double productsSum, boolean voucherHonored){
		this.numberProducts = numberOfProducts;
		this.productsSum = productsSum;
		this.voucherHonored = voucherHonored;
	}

	public void setNumberProducts(int numberProducts) {
		this.numberProducts = numberProducts;
	}

	public double getProductsSum() {
		return productsSum;
	}

	public void setProductsSum(double productsSum) {
		this.productsSum = productsSum;
	}

	public boolean isVoucherHonored() {
		return voucherHonored;
	}

	public void setVoucherHonored(boolean voucherHonored) {
		this.voucherHonored = voucherHonored;
	}
	
	public String toString() {
		String result = "This shopping cart contains:\n";
		int amountOfProducts = this.productList.size();
		for(int index = 0; index < amountOfProducts; index++){
			String author = this.productList.get(index).getAuthor();
			String title = this.productList.get(index).getTitle();
			double price = this.productList.get(index).getPrice();
			String manufacturer = this.productList.get(index).getManufacturer();
			
			String nextStringToAppend = "Author:" + author + "\n" +
										"Titile:" + title + "\n" +
										"Price:" + price + "\n" +
										"Manufacturer:" + manufacturer + "\n";
			result += nextStringToAppend;
		}
		return result;
	}
	
	public boolean addProduct(int position, Book a){
		try{
			productList.add(position, a);
			productsSum += a.getPrice();
		}catch(IndexOutOfBoundsException ex){
			return false;
		}		
		return true;
	}
	
	public boolean addProduct(Book a){
		boolean successful = productList.add(a);
		if(successful)
			productsSum += a.getPrice();
		return successful;
	}
	
	public boolean removeProduct(Book a){
		boolean successful = productList.remove(a);
		if(successful)
			productsSum -= a.getPrice();
		return successful;
	}
	
	public void emptyShoppingCart(){
		productList.clear();
		productsSum = 0;
	}
	
	public int getNumberProducts(){
		return productList.size();
	}
	
}
