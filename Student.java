class Student extends Person{
	private double cgpa;
	
	public double getCgpa(){
		return this.cgpa;
	}
	
	public void setCgpa(double cgpa){
		this.cgpa = cgpa;
	}
	
	Student(){
		super(45);
		System.out.println("S-D");
	}
	
	Student(int a){
		super(a);
		System.out.println("S-ND " + a);
	}
	
	Student(String name, String bloodGroup, double cgpa){
		super(name,bloodGroup);
		System.out.println("S-NDO");
		this.cgpa = cgpa;
	}
	
	@Override
	void showInfo(){
		super.showInfo();
		System.out.println("Cgpa: " + cgpa + "\n"); 
	}
}















