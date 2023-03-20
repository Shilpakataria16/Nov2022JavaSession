package SeleniumSessions;

public class Student {

	//give the studentName(String) as parameter
	//and return student marks(int)
	
	public int getStudentMarks(String studentName) {
		System.out.println("getting student marks for:" + studentName);
		if(studentName.equals("Neha")) {
			return 100;
		}
		else if(studentName.equals("Amit")) {
			return 90;
		}
		else {
			System.out.println("student is not found");
			return -1;
			
		}
			
	}
	
	public static void main(String[] args) {
		Student st = new Student();
		int m1 = st.getStudentMarks("Neha");
		System.out.println(m1);
		if(m1==-1)
			System.out.println("no need to print marksheet");
	}

}
