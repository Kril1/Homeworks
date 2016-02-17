public class Student {

	String name;
	String subject;
	double grade;
	int yearInCollage;
	int age;
	boolean isDegree;
	double money;
	
	Student (){
		this.grade = 4.0;
		this.yearInCollage = 1;
		this.isDegree = false;
		this.money = 0;
	}
	
	Student (String name, String subject, int age){
		this();
		
		if (name.equals(null)){
			System.out.println("Enter a valid name!");
		}else{
			this.name = name;
		}
		
		if (subject.equals(null)){
			System.out.println("Enter a valid subject");
		}else{
			this.subject = subject;
		}
		
		if (age <9 || age > 99){
			System.out.println("Please enter a valid age!");
		}else{
			this.age = age;
		}
	}
		
		public void hasGraduated (Student Gary){
			
			if (Gary.yearInCollage == 4 || Gary.yearInCollage> 4){
				Gary.isDegree = true;
			}else{
				Gary.isDegree = false;
			}
			
		}
		
		public void upYear (Student Gary){
			Gary.hasGraduated(Gary);
			
			if (Gary.isDegree == false){
				Gary.yearInCollage ++;
				System.out.println("The student is in year " + Gary.yearInCollage);
			}else{
				System.out.println("The student has graduated!");
			}
			
			Gary.hasGraduated(Gary); 
			
			if (Gary.isDegree == true){
				System.out.println("The student has graduated!");
			}
		}
		
		public double receiveScholarship (double min, double amount){
			
			if (!(min > 2 && min < 6.01)){
				System.out.println("Invalid minimum grade!");
				return this.money;
			}
			
			if (amount < 1){
				System.out.println("Invalid scholarship");
				return this.money;
			}
			
			if (this.age < 30 && this.grade >= min){
				this.money += amount;
			}
						
			return this.money;
		}
	}

