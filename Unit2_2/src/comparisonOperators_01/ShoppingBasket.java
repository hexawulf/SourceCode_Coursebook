package comparisonOperators_01;

public class ShoppingBasket {
	
	//This is the only comment in this class. This is a little bit not professional.
	//Please add comments which you find reasonable. 
	
	
	private int numberProducts;
	private double productsSum;
	private boolean voucherHonored;
	
	public ShoppingBasket(int numberOfProducts, double productsSum, boolean voucherHonored){
		this.numberProducts = numberOfProducts;
		this.productsSum = productsSum;
		this.voucherHonored = voucherHonored;
	}

	public int getNumberProducts() {
		return numberProducts;
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
		return "This basket contains:\n" +
				"numberProducts=" + numberProducts + "\n" + 
				"productsSum=" + productsSum + "\n" + 
				"voucherHonored=" + voucherHonored + "\n";
	}
	
}
