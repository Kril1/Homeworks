
public abstract class Credit implements iCredit {
	

	public abstract double caculateInterest(double moneyTaken);
	public abstract double totalMoneyToReturn(double moneyTaken);
	public abstract double mountlyPayment(int mounts, double moneyTaken);
}
