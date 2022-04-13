/*
 * Author: Alex Hosay
 * Date: 3/11/2022
 * Description: Bath subclass, inheriting from Product class of Modified Ecommerce project (coding quiz)
 */
public class Bath extends Product {

	public Bath(String name, double price, int quantity) {
		super(name, price, quantity);
		
	}
	
	public String getDetails() {
		return "We sell organic bath products!";
	}

}
