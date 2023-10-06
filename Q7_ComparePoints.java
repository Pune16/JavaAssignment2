//// Java program to create methods constructor and check if two objects are overlapping.
public class Q7_ComparePoints {

	int x, y;
	
	// creating parameterized constructor.
	public Q7_ComparePoints(int x, int y) {
		
	// using this keyword	
	this.x = x;
	this.y = y;
	
	}
	
	// creating method setX.
	public void setX(int x) {
		 
	System.out.println("value of x point is "+x);
	
	}
	
	// creating method setY.
	public void setY(int y) {
		
	System.out.println("value of y point is "+y);
	
	}
	
	public void setXY(int x, int y) {
		
	System.out.println("Value of x : "+x+" Value of y : "+y);
		
	}
	public static void main(String[] args) {
		
		Q7_ComparePoints p1 = new Q7_ComparePoints(1,2);
		Q7_ComparePoints p2 = new Q7_ComparePoints(4,1);
	
		// calling methods.
		p1.setX(1);
		p1.setY(2);
		p2.setXY(4, 1);
		
		// using if-else statement.
		if(p1 != p2) {
			System.out.println("Point is overlapping");
		} else {
			System.out.println("Error occured invalid point initialization");
		}
		
		
	}

}

/*
output:
value of x point is 1
value of y point is 2
Value of x : 4 Value of y : 1
Point is overlapping
*/