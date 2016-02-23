import java.util.LinkedList;
import java.util.Random;

public class Demo {

	private static final int MINIMUM_STARTIN_MONEY_AND_CREDIT = 1000;

	public static void main(String[] args) {

		Random randomness = new Random();

		Bank bankOfBulgaria = new Bank("Bank of Bulgaria", "Sofia", 50000);

		Client[] $clients = new Client[10];

		for (int index = 0; index < $clients.length; index++) {
			$clients[index] = new Client(("Person" + index), ("Ulica" + index),
					((Math.random() * MINIMUM_STARTIN_MONEY_AND_CREDIT) + index), ((Math.random() * 100) * index),
					bankOfBulgaria, new LinkedList<Deposit>(), new LinkedList<Credit>());
		}

		for (int index = 0; index < $clients.length; index++) {
			if (randomness.nextBoolean()) {
				$clients[index].makeDeposit(
						($clients[index].getTotalMoney() * (0.8 + (Math.random() * (1 - 0.8) + 0.1))),
						new ShortDeposit());
			} else {
				$clients[index].makeDeposit(
						($clients[index].getTotalMoney() * (0.8 + (Math.random() * ((1 - 0.8) + 0.1)))),
						new LongDeposit());
			}
		}

		System.out.println("The bank has: " + bankOfBulgaria.getCurrentMoney() + " money total, and "
				+ bankOfBulgaria.getReserve() + " money as reserve");

		

		for (int index = 0; index < $clients.length; index++) {
			System.out.println($clients[index].getName() + " " + $clients[index].getAddress() + " "
					+ $clients[index].getMounthlySalary() + " " + $clients[index].getTotalMoney());
		}
	}
}
