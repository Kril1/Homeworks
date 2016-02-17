package Deliverer;

import Trader.Trader;

public class Deliverer {

	private String name;
	private double workingHours;
	private String address;
	private Product product;
	private Trader trader;

	Deliverer(String name, double workingHours, String address, Product product) {
		if (name != null) {
			this.name = name;
		} else {
			System.out.println("Enter a valid name");
		}
		if (workingHours > 0 && workingHours < 24) {
			this.workingHours = workingHours;
		} else {
			System.out.println("Enter valid hours!");
		}

		if (address != null) {
			this.address = address;
		} else {
			System.out.println("Enter a valid address");
		}
	}

	public void deliver(Product product, double money) {

		int howManyProducts = 0;
		Product[] stokaToDeliver = new Product[howManyProducts];
		while (money > product.getPrice()) {
			stokaToDeliver[howManyProducts] = product;
			howManyProducts++;
			money = -product.getPrice();
		}
		trader.setStoka(stokaToDeliver);
	}
}
