package Deliverer;

public class Product {

	private static final int MAXIMUM_PRICE = 15;
	private static final int MINIMUM_PRICE = 5;
	private double price = Math.random() *16 ;
	private String name;
	
	Product (String name){
		setName(name);
		
		if (this.price <MINIMUM_PRICE || this.price > MAXIMUM_PRICE){
			do {
				this.price= Math.random() *MAXIMUM_PRICE ;
			
			}while (this.price <MINIMUM_PRICE || this.price > MAXIMUM_PRICE);
		}else{
			System.out.println("Enter a valid price");
		}
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name != null){
			this.name = name;
		}else{
			System.out.println("Enter a valid name");
		}
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}		
}
 