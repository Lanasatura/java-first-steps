class LToD {
	public static void main(String args[]) {
		long L;
		double D;
		
		L = 100123285L;
		D = L;
		
		System.out.println("L and D: " + L + " and " + D);
		
		//D = 100123285.0;
		//L = D; такое преобразование типов не допустимо!
		
		//System.out.println("L and D: " + L + " and " + D);
	}
}