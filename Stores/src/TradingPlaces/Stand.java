package TradingPlaces;

public class Stand extends TradingPlace {

	private static final int MAXIMUM_SIZE = 2;
	private static final int MINIMUM_SIZE = 10;
	private final double taxesToPay = 50;

	Stand(String address, double workingHours, double size) {
		super(address, workingHours);

		if (size >= MINIMUM_SIZE && size <= MAXIMUM_SIZE) {
			this.size = size;
		} else {
			System.out.println("Enter valid parameters!");
		}
	}
}
