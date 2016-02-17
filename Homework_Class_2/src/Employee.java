
public class Employee {

	private String name;
	private Task currentTask;
	private double hoursLeft;

	Employee(String name) {
		if (name != null) {
			this.name = name;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name != null) {
			this.name = name;
		}
	}

	public Task getCurrentTask() {
		return currentTask;
	}

	public void setCurrentTask(Task currentTask) {
		if (currentTask != null) {

			this.currentTask = currentTask;
		}
	}

	public double getHoursLeft() {
		return hoursLeft;
	}

	public void setHoursLeft(double hoursLeft) {
		if (!(hoursLeft < 0)) {
			this.hoursLeft = hoursLeft;
		}
	}
}
