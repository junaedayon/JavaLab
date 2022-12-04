class ExceptionExample{
	public static void main (String[] args) {
		int a=7;
		int b=1;//0;
		System.out.println("Program start running");
		try{
			System.out.println(a/b);
			System.out.println("No exception");
						
			System.out.println("Program still running");
			
			System.out.println("Creating Array");
			int[] ax = new int[4];
			ax[0] = 10;
			ax[1] = 20;
			ax[2] = 30;
			ax[3] = 40;
			System.out.println("Showing Array");
			for(int c = 0;c < 4;c++){
				System.out.print(ax[c] + " ");
			}
			
			System.out.println("\nProgram still running");
			
			
			String[] bx = new String[3];
			bx[0] = "abc";
			bx[1] = "20";//null
			bx[2] = "xyzw";
			System.out.println("Showing String Array");
			for(int c = 0;c < bx.length; c++){
					System.out.println(bx[c].length());
			}
		}
		catch(ArithmeticException exc){
			System.out.println("An Arithmetic exception occured " + exc.getMessage());
		}
		catch(NullPointerException exc){
			System.out.println("Null pointer exception occured " + exc.getMessage());
		}
		catch(Exception exc){
			System.out.println("An exception occured " + exc.getMessage());
		}
		finally{
			System.out.println("finally block always executes");
		}
		
		
		System.out.println("Program execution done");
		
	}
}


/*class ExceptionExample{
	public static void main (String[] args) {
		int a=7;
		int b=0;
		System.out.println("Program start running");
		try{
			System.out.println(a/b);
			System.out.println("No exception");
		}
		catch(ArithmeticException exc){
			System.out.println("Arithmetic Exception has Occured 1");
			System.out.println(exc.getMessage());
			b = 1;
			System.out.println(a/b);
		}
		System.out.println("Program still running");
		
		
		System.out.println("Creating Array");
		int[] ax = new int[4];
		ax[0] = 10;
		ax[1] = 20;
		ax[2] = 30;
		ax[3] = 40;
		System.out.println("Showing Array");
		try{
			for(int c = 0;c < 5;c++){
				System.out.print(ax[c] + " ");
			}
		}
		catch(ArrayIndexOutOfBoundsException exc){
			System.out.println("\nArrayIndexOutOfBounds Exception has Occured " +exc.getMessage());
		}
		//System.out.println();
		System.out.println("\nProgram still running");
		
		
		String[] bx = new String[3];
		bx[0] = "abc";
		bx[1] = null;//"20";
		bx[2] = "xyzw";
		System.out.println("Showing String Array");
		try{
			for(int c = 0;c < bx.length; c++){
				System.out.println(bx[c].length());
			}
		}
		catch(NullPointerException exc){
			System.out.println("\nNull pointer Exception has Occured " +exc.getMessage());
		}
		
		System.out.println("Array operation done");
		
	}
}
*/