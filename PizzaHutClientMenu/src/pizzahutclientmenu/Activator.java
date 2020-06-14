package pizzahutclientmenu;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import pizzahutclientpublisher.PizzaHutPublisherImpl;
import pizzahutclientpublisher.PizzaHutPublisher;

public class Activator implements BundleActivator {
	
	ServiceReference serviceReference;

	public void start(BundleContext bundleContext) throws Exception {
		System.out.println("Pizza Hut Client Menu Start");
		serviceReference = bundleContext.getServiceReference(PizzaHutPublisher.class.getName());
		PizzaHutPublisherImpl pizzaHutPublisher = (PizzaHutPublisherImpl)bundleContext.getService(serviceReference);
		System.out.println(pizzaHutPublisher.publishPizzaHutService());
		
		WelcomeMenu welcomeMenu = new WelcomeMenu();
		welcomeMenu.StartMenue();
	}

	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("Pizza Hut Client Menu Stop");
		bundleContext.ungetService(serviceReference);
	}

}
