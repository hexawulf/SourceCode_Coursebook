package lists_01;

import java.util.LinkedList;
import java.util.List;

public class ShoppingCart {
	private int numberProducts;
	private float productsSum;
	private boolean voucherHonored;
	private List<Product> productList;
	
	public ShoppingCart() {
		this.productList =  new LinkedList<Product>();
	}
	
	public ShoppingCart(int numberOfProducts, float productsSum, boolean voucherHonored){
		this.numberProducts = numberOfProducts;
		this.productsSum = productsSum;
		this.voucherHonored = voucherHonored;
		this.productList =  new LinkedList<Product>();
	}
	
	//Unit 4, chapter 4 start
	public boolean addProduct(int position, Product a){
		try{
			productList.add(position, a);
			productsSum += a.getProductPrice();//what is the meaning of this line?
			//another way of adding the sum ==> productsSum = productsSum + a.getProductPrice();
		}catch(IndexOutOfBoundsException ex){
			return false;//Position not valid 
		}
		return true;
	}
	
	public boolean addProduct(Product a){
		boolean successful = productList.add(a);
		if(successful)
			productsSum += a.getProductPrice();
		//another way of adding the sum ==> productsSum = productsSum + a.getProductPrice();
		return successful;
	}
	
	public boolean removeProduct(Product a){
		boolean successful = productList.remove(a);
		if(successful)
			productsSum -= a.getProductPrice();
		//productsSum = productsSum - a.getProductPrice();
		return successful;
	}
	
	public void emptyShoppingcart(){
		productList.clear();
		productsSum = 0;
	}
	
	public int getNumberProducts(){
		return productList.size();
	}
	
	//Task for students - implement the method setProduct(int position, Product a)
	public boolean setProduct(int position, Product a){
		try{
			productsSum -= productList.get(position).getProductPrice();
			productList.set(position, a);
			productsSum += a.getProductPrice();
		}catch(IndexOutOfBoundsException ex){
			return false;//Position not valid 
		}
		return true;
	}
	//Unit 4, chapter 4 end
	
	public void setNumberProducts(int numberProducts) {
		this.numberProducts = numberProducts;
	}

	public double getProductsSum() {
		return productsSum;
	}

	public void setProductsSum(float productsSum) {
		this.productsSum = productsSum;
	}

	public boolean isVoucherHonored() {
		return voucherHonored;
	}

	public void setVoucherHonored(boolean voucherHonored) {
		this.voucherHonored = voucherHonored;
	}
	
	public String toString() {
		String content = "";
		if(productList.size() > 0){
			 content += "This basket contains:\n";
			for(Product p : productList){
				content += p.toString();
			}
		}else{
			content += "This basket is empty!!";
		}
		
		//System.out.println("Breakpoint 1");
		return content;
	}
	
	/*Task for the students: Implement the equals()-method for this class
	 *Can you use the '=='-operator for the comparison?
	 *Justify your answer*/
	@Override
	public boolean equals(Object obj) {
		if( this == obj) return true;//Is it already the same object?
		//If the compared objects have the same reference, then it is clear that they contain the same attribute values.
		
		if(obj instanceof ShoppingCart){//Check if the transferred object has the expected type 
			ShoppingCart newCart = (ShoppingCart) obj;//Typecast the correct type
			return ((this.numberProducts == newCart.numberProducts) 
					&& (this.productsSum == newCart.productsSum) 
					&& (this.voucherHonored == newCart.voucherHonored));//Comparison of the relevant attributes(all 3)
		}else{
			return super.equals(obj);//If obj does not have the correct type, call the equals method of the superclass
			/*this is always needed. It is included with the hope that if our method fails to compare,
			then maybe some more general equals()-method will be able to perform the compare successfully*/ 
		}
	}

	public List<Product> getProductList() {
		return productList;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}
}
