public class Person {

	String name;
	int age;
	boolean isMale;
	
	Person (String name, int age, boolean isMale){
		if (name != null){
			this.name = name;
		}else{
			System.out.println("enter a name!");
		}
		
		if (!(age <0 && age > 125)){
			this.age = age;
		}else{
			System.out.println("Enter a valid age!");
		}
		this.isMale = isMale;
	}
	
	public void  showPersonInfo (){
		System.out.println("The person's name is: " + this.name);
		System.out.println("The age of " + this.name + " is: " + this.age);
		if (this.isMale == true){
			System.out.println(this.name + " is Male");
		}else{
			System.out.println(this.name + " is Female");
		}
	}
	
}