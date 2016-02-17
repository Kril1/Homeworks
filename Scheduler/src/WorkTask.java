
public class WorkTask implements Task {

	String name;

	WorkTask(String name) {
		this.name = name;
	}

	@Override
	public void doWork() {
		System.out.println("Doing work on " + this.name);

	}

}
