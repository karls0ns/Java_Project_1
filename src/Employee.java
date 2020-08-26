
class Employee extends Human{

	private double Salary;
	public Employee(String Name, String Surname, double Salary){
		super(Name, Surname);
		this.Salary = Salary;
	}
	

	
	public Employee(Employee E){
		super(E);
		this.Salary = E.Salary;
		
	}
	public double getSalary(){
		return Salary;		
	}
	public void setSalary(double Salary){
		this.Salary = Salary;
	}
	@Override
	public String toString() {
		return super.toString() + " Alga: " +Salary;
	}
}
