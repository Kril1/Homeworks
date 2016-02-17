
public class StudentGrop {

	String groupSubject;
	Student[] students;
	int freePlaes;
	int firstFreePlase = 0;

	StudentGrop() {
		this.students = new Student[5];
		this.freePlaes = 5;
	}

	StudentGrop(String subject) {
		this();

		if (subject != null) {
			this.groupSubject = subject;
		}
	}

	void addStudent(Student Gary) {

		if (!(Gary.name.equals(null))) {
			System.out.println("No such student!");
			return;
		}

		if (!(Gary.subject.equals(this.groupSubject))) {
			System.out.println("This student isn't in this group!");
			return;
		}

		if (this.freePlaes < 1 && this.firstFreePlase > 4) {
			System.out.println("There is no plase for this student in this group!");
			return;
		} else {
			this.students[firstFreePlase] = Gary;
			this.firstFreePlase--;
			this.firstFreePlase++;
		}
	}

	void emptyGroup() {

		this.students = new Student[5];
		this.freePlaes = 5;
		this.firstFreePlase = 0;
	}

	void theBestStudent() {

		double temp = 0;
		int tempIndex = 0;

		if (this.students[0].equals(null)) {
			System.out.println("There are no students in that group!");
			return;
		}

		for (int index = 0; index < this.students.length; index++) {

			if (this.students[index].name.equals(null)) {
				break;
			}
			if (this.students[index].grade > temp) {
				temp = this.students[index].grade;
				tempIndex = index;
			}
		}

		System.out.println("The student with best grade is: " + this.students[tempIndex].name);

		return;
	}

	void printStdentsInGroup() {

		if (this.students[0].equals(null)) {
			System.out.println("There are no students in that group!");
			return;
		}

		for (int index = 0; index < this.students.length; index++) {
			if (this.students[index].equals(null)) {
				return;
			}
			System.out.println(this.students[index].name + " " + this.students[index].grade + " "
					+ this.students[index].yearInCollage + " " + this.students[index].age + " "
					+ this.students[index].money + " " + this.students[index].isDegree);
		}
		return;

	}

}
