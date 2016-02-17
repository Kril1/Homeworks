package Trader;
import Deliverer.Deliverer;
import Deliverer.SmallDeliverer;
import TradingPlaces.Stand;
import TradingPlaces.StreetMerchant;
import TradingPlaces.TradingPlace;

public class ET extends Trader{
	
	private static final int MINIMUM_NUMBER_OF_DELIVERERS = 1;
	private static final int MAXIMUM_NUMBER_OF_DELIVERERS = 5;
	
	ET(String name, String address, double capital,int howManyDeliverers, Deliverer[] deliverer, TradingPlace tradingPlace) {
		super(name, address, capital);
		
		if (howManyDeliverers <= MAXIMUM_NUMBER_OF_DELIVERERS && howManyDeliverers >= MINIMUM_NUMBER_OF_DELIVERERS){
			
			this.howManyDeliverers = howManyDeliverers;			
		}else{
			System.out.println("Enter a valid number");
		}
		if (deliverer[howManyDeliverers] instanceof SmallDeliverer){
			this.deliverer[howManyDeliverers] = deliverer[howManyDeliverers];
		}
		if (tradingPlace instanceof Stand || tradingPlace instanceof StreetMerchant){
			
			this.tradingPlace = tradingPlace;
		}else{
			System.out.println("Enter a valid paramater.");
		}	
	}
}
