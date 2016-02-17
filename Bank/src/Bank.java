import java.time.LocalDate;
import java.time.Period;
import java.util.List;

public class Bank {

	LocalDate date = LocalDate.now();
	String name;
	String address;
	double currentMoney;
	double reserve;
	List<Client> clientAccounts;
	HomeCredit homeCredit;
	ConsumerCredit consumerCredit;

	void takingDeposit(double money) {

		this.currentMoney += money;
		this.reserve += (money * 0.1);
	}

	double giveHomeCredit(double howMuchMoney, int mounts) {
		if (howMuchMoney < (this.currentMoney - this.reserve)) {
			double mountlyPayment = homeCredit.mountlyPayment(mounts, howMuchMoney);
			return mountlyPayment;
		} else {
			System.out.println("The bank can't give this credit!");
		}
		return -1;
	}

	double giveConsumerCredit(double howMuchMoney, int mounts) {

		if (howMuchMoney < (this.currentMoney - this.reserve)) {
			double mountlyPayment = consumerCredit.mountlyPayment(mounts, howMuchMoney);
			return mountlyPayment;
		} else {
			System.out.println("The bank can't give this credit!");
		}
		return -1;
	}
}
