
public abstract class Credit extends Accounts implements iCredit {
	
	public abstract double caculateInterest(double moneyTaken);
	public abstract double totalMoneyToReturn(double moneyTaken);
	public abstract double mountlyPayment(int mounts, double moneyTaken);
}
