
public class ActualComputers {
	public static void main(String[] args) {
		Computer lenovo = new Computer();
		lenovo.isNotebook = true;
		lenovo.hardDiskMemory = 500;
		lenovo.operationSystem = "win7";
		lenovo.price = 700;
		lenovo.year = 2005;
		lenovo.freeMemory = 500;

		Computer pravec = new Computer();
		pravec.isNotebook = false;
		pravec.hardDiskMemory = 200;
		pravec.operationSystem = "win95";
		pravec.price = 100;
		pravec.year = 1997;
		pravec.freeMemory = 100;

		pravec.changeOperationSystem("winXP");

		lenovo.useMemory(100);

		System.out.println(pravec.isNotebook + " " + pravec.hardDiskMemory + " " + pravec.operationSystem + " "
				+ pravec.price + " " + pravec.year + " " + pravec.freeMemory);
		
		System.out.println(lenovo.isNotebook + " " + lenovo.hardDiskMemory + " " + lenovo.operationSystem + " "
				+ lenovo.price + " " + lenovo.year + " " + lenovo.freeMemory);
			
	}
}
