package week3_Day1Assignment7;

//1. Write a Java program to get the character at the given index within the String. 
//String text = Java Exercise 
//Index for character E and s   

//2.Write a Java program to compare a given string to another string, ignoring case considerations.
//
//String 1="I am Learning Java" 
//String 2="I am learning java?   
//**  Explore with == operator
//**               equals
//**               equalsignorecase                                      
//=============================================================================
public class GetCharactersInIndex {

	public static void main(String[] args) {
		

		String text ="JAVA Exercise";
	
		System.out.println("Index of character E : "+text.indexOf('E'));
		System.out.println("Index of character s : "+text.indexOf('s'));
		
		String text2="I am Learning Java?" ;
		String text3="I am learning java?";
		
		if(text2==text3)
		{
			System.out.println(" Same text ");
		}
		else
		{
			System.out.println("Different text:Output of ==");
		}
		if(text2.equals(text3))
		{
			System.out.println("Same Text ");
		}
		else
		{
			System.out.println("Different text:.equals() due to case sensitive");
		}
		if(text2.equalsIgnoreCase(text3))
		{
			
			System.out.println("Same Text : .equalsIgnoreCase()");
		}
	
		/*
		 * 3.Write a Java program to replace a specified character with another
		 * character and add # to the given string.
		 * 
		 * String sentence = "I am working with Java8" replace 8 to 11 Print the
		 * characters from 5 to 14
		 */
		
		String sentence = "I am working with Java8";
	
		System.out.println("Replace the string value 8 to 11 : "+sentence.replace("8", "11"));
		System.out.println("The characters from 5 to 14 : "+sentence.substring(5, 14));
		
	}

}
