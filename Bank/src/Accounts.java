
public class Accounts {

	private String name;
	private int timeInMounths;
	private double totalMoney;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name != null && name.length() > 0) {
			this.name = name;
		} else {
			System.out.println("Enter a valid name");
		}
	}

	public int getTimeInMounths() {
		return timeInMounths;
	}

	public void setTimeInMounths(int timeInMounths) {
		if (timeInMounths > 1 && timeInMounths < 60) {
			this.timeInMounths = timeInMounths;
		} else {
			System.out.println("Enter a valid period");
		}
	}

	public double getTotalMoney() {
		return totalMoney;
	}

	public void setTotalMoney(double totalMoney) {

		if (!(Accounts.class.isInstance(Credit.class))) {
			if (totalMoney > 0){
			this.totalMoney = totalMoney;
			}else{
				System.out.println("Enter a valid number of money for a deposit!");
			}
		}else{
			this.totalMoney = totalMoney;
		}
	}
}
