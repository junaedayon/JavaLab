interface IAccount{
	void transfer(Account receiver, double amount);
}

abstract class Account implements IAccount{//final class
	private static int serialNo = 1;
	private String id;
	private String name;
	private double balance;
	
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
	
	public double getBalance(){
		return this.balance;
	}
	
	public void setBalance(double balance){
		this.balance = balance;
	}
	
	Account(String name, double balance){
		//int temp = serialNo++;
		this.id = "A-" + (serialNo++);
		this.name = name;
		this.balance = balance;
	}
	
	void deposit(double amount){
		//this.balance = this.balance + amount;
		this.balance += amount;
		System.out.println("New Balance: ");
		this.showInfo();
	}
	
	abstract boolean withdraw(double amount);
	
	public void transfer(Account receiver, double amount){
		boolean info = this.withdraw(amount);
		if(info == true){
			receiver.deposit(amount);
			System.out.println(amount + " taka has transfered from " + this.getName() + " to " + receiver.getName() + ".");
		}
		else{
			System.out.println("Invalid Withdraw");
		}
		
	}
	
	void showInfo(){//final method 
		System.out.println("Id: " + this.id);
		System.out.println("Name: " + this.name);
		System.out.println("Balance: " + this.balance);
	}
	
}





































