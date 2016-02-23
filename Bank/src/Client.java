import java.util.Iterator;
import java.util.List;
import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.Period;

public class Client {

	private static final int HALF_OF_SALARY = 2;
	private String name;
	private String address;
	private double mounthlySalary;
	private double totalMoney;
	private List<Deposit> deposits;
	private List<Credit> credits;
	private Bank myBank;
	private double AllMountlyPayments;

	Client(String name, String address, double mounthlySalary, double totoalMoney, Bank myBank, List<Deposit> deposits,List<Credit> credits) {		
		this.setAddress(address);
		this.setMounthlySalary(mounthlySalary);
		this.setMyBank(myBank);
		this.setName(name);
		this.setTotalMoney(totoalMoney);
		this.deposits = deposits;
		this.credits = credits;
	}

	private void setName(String name) {
		if (name != null && name.length() > 0) {
			this.name = name;
		}
	}

	private void setAddress(String address) {
		if (name != address && address.length() > 0) {
			this.address = address;
		}
	}

	private void setMounthlySalary(double mounthlySalary) {
		if (mounthlySalary > 0) {
			this.mounthlySalary = mounthlySalary;
		}
	}

	private void setTotalMoney(double totalMoney) {
		if (totalMoney >= 0) {
			this.totalMoney = totalMoney;
		}
	}

	private void setMyBank(Bank myBank) {
		if (myBank != null) {
			this.myBank = myBank;
		}
	}

	void makeDeposit(double money, Deposit depositKind) {
		if (depositKind instanceof ShortDeposit) {
			deposits.add(depositKind);
			this.totalMoney -= money;
			myBank.takingDeposit(money);
			deposits.add(new ShortDeposit());
			
		}
		if (depositKind instanceof LongDeposit) {
			deposits.add(depositKind);
			this.totalMoney -= money;
			myBank.takingDeposit(money);
			deposits.add(new LongDeposit());
		}
	}

	void takeCredit(Credit typeOfCredit, double howMuchMoney, int howManyMounts) {
		if (typeOfCredit instanceof HomeCredit) {
			double mountlyPayment = myBank.giveHomeCredit(howMuchMoney, howManyMounts);
			if (mountlyPayment > this.mounthlySalary / HALF_OF_SALARY) {
				System.out.println("Can't get that credit");
			} else {
				System.out.println("New credit grandet!");
				credits.add(new HomeCredit());
				this.AllMountlyPayments += mountlyPayment;
			}

		}
		if (typeOfCredit instanceof ConsumerCredit) {
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

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public double getMounthlySalary() {
		return mounthlySalary;
	}

	public double getTotalMoney() {
		return totalMoney;
	}

	public Bank getMyBank() {
		return myBank;
	}
	
	public List<Deposit> getDeposits() {
		return deposits;
	}

}
