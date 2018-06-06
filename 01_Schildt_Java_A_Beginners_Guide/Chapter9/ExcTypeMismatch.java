class ExcTypeMismatch {
	public static void main(String args[]) {
		int nums[] = new int[4];
		
		try {
			System.out.println("Before exception is generated.");
			
			nums[7] = 10;
			System.out.println("This won't be displayed");
		}
		catch (ArithmeticException exc) {
			System.out.println("Index is out of bounds!");
		}
		
		System.out.println("After catch statement.");
	}
}