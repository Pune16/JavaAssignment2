// Q3. Create a class which contains 2 instance variables a,b.write instance methods for finding the sum and difference of 2 variables.


public class Q3_InstanceVariable {
	int a; //instance variable
	int b; //instance variable
	
	void add(int a,int b)  //instance method
	{ 
		System.out.println("Addition is : "+ (a + b));
		
	}
	
    void diff(int a,int b) //instance method
	{
		System.out.println("Difference is : "+ (a - b));
	}
    
 	public static void main(String[] args) {
		// TODO Auto-generated method stub

 		Q3_InstanceVariable Addition = new Q3_InstanceVariable();
		
 		Addition.add(20,10);
		Addition.diff(40,20);
		
		
	}

	

}

/*
output
Addition is : 30
Difference is : 20
*/