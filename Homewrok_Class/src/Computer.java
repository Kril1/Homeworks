
public class Computer {

	int year;
	double price;
	boolean isNotebook;
	double hardDiskMemory;
	double freeMemory;
	String operationSystem;
	
	Computer(){
		isNotebook = false;
		operationSystem = "WinXP";
	}
	
	Computer(int year, double price, double hardDiskMemory, double freeMemory){
		this();
		this.year = year;
		this.price = price;
		this.hardDiskMemory= hardDiskMemory;
		this.freeMemory = freeMemory;
	}
	
	Computer(int year, double price, boolean isNotebook, double hardDiskMemory, double freeMemory, String operationSystem){
		this.year = year;
		this.price = price;
		this.isNotebook = isNotebook;
		this.hardDiskMemory= hardDiskMemory;
		this.freeMemory = freeMemory;
		this.operationSystem = operationSystem;
	}
	
	public int comperePrice (Computer zaSravnenie){
		
		if (zaSravnenie.price < 1 || this.price <1){
			System.out.println("There are not free computers!");
			return -5;
		}
		
		if (this.price > zaSravnenie.price){
			return -1;
		}
		if (this.price < zaSravnenie.price){
			return 0;
		}
		
		if (this.price == zaSravnenie.price){
			return 0;
		}
		
		return -5;
	}

	public String changeOperationSystem(String newOS) {

		this.operationSystem=newOS;
		
		return operationSystem;
	}

	public void useMemory (int memoryUsed){
		if (this.freeMemory - memoryUsed >= 0){
			this.freeMemory -= memoryUsed;
		}else{
			System.out.println("Not enough free memory!");
		}
		
	}
}
