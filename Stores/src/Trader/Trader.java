package Trader;

import javax.xml.bind.helpers.DefaultValidationEventHandler;

import Deliverer.Deliverer;
import Deliverer.Product;
import TradingPlaces.TradingPlace;

public class Trader implements ITrader {

	private String name;
	private String address;
	private double capital;
	protected TradingPlace tradingPlace;
	protected int howManyDeliverers;
	protected Deliverer[] deliverer;
	private Product product;
	private Product[] stoka;

	Trader(String name, String address, double capital) {

		setName(name);
		setAddress(address);
		setCapital(capital);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {

		if (name != null) {
			this.name = name;
		} else {
			System.out.println("Enter a valid name");
		}
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		if (address != null) {
			this.address = address;
		} else {
			System.out.println("Enter a valid address");
		}
	}

	public double getCapital() {
		return capital;
	}

	public void setCapital(double capital) {
		if (capital > 0) {
			this.capital = capital;
		} else {
			System.out.println("You need more money!");
		}
	}

	public TradingPlace getTradingPlace() {
		return tradingPlace;
	}

	public void setTradingPlace(TradingPlace tradingPlace) {
		this.tradingPlace = tradingPlace;
	}

	public int getHowManyDeliverers() {
		return howManyDeliverers;
	}

	public void setHowManyDeliverers(int howManyDeliverers) {
		this.howManyDeliverers = howManyDeliverers;
	}

	public Deliverer[] getDeliverer() {
		return deliverer;
	}

	public void setDeliverer(Deliverer[] deliverer) {
		this.deliverer = deliverer;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Product[] getStoka() {
		return stoka;
	}

	public void setStoka(Product[] stoka) {
		this.stoka = stoka;
	}

	@Override
	public void askForDelivery(Product product, String whitchDeliverer) {

		for (int index = 0; index < deliverer.length; index++) {

			if (deliverer[index].equals(whitchDeliverer)) {
				deliverer[index].deliver(product, this.capital);
				break;
			}
		}
	}

	@Override
	public void takeTurnover() {

		double tempTurnOver = 0;

		for (int sellProduct = 0; sellProduct < this.stoka.length; sellProduct++) {
			tempTurnOver = this.stoka[sellProduct].getPrice() * 0.3;
			this.capital = +tempTurnOver;
		}
	}

	@Override
	public void payTaxes() {
		this.capital = -tradingPlace.getTaxesToPay();

	}
}
