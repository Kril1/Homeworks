
public class Demo {
	public static void main(String[] args) {

		Person[] allThePeople = { new Person("Garry", 28, true), new Person("Martina", 13, false),
				new Student("Jess", 15, false, 4.56), new Student("Tom", 17, true, 3.33),
				new Employee("Serra", 44, false, 75.75), new Employee("Jhon", 50, true, 101), null, null, null, null };

		for (int index = 0; index <= allThePeople.length; index++) {
			if (allThePeople[index] != null) {
				if (allThePeople[index] instanceof Student) {
					((Student) allThePeople[index]).showStudentInfo();
					continue;
				}
				if (allThePeople[index] instanceof Person) {
					allThePeople[index].showPersonInfo();
					continue;
				}
				if (allThePeople[index] instanceof Employee) {
					((Employee) allThePeople[index]).showEmployeeInfo();
					continue;
				}
			} else {
				break;
			}
		}
		for (int index = 0; index <= allThePeople.length; index++) {
			if (allThePeople[index] != null) {
				if (allThePeople[index] instanceof Employee) {
					System.out.println(((Employee) allThePeople[index]).calculateOvertime(2));
				}
			} else {
				break;
			}
		}
	}
}
