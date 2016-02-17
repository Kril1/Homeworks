import java.time.LocalDate;
import java.time.Period;

public class ShortDeposit extends Deposit {

	private static final double INTREST_FOR_SHORT_DEPOSTI = 0.03;
	private static final int MOUNTS_FOR_SHORT_DEPOSIT = 3;
	Period threeMounts = Period.ofMonths(MOUNTS_FOR_SHORT_DEPOSIT);
	LocalDate date = LocalDate.now();
	private static String name = "Short Deposit";

	public static String getName() {
		return name;
	}
	
	void makingDeposit (double money){
		double totalMoney = money + (money *INTREST_FOR_SHORT_DEPOSTI);
		LocalDate dateToEndDeposit = date.plus(threeMounts);
		
		System.out.println("You can withdraw your deposit at " + dateToEndDeposit + ", the total sum will be: " + totalMoney);
	}
}
