class ByThrees implements Series {
	int start;
	int val;
	int prev;
	
	ByThrees() {
		start = 0;
		val = 0;
		prev = -3;
	}
	
	public int getNext() {
		prev = val;
		val += 3;
		return val;
	}
	
	public void reset() {
		start = 0;
		val = 0;
	}
	
	public void setStart(int x) {
		start = x;
		val = x;
		prev = -3;
	}
	
	int getPrevious() {
		return prev;
	}
}


class SeriesDemo2 {
	public static void main(String args[]) {
		ByThrees ob = new ByThrees();
		
		for(int i = 0; i < 7; i++) {
			System.out.println("Next value is " + ob.getNext());
		    System.out.println("Previous value is " + ob.getPrevious());
		}	
		
		System.out.println("\nResetting");
		ob.reset();
		for(int i = 0; i < 7; i++)
			System.out.println("Next value is " + ob.getNext());
		
		System.out.println("\nStarting at 100");
		ob.setStart(100);
		for(int i = 0; i < 7; i++)
			System.out.println("Next value is " + ob.getNext());
	}
}