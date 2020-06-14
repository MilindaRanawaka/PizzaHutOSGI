package pizzahutclientmenu;

import java.util.Scanner;
import pizzahutdeliveryclient.Activator;
import pizzahutpickup.PickUpActivator;


public class WelcomeMenu {
	public void StartMenue() {
		System.out.println("Welcome to Pizza Hut Client Menu");
		System.out.println("Choose Service that you need");
		System.out.println("01. Delivery");
		System.out.println("02. PickUp or Dinnin");
		
		Scanner myObj = new Scanner(System.in);
		
	    System.out.print("Enter Option Number: : ");
	    String number = myObj.nextLine();
	    
	    if(number.equals("01") || number.equals(("1"))) {
	    	Activator deliveryActivator = new Activator();

	    }
	    else if(number.equals("02") || number.equals(("2"))){
	    	PickUpActivator pickUpActivator = new PickUpActivator();
	    }
	}

}
