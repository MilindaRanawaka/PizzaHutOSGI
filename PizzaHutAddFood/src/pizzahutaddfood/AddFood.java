package pizzahutaddfood;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class AddFood {
	
	public static HashMap<Integer, ArrayList<String>> pizzaList;
	
	public AddFood(HashMap<Integer, ArrayList<String>> pizzaList) {
		this.pizzaList = pizzaList;
	}

	public HashMap<Integer, ArrayList<String>> addPizza() {
		
		Scanner myObj = new Scanner(System.in);
		
	    System.out.print("How many food items do you want to add : ");
	    String number = myObj.nextLine();
	    
	    for(int i=0;i<Integer.parseInt(number);i++) {
	    	
	    	ArrayList<String> pizzaDetails = new ArrayList<String>();
	    	
	    	System.out.print("Enter Food Name : ");
	    	String pizzaName = myObj.nextLine();
	    	System.out.print("Enter food Price : ");
	    	int pizzaPrice = myObj.nextInt();
	    	
	    	myObj.nextLine();
	    	pizzaDetails.add(pizzaName);
	    	pizzaDetails.add(Integer.toString(pizzaPrice));
	    	
	    	pizzaList.put(i+1, pizzaDetails);
	    }
	    
	    return pizzaList;
	}

}
