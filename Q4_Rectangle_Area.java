public class Q4_Rectangle_Area {

	double  length, breadth;
	
	// Creating parameterized constructor.
	public Q4_Rectangle_Area(double length, double breadth){
		
		// Using this keyword.
		this.length = length;
		this.breadth = breadth;
	}
	
	// Creating user defined method.
	public double  getArea() {
		
		return length * breadth;
		
	}
	
	
	public static void main(String[] args) {
		
		// Creating constructor object.
		 Q4_Rectangle_Area Ra = new  Q4_Rectangle_Area(5, 4);

		 // Print area of rectangle.
		 System.out.println("Area of rectangle is : "+Ra.getArea());
	}

}

/* Output :
Area of rectangle is : 20.0
*/