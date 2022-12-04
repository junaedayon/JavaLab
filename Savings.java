class Savings extends Account{
	//final int r = 100;
	public Savings(String name, double balance){
		super(name, balance);
	}	
	
	//@Override
	//void showInfo(){
	//	System.out.println("Id: " + this.getId());
	//	System.out.println("Name: " + super.getName());
		//r++;
	//}
	
	@Override
	boolean withdraw(double amount){
		if(getBalance() >= amount){
			if(amount <= 500){
				//this.balance -= amount;
				this.setBalance(this.getBalance() - amount);
				System.out.println("New Balance: ");
				this.showInfo();
				return true;
			}
			else{
				System.out.println("\nToo Big amount to withdraw");
			}
		}
		else{
			System.out.println("\nInsufficient Balance");
		}

		return false;	
	}
}