import java.util.Queue;

public class Scheduler {

	Queue <Task> tasksQueue;
	
	Scheduler (Queue <Task> taskQue){
		this.tasksQueue = taskQue;
	}
	
	public void push (String nameOfTask){
		
		if (nameOfTask != null && nameOfTask.length() > 0){
		 tasksQueue.offer(new WorkTask(nameOfTask));
		}else{
			System.out.println("Enter a valid name");
		}
	}
	
	public void main (){

		while (!tasksQueue.isEmpty()) {
			int taskWeAreOn =1;
			System.out.println("Starting work on task: " + taskWeAreOn);
			tasksQueue.poll().doWork();
			System.out.println("Work finished!");

		}
	}
}
