package test_4;

import java.util.Scanner;

public class zadacha_16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
	double [] array = { -1.12, -2.43, 3.1, 4.2, 0, 6.4, - 7.5, 8.6, 9.1, -4};
	
	for (int index = 0; index < array.length; index ++){
		System.out.print(array[index] + ", ");	
		}
	System.out.println("");
	for (int index = 0; index < array.length; index ++){
		
		if (array[index] < -0.231){
			array[index] = ((index+1) * (index+1)) + 41.25;
		}else {
			array[index] *= (index +1);
		}
		System.out.print(array[index] + ", ");	
	}
	
	int howManyNumbers = 0;
	float avarageValue = 0;

	for (int index = 0; index < array.length; index ++){
		if (array[index] !=0){
			howManyNumbers ++;
			avarageValue += array[index];
		}
	}
	avarageValue = avarageValue / howManyNumbers;
	System.out.println("");
	System.out.print("The avarage value of the array is:" + avarageValue);

}
}