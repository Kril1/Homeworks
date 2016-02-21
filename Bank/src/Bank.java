import java.time.LocalDate;
import java.time.Period;
import java.util.List;

public class Bank {

	LocalDate date = LocalDate.now();
	private String name;
	private String address;
	private double currentMoney;
	private double reserve;
	private List<Client> clientAccounts;
	private iCredit credit;
	
	Bank (String name, String address, double currentMoney){
		
		this.setAddress(address);
		this.setCurrentMoneyAndReserve(currentMoney);
		this.setName(name);
		
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

	private void setCurrentMoneyAndReserve(double currentMoney) {

		if (currentMoney > 0) {
			this.currentMoney = currentMoney;
			this.reserve = currentMoney * 0.1;
		}
	}

	void takingDeposit(double money) {

		this.currentMoney += money;
		this.reserve += (money * 0.1);
	}

	double giveHomeCredit(double howMuchMoney, int mounts) {
		if (howMuchMoney < (this.currentMoney - this.reserve)) {
			double mountlyPayment = credit.mountlyPayment(mounts, howMuchMoney);
			return mountlyPayment;
		} else {
			System.out.println("The bank can't give this credit!");
		}
		return -1;
	}

	double giveConsumerCredit(double howMuchMoney, int mounts) {

		if (howMuchMoney < (this.currentMoney - this.reserve)) {
			double mountlyPayment = credit.mountlyPayment(mounts, howMuchMoney);
			return mountlyPayment;
		} else {
			System.out.println("The bank can't give this credit!");
		}
		return -1;
	}
	
}
