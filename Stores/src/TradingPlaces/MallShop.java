package TradingPlaces;
public class MallShop extends TradingPlace{

	private static final int MAXIMUM_SIZE = 10;
	private static final int MINIMUM_SIZE = 100;
	private final double taxesToPay = 150;
	
	MallShop(String address, double workingHours, double size) {
		super(address, workingHours);
		
		if (size >= MINIMUM_SIZE && size <= MAXIMUM_SIZE) {
			this.size = size;
		} else {
			System.out.println("Enter valid parameters!");
		}	
	}
}
