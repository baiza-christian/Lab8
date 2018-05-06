
public class EmployeeFactory {

	public Employee getEmployee(String employeeType) {
		
			 if(employeeType == null){
			 return null;
			 }
			 if(employeeType.equalsIgnoreCase("FACULTY"){
			 return new Circle(); //change me

			 } else if(shapeType.equalsIgnoreCase("STAFF")){
			 return new Rectangle();

			 } else if(shapeType.equalsIgnoreCase("PARRTIME")){
			 return new Square();
			 }

			 return null;
			 }
		
	}

}
