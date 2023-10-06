//// Java program to demonstrate  methods in string and string builder classes
public class Q8_StringBuilder {

	public static void main(String[] args) {
		
		String str = "Hello Madhuri!";
		String str1 = "Hello World!";
		
		// using length method.
		System.out.println("Length of string is : "+str.length());
		
		// using contains method.
		System.out.println("kunal is present in following string : "+str+" = "+str.contains("Kunal"));
		
		// using chartAt method.
		System.out.println("Character at position 6th in following string : "+str.charAt(6));
		
		// using equals method.
		System.out.println("Is strings are equal : "+str.equals(str1));
		
		// using compareTo method.
		System.out.println("Compare string difference : "+str.compareTo(str1));
		
		// using hashCode method.
		System.out.println("Hash code of string str : "+str.hashCode()+" Hash code of string str1 : "+str1.hashCode());
	
		// using toLowerCase method.
		System.out.println("Make string to lower case : "+str1.toLowerCase());
		
		// using toUppercase method.
		System.out.println("Make string to upper case : "+str.toUpperCase());
	
		// Initiate String Builder Class.
		
		StringBuilder sb = new StringBuilder("Hello");
		
		// using append method.
		System.out.println("Appending ',' to string : "+sb.append(", "));
		
		// using capacity method.
		System.out.println("Find string capacity : "+sb.capacity());
		
		// using append method to insert name in string.
		System.out.println("Append name to string : "+sb.append("Madhuri"));
		
		// using indexOf method.
		System.out.println("Check indexOf string Kunal : "+sb.indexOf("Madhuri"));
		
		// using delete method.
		System.out.println("Delete Hello in string : "+sb.delete(0, 7));
		
		// using reverse method.
		System.out.println("Reverse string : "+sb.reverse());
	}

}

/*
output :
Length of string is : 14
Madhuri is present in following string : Hello Madhuri! = false
Character at position 6th in following string : M
Is strings are equal : false
Compare string difference : -10
Hash code of string str : 510747931 Hash code of string str1 : -969099747
Make string to lower case : hello world!
Make string to upper case : HELLO MADHURI!
Appending ',' to string : Hello, 
Find string capacity : 21
Append name to string : Hello, Madhuri
Check indexOf string Kunal : 7
Delete Hello in string : Madhuri
Reverse string : iruhdaM
*/