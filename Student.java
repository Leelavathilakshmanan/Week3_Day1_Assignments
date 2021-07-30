package week3_Day1Assignment2;

/*Assignment2:
=============
     Package   :org.college
     Class     :College
     Methods   :collegeName(),collegeCode(),collegeRank()

     Package   :org.department
     Class        :Department
     Methods   :deptName()
 
     Package   :org.student
     Class        :Student
     Methods   :studentName(),studentDept(),studentId()
  
Description:
create above 3 class and call all your class methods into the…the Student using multilevel inheritance.
*/
public class Student extends Department {

	public void studentName() {

		System.out.println("Student Name: Leelavathi");

	}

	public void studentDept() {

		System.out.println("Student Department: ECE");

	}

	public void studentId() {

		System.out.println("Student ID: AC00067");

	}

	public static void main(String[] args) {
		
		Student obj = new Student();
		obj.collegeName();
		obj.collegeRank();
		obj.collegeCode();
		obj.deptName();
		obj.studentName();
		obj.studentDept();
		obj.studentId();
		

	}

}
