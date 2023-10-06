//Q1 . create a class named 'employee' with string name and int id.create two objects with id and name initialized and print the details

//create class
public class Q1_EmployeeDetails { 
	String name;
	int id;
	
	Q1_EmployeeDetails(String Name,int Id)
	{
		name=Name;
		id=Id;
	}
	
	//method to display the Employee Details
	public void display()
	{
		
		System.out.println("Employee name:" + name);
		System.out.println("Employee Id:" + id);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Q1_EmployeeDetails E1=new Q1_EmployeeDetails("Madhuri",101); //Initialize the object with name and id
		Q1_EmployeeDetails E2=new Q1_EmployeeDetails("Mansi",102);
		
		E1.display();  //display the employee Details
		E2.display();
		
	}

	

}

/* Output :
 * 
 *  
Employee name:Madhuri
Employee Id:101
Employee name:Mansi
Employee Id:102
 */

