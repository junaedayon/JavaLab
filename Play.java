class Play{
	public static void main(String[] args){
		//Account[] accountList = new Account[3];
		//Account a1 = new Account("Bruce", 5000);
		//accountList[1] = 
		//Account a2 = new Account("Clerk", 4500);
		//accountList[2] = new Account("Diana", 10000);
		
		/*int index = 0;
		while(index < accountList.length){
			accountList[index].showInfo();
			System.out.println();
			index++;
		}*/
		//accountList[0] = new Savings("Bruce", 400);
		//accountList[1] = new Current("Clerk", 100);
		//accountList[0].deposit(400);
		//accountList[1].deposit(3400);
		//accountList[0].withdraw(450);
		//accountList[1].withdraw(100);
		
		//Account a = new Savings("Arthur", 1200);
		//a.showInfo();
		
		Bank b = new Bank();
		b.addAccount(new Savings("Bruce", 200));
		b.addAccount(new Current("Clerk", 100));
		b.addAccount(new Savings("Diana", 1000));
		b.addAccount(new Current("Arthur", 15000));
		Bank.showAllAccounts();//b.showAllAccounts();
		//Bank.searchAccount("A-2");//b.searchAccount("A-20");
		//Bank.removeAccount("A-2");//b.removeAccount("A-2");*/
		b.options();
	}
}

/*Calculator c = new Calculator();
		//Parent p;// = new Parent();
		//Child c = new Child();		
		//p = c;
		
		//p.methodA();
		//c.methodA();
		
		//Parent p1 = new Child();
		//p1.methodA();
		//p1.methodB();
		//p1.methodC();
		c.addition(3,4);
		c.addition(3,4,5);
		c.addition("hello",4);
		c.addition("abc","xyz",4);
		c.addition(3,"world",4);
		
		/*int[] ax = {3,4,5,6,7};//new int[5];
		
		int[][] bx = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};//new int[3][4];
		//bx[0][1] = 
		
		for(int r = 0; r<3; r++){
			for(int c = 0; c<4; c++){
				System.out.print(bx[r][c] + " ");
			}
			System.out.println();
		}*/