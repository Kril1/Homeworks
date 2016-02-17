
public class Computer {

	int year;
	double price;
	boolean isNotebook;
	double hardDiskMemory;
	double freeMemory;
	public String operationSystem;
	
	Computer(){
		this.isNotebook = false;
		this.operationSystem = "WinXP";
	}
	
	Computer(int year, double price, double hardDiskMemory, double freeMemory){
		this();
		if (year < 200){
			this.year = 2000;
		}else{
			this.year = year;
		}
		
		if (price < 1){
			this.price = 1000;
		}else{
			this.price = price;
		}
		
		if (hardDiskMemory <50){
			this.hardDiskMemory = 50;
		}else{
			this.hardDiskMemory = hardDiskMemory;
		}
		
		
		if (freeMemory > hardDiskMemory){
			this.freeMemory = hardDiskMemory;
		}else{
			this.freeMemory = freeMemory;
		}
	}
	
	Computer(int year, double price, boolean isNotebook, double hardDiskMemory, double freeMemory, String operationSystem){
		if (year < 200){
			this.year = 2000;
		}else{
			this.year = year;
		}
		
		if (price < 1){
			this.price = 1000;
		}else{
			this.price = price;
		}
		
		this.isNotebook = isNotebook;
		
		if (hardDiskMemory <50){
			this.hardDiskMemory = 50;
		}else{
			this.hardDiskMemory = hardDiskMemory;
		}
		
		if (freeMemory > hardDiskMemory){
			this.freeMemory = hardDiskMemory;
		}else{
			this.freeMemory = freeMemory;
		}
	
		if (operationSystem != null){
			this.operationSystem = operationSystem;
		}else{
			this.operationSystem = "WinXP";
		}
	}
	
	public int comparePrice (Computer zaSravnenie){
		
		if (zaSravnenie.price < 1 || this.price <1){
			System.out.println("There are not free computers!");
			return -5;
		}
		
		if (this.price > zaSravnenie.price){
			return -1;
		}
		if (this.price < zaSravnenie.price){
			return 1;
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
