package pizzahutclientpublisher;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class PizzaHutPublisherImpl implements PizzaHutPublisher {
	
	public static ArrayList<String> delivery = new ArrayList<String>();
	public static HashMap<Integer, ArrayList<String>> pizzaList = new HashMap<Integer, ArrayList<String>>();

	@Override
	public String publishPizzaHutService() {
		return "Pizza Hut Publisher";
	}

	public static ArrayList<String> getDelivery() {
		return delivery;
	}

	public static void setDelivery(ArrayList<String> delivery) {
		PizzaHutPublisherImpl.delivery = delivery;
	}

	public static HashMap<Integer, ArrayList<String>> getPizzaList() {
		return pizzaList;
	}

	public static void setPizzaList(HashMap<Integer, ArrayList<String>> pizzaList) {
		PizzaHutPublisherImpl.pizzaList = pizzaList;
	}
	
	public static void retrivePizzaList() {
		
		for (Integer i : pizzaList.keySet()) {
			
			System.out.println(i + " " + "Pizza Name: " + pizzaList.get(i).get(0) + "\t"+ " Price: " + pizzaList.get(i).get(1));
		}
	}
	
	public static String getPerson() {
		Random randomGenerator = new Random();
		int index = randomGenerator.nextInt(delivery.size());
		 
		return(delivery.get(index));
	}
	

}
