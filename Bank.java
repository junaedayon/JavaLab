class Bank{
	private static Account[] aList = new Account[200];
	private static int count = 0;
	
	public void addAccount(Account acc){
		aList[count] = acc;
		count++;
	}
	
	public static void showAllAccounts(){
		int index = 0;
		while(index < count){
			if(aList[index] != null){
				aList[index].showInfo();
				System.out.println();
			}				
			
			index++;
		}
	}
	
	public static int searchAccount(String key){
		boolean flag = false;
		int index = 0;
		while(index < count){
			if(key.equals(aList[index].getId())){
				System.out.println("Hurrah!!!! I got the data");
				aList[index].showInfo();
				flag = true;
				//break;
				return index;
			}
			//else{System.out.println("Bravo!!!! No data found still printing");}
			index++;
		}
		
		if(flag == false)
			System.out.println("Bravo!!!! No data found");
		return -1;
	}

	public static void removeAccount(String key){
		int indexValue = searchAccount(key);
		if(indexValue >= 0 ){
			//delete operation
			aList[indexValue] = null;
			System.out.println("Data has been deleted\n\nNew List\n");
			showAllAccounts();
		}			
	}
	
	public void options(){
		/*aList[0].deposit(500);
		aList[1].deposit(50);
		aList[2].withdraw(600);
		aList[3].withdraw(100);*/
		aList[0].transfer(aList[2], 300);
	}
}
















