package Trader;
import Deliverer.BigDeliverer;
import Deliverer.Deliverer;
import Deliverer.SmallDeliverer;
import TradingPlaces.MallShop;
import TradingPlaces.Stand;
import TradingPlaces.TradingPlace;

public class Retailer extends Trader {

	private static final int MINIMUM_NUMBER_OF_DELIVERERS = 1;
	private static final int MAXIMUM_NUMBER_OF_DELIVERERS = 15;
	private int howManyStores;
	
	Retailer(String name, String address, double capital, Deliverer[] deliverer, int howManyStores,TradingPlace[] tradingPlace) {
		super(name, address, capital);

		if (howManyDeliverers <= MAXIMUM_NUMBER_OF_DELIVERERS && howManyDeliverers >= MINIMUM_NUMBER_OF_DELIVERERS) {

			this.howManyDeliverers = howManyDeliverers;
		} else {
			System.out.println("Enter a valid number");
		}
		
		if (deliverer[howManyDeliverers] instanceof SmallDeliverer || deliverer[howManyDeliverers] instanceof BigDeliverer) {
			this.deliverer[howManyDeliverers] = deliverer[howManyDeliverers];
		}
		
		if (howManyStores >= MINIMUM_NUMBER_OF_DELIVERERS && howManyStores <=MAXIMUM_NUMBER_OF_DELIVERERS){
			this.howManyStores = howManyStores;
		}else{
			System.out.println("Enter a valid number");
		}
		if (tradingPlace[howManyStores] instanceof Stand || tradingPlace[howManyStores] instanceof MallShop) {

			this.tradingPlace = tradingPlace[howManyStores];
		} else {
			System.out.println("Enter a valid paramater.");
		}
	}
}
