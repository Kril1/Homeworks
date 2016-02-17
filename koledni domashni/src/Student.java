
public class Student extends Person {

	double score;
	
	
	//Student() can't be made, beacuse it extends Person, and Person doesn't have Person ().
	//If Person had an empty constructor, then Student can have one too.
	
	
	
	Student(String name, int age, boolean isMale, double score) {
		super(name, age, isMale);
		
		if (!(score <2 || score >6)){
			this.score = score;
		}else{
			System.out.println("Enter valid score!");
		}
	}

	public void showStudentInfo(){
		this.showPersonInfo();
		System.out.println(this.name + "'s score is: " + this.score);
		
	}
}
