package pizzahutdelivery;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class AddDeliveryPerson {
	public static ArrayList<String> delivery;
	
	public AddDeliveryPerson(ArrayList<String> delivery) {
		this.delivery = delivery;
	}
	
	public ArrayList<String> addPizza() {
		
		Scanner myObj = new Scanner(System.in);
		
	    System.out.print("How many Delivery Person you want to add : ");
	    String number = myObj.nextLine();
	    
	    for(int i=0;i<Integer.parseInt(number);i++) {
	    	System.out.print("Enter Delivery Person Name: ");
	    	String name = myObj.nextLine();
	    	
	    	delivery.add(name);
	    }
	    
	    return delivery;
	}

}
