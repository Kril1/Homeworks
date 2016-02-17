package Trader;

import Deliverer.Deliverer;
import Deliverer.SmallDeliverer;

public class PeddlerTrader extends Trader {

	private static final int NUMBER_OF_DELIVERERS = 1;

	PeddlerTrader(String name, String address, double capital, int howManyDeliverers, Deliverer deliverer) {
		super(name, address, capital);

		if (howManyDeliverers == NUMBER_OF_DELIVERERS) {
			// this is done so the number in the array is 0, the first position.
			this.howManyDeliverers = howManyDeliverers - 1;
		} else {
			System.out.println("A Paddler can only have one deliverer!");
		}

		if (deliverer instanceof SmallDeliverer) {
			this.deliverer[howManyDeliverers] = deliverer;
		} else {
			System.out.println("Enter a valid deliverer!");
		}
	}
}
