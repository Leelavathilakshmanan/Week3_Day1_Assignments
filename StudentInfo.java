package week3_Day1Assignment4;

/*Assignment 4:
==============

      Class  : Students
      Methods: getStudentInfo()

Description: 
Create multiple getStudentInfo() method by passing id argument alone, by id & name, by email & phoneNumber
*/
public class StudentInfo {

	public void getStudentInfo(int id) {
		System.out.println("The student ID:" + id);
		
	}
	public void getStudentInfo(int id,String name) {
		System.out.println("The Student ID:" + id);
		System.out.println("The Student Name:" + name);
		
	}
	public void getStudentInfo(String email,long phonenumber) {
		System.out.println("The Student E_Mail:" +  email);
		System.out.println("The Student Phonenumber:" + phonenumber);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudentInfo obj=new StudentInfo();
	
		obj.getStudentInfo(67);
		obj.getStudentInfo(67, "Leelavathi");
		obj.getStudentInfo("leelaraji93@gmail.com", 9944652972L);
	}
	

}
