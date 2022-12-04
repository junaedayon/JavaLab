class Employee extends Person{
	private double salary;
	
	public double getSalary(){
		return this.salary;
	}
	
	public void setSalary(double salary){
		this.salary = salary;
	}
	
	Employee(String name, String bloodGroup, double salary){
		super(name, bloodGroup);
		this.salary  = salary;
	}
		
	@Override
	void showInfo(){
		super.showInfo();
		System.out.println("Salary: " + salary + "\n"); 
	}
}