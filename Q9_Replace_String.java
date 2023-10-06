// Java program to replace string in java1 with java2.

public class Q9_Replace_String {

	public static void main(String[] args) {
	
		String string1 = "Hello World";
		String string2 = "Java";
		
		System.out.println("Original string : "+string1);
		
		// using replace method 
		System.out.println("Replaced string : "+string1.replace("World", string2));

	}

}

/*
output :
Original string : Hello World
Replaced string : Hello Java
*/