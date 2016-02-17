
public class Employee extends Person {

	private static final double OVER_TIME_RATE = 1.5;
	private static final int WORKING_HOURS_A_DAY = 8;
	double daySalary;

	Employee(String name, int age, boolean isMale, double daySalary) {
		super(name, age, isMale);

		if (!(this.age < 18)) {
			if (!(daySalary < 1)) {
				this.daySalary = daySalary;
			} else {
				System.out.println("Give more money!");
			}
		} else {
			this.daySalary = 0;
		}
	}

	public void showEmployeeInfo() {
		this.showPersonInfo();
		System.out.println(this.name + "'s salary is: " + this.daySalary);
	}

	public double calculateOvertime(double hours) {

		double overTimeMoney = (((daySalary / WORKING_HOURS_A_DAY) * OVER_TIME_RATE) * hours);
		
		return overTimeMoney;

	}

}
