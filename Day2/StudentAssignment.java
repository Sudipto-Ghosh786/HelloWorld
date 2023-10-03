package Day2;

public class StudentAssignment {
	int studId = 550;
	static int studentCount = 10;
	char studType;
	String studName;

	public StudentAssignment() {
		studId = studId + studentCount;
		studentCount += 1;
		// TODO Auto-generated constructor stub
	}

	public StudentAssignment(char studType, String studFirstName, String studLastName) {
		studId = studId + studentCount;
		studentCount += 1;
		this.studType = studType;
		this.studName = studFirstName + studLastName;
	}

	void displayDetails(StudentAssignment s) {
		System.out.println("Student2 [studId=" + studId + ", studType=" + studType + ", studName=" + studName + "]");
	}

	static int getStudentCount() {
		return studentCount;
	}

	public static void main(String[] args) {
		StudentAssignment s = new StudentAssignment('D', "Bony", "Thomas");
		s.displayDetails(s);
		StudentAssignment s1 = new StudentAssignment('D', "Dinil", "Bose");
		s1.displayDetails(s1);
		StudentAssignment s2 = new StudentAssignment('D', "Bony", "Thomas");
		s2.displayDetails(s2);

	}
}
