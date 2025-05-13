package queues_01;

public class Order {
	
	private String timestamp;
	private Customer orderer;
	private ShoppingCart shoppingCart;
	
	public Order(String timestamp, Customer orderer, ShoppingCart shoppingCart){
		this.timestamp = timestamp;
		this.orderer = orderer;
		this.shoppingCart = shoppingCart;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public Customer getOrderer() {
		return orderer;
	}

	public void setOrderer(Customer orderer) {
		this.orderer = orderer;
	}

	public ShoppingCart getShoppingCart() {
		return shoppingCart;
	}

	public void setShoppingCart(ShoppingCart shoppingCart) {
		this.shoppingCart = shoppingCart;
	}
	
}
