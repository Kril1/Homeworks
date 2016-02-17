
public class Gsm {

	final int PHONE_NUMBER_LENGTH = 9;
	String model;
	boolean hasSimCard;
	int[] simMobileNumber;
	int outgoingCallsDuration;
	int[] lastIncomingCall;
	int[] lastOutgoingCall;

	public void insertSimCard(int[] simCardNumber) {
		if (!(simCardNumber[0] == 0 && simCardNumber[1] == 8)){
			System.out.println("Enter a valid number");
			return;
		}
		if(simCardNumber.length!=PHONE_NUMBER_LENGTH){
			System.out.println("Enter a valid number");
			return;
		}
		hasSimCard = true;
		this.simMobileNumber = simCardNumber;
		return;
	
}
	public void removeSimCard(){

		hasSimCard = false;
		this.simMobileNumber = new int[PHONE_NUMBER_LENGTH] ;
		this.lastIncomingCall = new int[PHONE_NUMBER_LENGTH] ;
		this.lastOutgoingCall = new int[PHONE_NUMBER_LENGTH] ;
	}
	public void makesCalls (Gsm receiver, int duration){
		
		if (duration <= 0){
			System.out.println("Please enter a valid call duration");
			return;
		}
		if(this.hasSimCard == false || receiver.hasSimCard == false){
			System.out.println("Can't make a call to a GSM without a sim card.");
			return;
		}
		if (this.simMobileNumber == receiver.simMobileNumber){
			System.out.println("Can't call yourself, get some friends.");
			return;
		}
	
		this.lastOutgoingCall = receiver.simMobileNumber;
		receiver.lastIncomingCall = this.simMobileNumber;
		this.outgoingCallsDuration += duration;
	}

	public double getSumForCall (){
		
		double price = this.outgoingCallsDuration * Call.priceForAMinute;
		
		return price;
	}
	
	public void printInfoForTheLastOutgoingCall(){
		if (this.hasSimCard == false){
			System.out.println("You don't have a SIM card and can't have a last call.");
			return;
		}
		if (this.lastOutgoingCall[1] != 8){
				System.out.println("No outgoing calls were made.");
				return;
			}
		System.out.println(this.lastOutgoingCall);
		return;
		}
	public void printInfoForTheLastIncomingCall(){
		if (this.hasSimCard == false){
			System.out.println("You don't have a SIM card and can't have a last call.");
			return;
		}
		if (this.lastIncomingCall[1] != 8){
				System.out.println("No incoming calls were made.");
				return;
			}
		System.out.println(this.lastIncomingCall);
		return;
		
	}
}
