package week3_Day1Assignment5;

//Justify the output??

public class StringPending {

	public static void main(String[] args) {

		String str3 = new String("Kutty");
		String str4 = new String("Kutty");

		if (str3 == str4) {
			System.out.println(" Same text");
		} else
			System.out.println("Diff text");

		System.out.println("*****");

	}

	// == will check the memory location of both strings and not the value of the string.
	//.equals() -->method is used to check the string values are equal or not
	//==  --> for string value checking its not suitable
}
