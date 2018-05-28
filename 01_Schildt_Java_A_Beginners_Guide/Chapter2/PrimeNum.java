class PrimeNum {
	public static void main(String args[]) {
		double x, r;
		int i, j, count;
		count = 0;
		
		for(i = 2; i < 101; i++) {
			x = i;  //System.out.println("x = " + x);
			r = 1.0;
			
			for(j = 2; (j <= i) && (r != 0.0); j++) {
			    r = x % j;
				//System.out.println("j = " + j);
			    //System.out.println("r = " + r);
				//if((r == 0.0) && (x != j)) System.out.println("x = " + x + " it's not prime number");
				//if((r == 0.0) && (x == j)) System.out.println("x = " + x + " it's prime number");
				
				if((r == 0.0) && (x == j)) {
					System.out.print( ((int) x) + "\t");
					count++;
					
                    if(count == 5) {
				       System.out.println();
				       count = 0;
				    }
				} 
			}
		}
	}
} 