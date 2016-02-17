package TradingPlaces;

public class TradingPlace {

	private static final int lATEST_ENDING_HOUR = 24;
	private static final int EARLIEST_STARTING_HOUR = 0;
	protected String address;
	protected double workingHours;
	protected double size;
	private double taxesToPay;
	
	TradingPlace (String address, double workingHours){
		
		if (address != null){
			this.address = address;
		}else{
			System.out.println("Please enter a valid address!");
		}
		if (workingHours >= EARLIEST_STARTING_HOUR && workingHours <= lATEST_ENDING_HOUR){
			this.workingHours = workingHours;
		}else{
			System.out.println("Enter valid hours!");
		}	
	}

	public double getTaxesToPay() {
		return taxesToPay;
	}

	public void setTaxesToPay(double taxesToPay) {
		this.taxesToPay = taxesToPay;
	}	
}
