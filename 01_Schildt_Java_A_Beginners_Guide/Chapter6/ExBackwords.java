class Backwords {
	String str;
	
	Backwords(String s) {
		str = s;
	}
	
	void backword(int idx) {
		if(idx != str.length()-1)
			backword(idx+1);
		
		System.out.print(str.charAt(idx));
	}
}


class ExBackwords {
	public static void main(String args[]) {
		Backwords ob = new Backwords("This is sick!");
		
		ob.backword(0);
	}
}