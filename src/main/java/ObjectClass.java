abstract class Employee {
	
	static int totalEmp = 100;
	String firstName;
	String lastName;
	double baseSalary;
	double calculatedSalary ; 
	String empType;
	
	public static enum employementTypeEnum{
		FULLTIME,
		PARTTIME
	};
	
	abstract double calculateSalary();
	
}

class FulltimeEmployee extends Employee{
	
	@Override
	double calculateSalary() {
		calculatedSalary = baseSalary * 1.2;
		return calculatedSalary;
	}
	
}

class ParttimeEmployee extends Employee{
 
  	
	@Override
	double calculateSalary() {
		// TODO Auto-generated method stub
				calculatedSalary = baseSalary * 0.8;
				return calculatedSalary;
	}	

}

class ObjectClass{
	public static void main(String[] args) {
		System.out.println("Total employees are " + Employee.totalEmp);
		
		System.out.println("Full time employee details is as below:");
		Employee fulltimeObj = new FulltimeEmployee();
		fulltimeObj.firstName = "Sweny";
		fulltimeObj.lastName = "Patel";
		fulltimeObj.baseSalary = 95000.0;
		fulltimeObj.empType = Employee.employementTypeEnum.FULLTIME.toString();
		fulltimeObj.calculatedSalary = fulltimeObj.calculateSalary();
	
		System.out.println
		("FirstName " + fulltimeObj.firstName + " ,LastName is " + fulltimeObj.lastName + " , "
				+ "employement type is " +  fulltimeObj.empType + " and salary is " + 
				fulltimeObj.calculatedSalary);
		
		System.out.println("Part time employee details is as below:");
		Employee parttimeObj = new ParttimeEmployee();
		parttimeObj.firstName = "Shanvi";
		parttimeObj.lastName = "Patel";
		parttimeObj.baseSalary = 50000.0;
		parttimeObj.empType = Employee.employementTypeEnum.PARTTIME.toString();
		parttimeObj.calculatedSalary = parttimeObj.calculateSalary();
	
		System.out.println
		("FirstName " + parttimeObj.firstName + " ,LastName is " + parttimeObj.lastName + " , "
				+ "employement type is " +  parttimeObj.empType + " and salary is " + 
				parttimeObj.calculatedSalary);
	}
}