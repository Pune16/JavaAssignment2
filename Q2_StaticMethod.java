
//create a class which contains static methods for finding the sum and difference of two


public class Q2_StaticMethod {
         //Static method
	    public static int add(int a, int b) {
	        return a + b;
	    }

	    //Static method
	    public static int differene(int a, int b) {
	        return a - b;
	    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Q2_StaticMethod result = new Q2_StaticMethod();
		System.out.println("Addition is : " +result.add(10, 20));
		System.out.println("Substraction is : " +result.differene(20,10));
		
	}

}

/*
Output:
Addition is : 30
Substraction is : 10
*/