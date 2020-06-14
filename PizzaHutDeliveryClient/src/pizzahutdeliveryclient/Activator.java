package pizzahutdeliveryclient;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import pizzahutclientpublisher.PizzaHutPublisher;
import pizzahutclientpublisher.PizzaHutPublisherImpl;

public class Activator implements BundleActivator {

	ServiceReference serviceReference;

	public void start(BundleContext bundleContext) throws Exception {
		serviceReference = bundleContext.getServiceReference(PizzaHutPublisher.class.getName());
		PizzaHutPublisherImpl pizzaHutPublisher = (PizzaHutPublisherImpl)bundleContext.getService(serviceReference);

		DeliveryOrder neworder = new DeliveryOrder();
		
		neworder.startOrder();
	}

	public void stop(BundleContext bundleContext) throws Exception {
		bundleContext.ungetService(serviceReference);
	}

}
