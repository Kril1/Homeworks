public class Computers {

	public static void main(String[] args) {

	Computer lenobo = new Computer(2014, 0, 900, 850);
		
	Computer Acer = new Computer(2013, 1200, true, 700, 500, "WinXP");
	
		int betterPeice = lenobo.comparePrice(Acer);
		
		System.out.println(betterPeice);
	
	
	}
}