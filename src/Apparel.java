/*
 * Author: Alex Hosay
 * Date: 3/11/2022
 * Description: Apparel subclass, inheriting from Product class of Modified Ecommerce project (coding quiz)
 */
public class Apparel extends Product {
	
	char size;
	String color;
	public Apparel(String name, double price, int quantity, char size, String color) {
		super(name, price, quantity);
		this.size = size;
		this.color = color;
	}
	
	public String getDetails() {
		return "We sell different kinds of business clothes for both men and women";
	}

}
