class LogicalOpTable {
	public static void main(String args[]) {
		boolean p, q;
		byte c1, c2, c3, c4, c5, c6;
		//byte f = 0;
		//byte t = 1;
		
		System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");
		
		p = true; q = true;
		System.out.print(p + "\t" + q + "\t");
		System.out.print((p&q) + "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + (!p));
		
		p = true; q = false;
		System.out.print(p + "\t" + q + "\t");
		System.out.print((p&q) + "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + (!p));
		
		p = false; q = true;
		System.out.print(p + "\t" + q + "\t");
		System.out.print((p&q) + "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + (!p));
		
		p = false; q = false;
		System.out.print(p + "\t" + q + "\t");
		System.out.print((p&q) + "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + (!p));
		System.out.println();
		
		
		System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");

		p = true; q = true;
 		if (p) c1 = 1; else c1 = 0;
		if (q) c2 = 1; else c2 = 0;
		if (p&q) c3 = 1; else c3 = 0;
		if (p|q) c4 = 1; else c4 = 0;
		if (p^q) c5 = 1; else c5 = 0;
		if (!p) c6 = 1; else c6 = 0;
		System.out.println(c1 + "\t" + c2 + "\t" + c3 + "\t" + c4 + "\t" + c5 + "\t" + c6);

		p = true; q = false;
 		if (p) c1 = 1; else c1 = 0;
		if (q) c2 = 1; else c2 = 0;
		if (p&q) c3 = 1; else c3 = 0;
		if (p|q) c4 = 1; else c4 = 0;
		if (p^q) c5 = 1; else c5 = 0;
		if (!p) c6 = 1; else c6 = 0;
		System.out.println(c1 + "\t" + c2 + "\t" + c3 + "\t" + c4 + "\t" + c5 + "\t" + c6);

		p = false; q = true;
 		if (p) c1 = 1; else c1 = 0;
		if (q) c2 = 1; else c2 = 0;
		if (p&q) c3 = 1; else c3 = 0;
		if (p|q) c4 = 1; else c4 = 0;
		if (p^q) c5 = 1; else c5 = 0;
		if (!p) c6 = 1; else c6 = 0;
		System.out.println(c1 + "\t" + c2 + "\t" + c3 + "\t" + c4 + "\t" + c5 + "\t" + c6);

		p = false; q = false;
 		if (p) c1 = 1; else c1 = 0;
		if (q) c2 = 1; else c2 = 0;
		if (p&q) c3 = 1; else c3 = 0;
		if (p|q) c4 = 1; else c4 = 0;
		if (p^q) c5 = 1; else c5 = 0;
		if (!p) c6 = 1; else c6 = 0;
		System.out.println(c1 + "\t" + c2 + "\t" + c3 + "\t" + c4 + "\t" + c5 + "\t" + c6);
	}
}