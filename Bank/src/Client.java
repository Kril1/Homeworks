import java.util.Iterator;
import java.util.List;
import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.Period;

public class Client {

	private static final int HALF_OF_SALARY = 2;
	String name;
	String address;
	double mounthlySalary;
	double totalMoney;
	List<Deposit> deposits;
	List<Credit> credits;
	Bank myBank;
	double AllMountlyPayments;

	void makeDeposit(double money, String depositKind) {
		if (depositKind.equals(ShortDeposit.getName())) {
			this.totalMoney -= money;
			myBank.takingDeposit(money);
			deposits.add(new ShortDeposit());
		}	
		if (depositKind.equals(LongDeposit.getName())) {
			this.totalMoney -= money;
			myBank.takingDeposit(money);
			deposits.add(new LongDeposit());
		}		
	}

	void takeCredit(String typeOfCredit, double howMuchMoney, int howManyMounts) {
		if (typeOfCredit.equals(HomeCredit.getName())) {
			double mountlyPayment = myBank.giveHomeCredit(howMuchMoney, howManyMounts);
			if (mountlyPayment > this.mounthlySalary / HALF_OF_SALARY) {
				System.out.println("Can't get that credit");
			} else {
				System.out.println("New credit grandet!");
				credits.add(new HomeCredit());
				this.AllMountlyPayments += mountlyPayment;
			}

		}
		if (typeOfCredit.equals(ConsumerCredit.getName())) {
			double mountlyPayment = myBank.giveConsumerCredit(howMuchMoney, howManyMounts);
			if (mountlyPayment > this.mounthlySalary / HALF_OF_SALARY) {
				System.out.println("Can't get that credit");
			} else {
				System.out.println("New credit grandet!");
				credits.add(new ConsumerCredit());
				this.AllMountlyPayments += mountlyPayment;
			}
		} else {
			System.out.println("Enter a valid type of credit - Home Credit, or Consymer Credit!");
		}
	}

	void payingOffCredit(double moneyToInput) {		
		this.totalMoney -= this.AllMountlyPayments;	
	}
	
	
}
