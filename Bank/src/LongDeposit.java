import java.time.LocalDate;
import java.time.Period;

public class LongDeposit extends Deposit{

	private static final double INTREST_FOR_LONG_DEPOSTI = 0.05;
	private static final int MOUNTS_FOR_SHORT_DEPOSIT = 12;
	Period oneYear = Period.ofMonths(MOUNTS_FOR_SHORT_DEPOSIT);
	LocalDate date = LocalDate.now();
	private static String name = "Long Deposit";

	public static String getName() {
		return name;
	}
	
	void makingDeposit (double money){
		double totalMoney = money + (money *INTREST_FOR_LONG_DEPOSTI);
		LocalDate dateToEndDeposit = date.plus(oneYear);
		
		System.out.println("You can withdraw your deposit at " + dateToEndDeposit + ", the total sum will be: " + totalMoney);
	}
}
