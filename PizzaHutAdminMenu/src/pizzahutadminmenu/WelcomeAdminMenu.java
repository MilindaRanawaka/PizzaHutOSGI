package pizzahutadminmenu;

import java.util.HashMap;
import java.util.Scanner;

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import pizzahutaddfood.Activator;
import pizzahutdelivery.DeliveryActivator;

public class WelcomeAdminMenu {

	public void startAdminMenu() {
		System.out.println("Welcome to Pizza Hut Admin Menu");
		System.out.println("Choose Service that you need");
		System.out.println("01. Add Food");
		System.out.println("02. Add Delivery Person");
		
		Scanner myObj = new Scanner(System.in);
		
	    System.out.print("Enter Option Number: ");
	    String number = myObj.nextLine();
	    
	    if(number.equals("01") || number.equals(("1"))) {
	    	Activator addFoodActi = new Activator();
	    }
	    else if(number.equals("02") || number.equals(("2"))){
	    	DeliveryActivator deliveryActi = new DeliveryActivator();
	    }
	}

}
