class Current extends Account{
	public Current(String name, double balance){
		super(name, balance);
	}
	
	@Override
	boolean withdraw(double amount){
		if(getBalance() >= amount+10){
			if(amount <= 100){
				//this.balance -= amount;
				this.setBalance(this.getBalance() - amount - 10);
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