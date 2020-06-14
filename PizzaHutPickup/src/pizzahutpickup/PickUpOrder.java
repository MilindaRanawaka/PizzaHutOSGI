package pizzahutpickup;

import java.util.ArrayList;
import java.util.Scanner;

import pizzahutaddfood.AddFood;
import pizzahutclientpublisher.PizzaHutPublisherImpl;

public class PickUpOrder {
	
	public void startOrder() {
		
		System.out.println("Welcome to Pickup Service");
		Scanner myObj = new Scanner(System.in);
		
		System.out.print("Enter PickUp Time : ");
		String address = myObj.nextLine();
		
		
		PizzaHutPublisherImpl.retrivePizzaList();
		
		ArrayList<ArrayList> orderList = new ArrayList<ArrayList>();

	    System.out.print("Enter Food Number(Enter 0 to stop): ");
	    int num = myObj.nextInt();
	    
	    while(num!=0) {
		    System.out.print("Enter Quentity: ");
		    int qty = myObj.nextInt();
		    ArrayList<String> order = new ArrayList<String>();
		    
		    ArrayList<String> list = AddFood.pizzaList.get(num);
		    int price = Integer.parseInt(list.get(1));
		    
		    order.add(list.get(0));
		    order.add(Integer.toString(qty));
		    order.add(Integer.toString(price));	
		    
		    orderList.add(order);
		    
		    System.out.print("Enter Food Number(Enter 0 to stop): ");
		    num = myObj.nextInt();
	    }
	    
	    int totalPrice=0;
	    int num2=0;
	    for(ArrayList i : orderList) {
	    	int itemPrice = Integer.parseInt((String) i.get(2)) * Integer.parseInt((String) i.get(1));
	    	System.out.println(++num2 +". " + i.get(0) + "   \t*\t" + i.get(1) + "\t=\t" + itemPrice);
	    	totalPrice+=itemPrice;
	    }
	    System.out.println("Total Price: " + totalPrice);
	}
}
