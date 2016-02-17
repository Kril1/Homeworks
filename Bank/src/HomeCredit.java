import java.time.LocalDate;

public class HomeCredit extends Credit {

	private static final double INTEREST = 0.06;
	LocalDate date = LocalDate.now();
	private static String name = "Home Credit";
	
	public static String getName() {
		return name;
	}

	@Override
	public double caculateInterest (double moneyTaken){	
		double interest = moneyTaken * INTEREST;	
		return interest;
	}

	@Override
	public double totalMoneyToReturn(double moneyTaken) {		
		double interest = caculateInterest(moneyTaken);
		double totalMoneyToReturn = interest + moneyTaken;
		return 	totalMoneyToReturn;
	}

	@Override
	public double mountlyPayment(int mounts, double moneyTaken) {		
		double totalMoneyToReturn = totalMoneyToReturn(moneyTaken);
		double monetlyPaymant =	totalMoneyToReturn / mounts;	
		return monetlyPaymant;		
	}
	
}
