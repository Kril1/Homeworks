import java.util.LinkedList;
import java.util.Queue;

public class Demo {

	
	public static void main(String[] args) {
		
		
		
		Scheduler pesho = new Scheduler(new LinkedList<Task> ());
		
		pesho.push("Task 1");
		pesho.push("Task 2");
		pesho.push("Task 3");
		pesho.push("Task 4");
		pesho.push("Task 5");
		
		for (int index = 0; index < 5; index++){
			pesho.main();
		}
	}
}
