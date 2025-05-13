package lists_01;

public class MainClass {

	public static void main(String[] args) {
		Product p01 = new Product("Cream", 4.50f);
		Product p02 = new Product("Lotion", 5.50f);
		Product p03 = new Product("Suncream", 6.50f);
		Product p04 = new Product("Shower gel", 7.50f);
		Product p05 = new Product("Soap", 8.50f);
		
		ShoppingCart shoppingCart = new ShoppingCart();
		
		System.out.println("Before adding anything the shopping cart contains:" + shoppingCart.toString());
		
		shoppingCart.addProduct(p01);
		shoppingCart.addProduct(p02);
		shoppingCart.addProduct(p03);
		System.out.println("After adding 3 products the shopping cart contains:" + shoppingCart.toString());
		
		shoppingCart.removeProduct(p03);
		System.out.println("After removing product p03 the shopping cart contains:" + shoppingCart.toString());
		
		shoppingCart.addProduct(0,p04);
		System.out.println("After adding at a specific position the products the shopping cart contains:" + shoppingCart.toString());
	
		System.out.println("Before replacing a product the productSum of the shoppingCart is:" + shoppingCart.getProductsSum());
		shoppingCart.setProduct(0, p05);
		System.out.println("After replacing a product the productSum of the shoppingCart is:" + shoppingCart.getProductsSum());
		System.out.println("After replacing a product the shopping cart contains:" + shoppingCart.toString());
		
		shoppingCart.emptyShoppingcart();
		System.out.println("After emptying the shopping cart contains:" + shoppingCart.toString());
		
		
		
		
		//As usual --this is your playground and test area
		
		
		
		
		
		
	}//main

}
