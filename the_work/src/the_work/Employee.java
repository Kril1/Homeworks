package the_work;

public class Employee{


	private static final int WORKING_HOURS_IN_A_DAY = 8;
	private String name;
	private Task currentTask;
	private int hoursLeft;
	private AllWork allwork;
	
	Employee (String name){
		if (name == null){
			System.out.println("Enter a valid emploee");
		}else{
			this.name = name;
		}
	}
	
	void work(){
		Task currentTask = new Task();
		currentTask = allwork.getNextTask();
		
		if (currentTask.getWorkingHours() > hoursLeft){
			int hoursLeftForNextDey = currentTask.getWorkingHours() -hoursLeft;
			startWorkingDay();
			hoursLeft -= hoursLeftForNextDey;
		}
		if (currentTask.getWorkingHours() < hoursLeft){
			hoursLeft -= currentTask.getWorkingHours();
			work();
		}
	}
	
	void startWorkingDay (){
		
		this.hoursLeft = WORKING_HOURS_IN_A_DAY;		
		
	}

	public String getName() {
		return name;
	}

	public Task getCurrentTask() {
		return currentTask;
	}

	public void setCurrentTask(Task currentTask) {
		this.currentTask = currentTask;
	}

	public int getHoursLeft() {
		return hoursLeft;
	}

	public void setHoursLeft(int hoursLeft) {
		this.hoursLeft = hoursLeft;
	}

	public AllWork getAllwork() {
		return allwork;
	}

	public void setAllwork(AllWork allwork) {
		this.allwork = allwork;
	}
	
	

}
