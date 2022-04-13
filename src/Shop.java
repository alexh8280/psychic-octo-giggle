/*
 * Author: Alex Hosay
 * Date: 3/11/2022
 * Description: Shop class with Main Method for MODIFIED Ecommerce project (Coding quiz)
 */

import java.util.Scanner;

public class Shop {
	
	//initializing totalAmount to 0
	static double totalAmount = 0;
	
	//Inventory array of objects, in a single line; **ARRAY MODIFIED TO REFLECT CONSTRUCTORS IN SUBCLASSES**
	static Product[] inventory = {new Apparel("Business Ritual Women's Long Sleeve Top", 65.39, 4, 'L', "Blue"), new Book("The Art of Computer Programming", 190.54, 9, "Donald E. Knuth", "Instructional", "1234"), new Apparel("Men's Business Casual Shirt", 57.10, 2, 'M', "Teal"), new Bath("Organic Turmeric Soap", 11.25, 1), new Book("Head First Design Pattern", 37.35, 3, "Eric Freeman", "Instructional", "2345")};
  
	//method to display menu, called from the do while loop in the main method
	static void displayMenu() {
		
		System.out.println("Enter the product index (0 to 4) you want to buy. \nTo exit the shopping cart, enter any number other than 0 to 4\n");
		for (int i = 0; i <= inventory.length - 1; i++) {
			System.out.println(i + ": " + inventory[i].getName() + ": In Stock:" + inventory[i].getQuantity()); //for loop designed to print out only name attribute of inventory indexes 
		}
		
	}
	
	public static void main(String[] args) {
		
		int userInput; //declaring userInput variable used for menu options
		Scanner input = new Scanner(System.in); //opening scanner input
		
		
		do { //do while loop begins
		  displayMenu(); //calling menu display method
		  userInput = input.nextInt(); //receiving user input and assigning it to userInput variable
		  if (userInput >= 0 && userInput <= 4) {
			  inventory[userInput].buy(); //input between 0-4 selects that inventory index and sends to the buy method to return true or false
			  if (inventory[userInput].buy() == true) { //buy method returns "true"
				  System.out.println("Your purchase was successful!"); //prints purchase successful
				  totalAmount += inventory[userInput].getPrice(); //that same inventory index price is retrieved and added to totalAmount variable
				  inventory[userInput].removeStock(); //calls my removeStock method to decrease that item's quantity in memory at the correct time
			  }
			  else {
				  System.out.println("Sorry! this product is out of stock."); //returns false, prints out of stock
			  }
		  }
			
		} while (userInput >= 0 && userInput <= 4); //condition to continue to do while loop, if not 0-4... 
		System.out.println("Thank you for shopping with us! The total amount is " + totalAmount); //loop ends, message is printed with totalAmount value
	
		input.close(); //closing scanner
	}
	
}
