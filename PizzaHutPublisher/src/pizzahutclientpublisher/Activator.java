package pizzahutclientpublisher;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {

	ServiceRegistration publisherServiceRegistration;

	public void start(BundleContext bundleContext) throws Exception {
		System.out.println("Pizza Hut Publisher Started");
		PizzaHutPublisher clientPublisher = new PizzaHutPublisherImpl();
		publisherServiceRegistration = bundleContext.registerService(PizzaHutPublisher.class.getName(), clientPublisher, null);
	}

	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("Pizza Hut Publisher Stoped");
		publisherServiceRegistration.unregister();
	}

}
