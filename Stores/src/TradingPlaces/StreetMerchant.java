package TradingPlaces;
public class StreetMerchant extends TradingPlace {

	private static final int MAXIMUM_SIZE = 6;
	private static final int MINIMUM_SIZE = 4;
	private final double taxesToPay = 50;

	StreetMerchant(String address, double workingHours, double size) {
		super(address, workingHours);

		if (size >= MINIMUM_SIZE && size <= MAXIMUM_SIZE) {
			this.size = size;
		} else {
			System.out.println("Enter valid parameters!");
		}
	}
}
