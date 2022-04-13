/*
 * Author: Alex Hosay
 * Date: 3/11/2022
 * Description: Book subclass, inheriting from Product class of Modified Ecommerce project (coding quiz)
 */
public class Book extends Product {
	
	String author;
	String genre;
	String isbn;
	
	public Book(String name, double price, int quantity) {
		super(name, price, quantity);
	
	}

	public Book(String name, double price, int quantity, String author, String genre, String isbn) {
		super(name, price, quantity);
		this.author = author;
		this.genre = genre;
		this.isbn = isbn;
	}
	
	public String getDetails () {
		return "We sell books on software development.";
	}

}
