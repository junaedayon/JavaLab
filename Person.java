abstract class Person{
	private static int serialNo = 1;
	private String id;
	private String name;
	private String bloodGroup;
	
	public String getId(){
		return this.id;
	}
	
	public void setId(String id){
		this.id = id;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getBloodGroup(){
		return this.bloodGroup;
	}
	
	public void setBloodGroup(String bloodGroup){
		this.bloodGroup = bloodGroup;
	}
	
	Person(){
		System.out.println("P-D");
	}
	
	Person(int y){
		System.out.println("P-ND " + y);
	}
	
	Person(String name, String bloodGroup){
		//System.out.println("P-NDO");
		int temp = serialNo++;
		this.id = "P-" + temp;
		this.name = name;
		this.bloodGroup = bloodGroup;
	}
	
	void showInfo(){
		System.out.println("Id: " + id);
		System.out.println("Name: " + name);
		System.out.println("BloodGroup: " + bloodGroup);
	}
	

}



















