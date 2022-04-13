/*
 * Author: Alex Hosay
 * Date: 3/11/2022
 * Description: Product class for Ecommerce project (Coding quiz)
 */
public abstract class Product {
	//attributes
	private String name;
	private double price;
	private int quantity;
	
	
	//constructors
	public Product(String name, double price, int quantity) {
		
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		
	}


 
    //getters and setters
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	

	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}


	//buy method, called from the main method
	public boolean buy() {
		if (this.quantity > 0) {
			return true;
		}
		else return false;
		}
	
	//my own idea, to correctly remove an item for inventory after purchase (couldn't figure out any other way)
	public int removeStock() {
		return this.quantity--;
	}

}
