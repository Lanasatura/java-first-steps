class GenStackDemo {
	public static void main(String args[]) {
		Integer iStore[] = new Integer[10];
		GenStack<Integer> s = new GenStack<Integer>(iStore);
		
		Integer iVal;
		
		System.out.println("Demonstrate a stack of Integers.");
		try {
			for(int i = 0; i < 10; i++) {
				System.out.println("Adding " + i + " to the s.");
				s.pop(i);
			}
		}
		catch (StackFullException exc) {
			System.out.println(exc);
		}
		
		System.out.println(s.getpoploc()+ ", " + s.getpushloc());
		
		
		System.out.println();
		
		try {
			for(int i = 0; i < 10; i++) {
				System.out.println("Getting next Integer from s: ");
				iVal = s.push();
				System.out.println(iVal);
			}
		}
		catch (StackEmptyException exc) {
			System.out.println(exc);
		}
		
		System.out.println();
		
		Double dStore[] = new Double[10];
		GenStack<Double> s2 = new GenStack<Double>(dStore);
		
		Double dVal;
		
		System.out.println("Demonstrate a stack of Doubles.");
		try {
			for(int i = 0; i < 10; i++) {
				System.out.println("Adding " + (double)i/2 + " to the s2.");
				s2.pop((double)i/2);
			}
		}
		catch (StackFullException exc) {
			System.out.println(exc);
		}
		
		System.out.println();
		
		try {
			for(int i = 0; i < 10; i++) {
				System.out.println("Getting next Double from s2: ");
				dVal = s2.push();
				System.out.println(dVal);
			}
		}
		catch (StackEmptyException exc) {
			System.out.println(exc);
		}
	}
}