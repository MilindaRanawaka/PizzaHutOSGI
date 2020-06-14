package pizzahutdelivery;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import pizzahutclientpublisher.PizzaHutPublisher;
import pizzahutclientpublisher.PizzaHutPublisherImpl;

public class DeliveryActivator implements BundleActivator {

	ServiceReference serviceReference;

	public void start(BundleContext bundleContext) throws Exception {
		serviceReference = bundleContext.getServiceReference(PizzaHutPublisher.class.getName());
		PizzaHutPublisherImpl pizzaHutPublisher = (PizzaHutPublisherImpl)bundleContext.getService(serviceReference);
		AddDeliveryPerson newperson = new AddDeliveryPerson(pizzaHutPublisher.getDelivery());
		pizzaHutPublisher.setDelivery(newperson.addPizza());
	}

	public void stop(BundleContext bundleContext) throws Exception {
		bundleContext.ungetService(serviceReference);
	}

}
