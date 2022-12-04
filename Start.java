class Start{
	public static void main(String[] args){
		//Person p1 = new Person(100, "Clerk", "B+");
		//Person p2 = new Student(200, "Bruce", "AB+", 3.12);
		//Person p3 = new Employee(300,"Diana","O+",12000);
		
		Person[] p = new Person[4];
		p[0] = new Student("Arthur", "O+", 2.89);
		p[1] = new Student("Bruce", "AB+", 3.33);
		p[2] = new Employee("Clerk", "B+", 13000);
		p[3] = new Employee("Diana", "A+", 26000);
		System.out.println("---------------------");
		
		int count = 0;
		while(count < p.length){
			p[count].showInfo();
			System.out.println();
			count++;
		}
		
		//p1.showInfo();
		//System.out.println();
		//p2.showInfo();
		//p3.showInfo();
		
		/*Person p = new Person();
		Person p1 = new Person(100, "Clerk", "B+");
		//Student s = new Student(90);
		Student s1 = new Student(200, "Bruce", "AB+", 3.12);
		Employee e1 = new Employee(300,"Diana","O+",12000);
		/*Employee e = new Employee();
		
		
		p.setId(100);
		
		s.setId(200);
		s.setCgpa(3.12);
		
		e.setId(300);
		e.setSalary(12000);
		//System.out.println(s1.getId());
		//System.out.println(s1.getCgpa());
		//System.out.println();
		//p1.showInfo();
		System.out.println();
		s1.showInfo();
		e1.showInfo();*/
	}
}