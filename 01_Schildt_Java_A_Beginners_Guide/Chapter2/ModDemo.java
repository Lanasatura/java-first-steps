class ModDemo {
	public static void main(String args[]) {
		int iresult, irem;
		double dresult, drem;
		
		iresult = 10 / 3;
		irem = 10 % 3;
		
		System.out.println("Result and reminder of 10 / 3: " + iresult + " and " + irem);
		
		dresult = 10.0 / 3.0;
		drem = 10.0 % 3.0;
		
		System.out.println("Result and reminder of 10.0 / 3.0: " + dresult + " and " + drem);
		
		int a = 10;
		int b = ++a;
		
        System.out.println("a = " + a + "\nb = " + b);
		
		int c = 10;
		int d = c++;
		
		System.out.println("c = " + c + "\nd = " + d);
	}
}