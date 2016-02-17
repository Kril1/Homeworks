package Trader;

import Deliverer.Product;

public interface ITrader {

	void takeTurnover();
	void payTaxes ();
	void askForDelivery(Product product, String whitchDeliverer);
	
}
