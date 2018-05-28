class SideEffects {
	public static void main(String args[]) {
		int i;
		
		i = 0;
		
		if(false & (++i < 100))
			System.out.println("this won't be displayed");
		    System.out.println("i = " + i); //i всё равно инкрементируется
			
		if(false && (++i < 100))
			System.out.println("this won't be displayed");
		    System.out.println("i = " + i); //i не инкрементируется
	}
}