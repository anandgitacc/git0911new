package org.employee;

//           ClassName
public class EmployeeDetails {

	// private	-> access specifier
	// void		-> return type of given method
	// empName	-> method name
	// ()		-> arguments place / parameter / input passing place
	// {}		-> block of the method / body
	
	//           method1
	private void empName() {
		// business logic
		System.out.println("Employee name: Anand");
	}
	
		//  method2
	private void empMobile() {
		System.out.println("Employee mobile: 8939278836");
	}
	
		//  main method
	public static void main(String[] args) {
		//             obj/ref
		EmployeeDetails emp = new EmployeeDetails();
		
		// method call
		emp.empName();
		emp.empMobile();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
