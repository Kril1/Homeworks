package Deliverer;

public class BigDeliverer extends Deliverer{

	private final double OFF_PRICE = 0.15;
	
	BigDeliverer(String name, double workingHours, String address, Product product) {
		super(name, workingHours, address, product);
		
		double temp = product.getPrice() * OFF_PRICE; 
		product.setPrice((product.getPrice() - temp));
	}
}
