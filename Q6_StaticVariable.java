public class Q6_StaticVariable {

	// initializing static variable.
	static int var = 10;
	
	Q6_StaticVariable(){
	
	// incrementing static value.	
	var++;
	
	// Print variable.
	System.out.println(var);
		
	}
	
	public static void main(String[] args) {
	
		// creating constructor objects single copy is shared by all objects.
		Q6_StaticVariable sv1 = new Q6_StaticVariable();
		Q6_StaticVariable sv2 = new Q6_StaticVariable();
		Q6_StaticVariable sv3 = new Q6_StaticVariable();
		
			
		
	}

}

/* output :
11
12
13
*/