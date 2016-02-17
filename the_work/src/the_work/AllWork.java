package the_work;

public class AllWork {

	
	private static final int ALL_THE_TASKS = 10;
	Task [] tasks = new Task[ALL_THE_TASKS];
	int freePlacesForTask = 10;
	int currentUnassignedTask;
	int freeTaskSpace =0;
	int taskWorkingOn = -1;
	
	
	AllWork(){
		
	}
	
	void addTask (Task newTask){
		
		if (freePlacesForTask ==0 || freeTaskSpace == tasks.length-1){
			
			System.out.println("No more space for tasks today!");
			
		}else{
		tasks[freeTaskSpace] = newTask;
		
		freeTaskSpace ++;
		freePlacesForTask --;
		
		}
	}
	
	boolean isAllWorkDone (){
		
		if (!(taskWorkingOn == freePlacesForTask)){
			return false;
		}
		
		return true;
	}
	
	Task getNextTask (){
		
		if (isAllWorkDone() == false){
			System.out.println("No tasks left");
			return tasks[freeTaskSpace];
		}else{
			taskWorkingOn ++;
			return tasks[taskWorkingOn];
		}
	}
	
}
