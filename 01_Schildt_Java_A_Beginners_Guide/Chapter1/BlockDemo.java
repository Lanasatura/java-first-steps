class BlockDemo {
	public static void main(String args[]) {
		double i, j, d;
		
		//i = 5;
		j = 10;
		
		for (i = -1; i <= 2; i++) {
			if (i != 0) {
				System.out.println("i doesn't equal zero");
				d = j / i;
				System.out.println("j / i is " + d);
			}
			if (i == 0) 
				System.out.println("i is equal zero");
		}
		
		
	}
}