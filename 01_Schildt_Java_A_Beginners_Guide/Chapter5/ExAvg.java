class ExAvg {
	public static void main(String args[]) {
		double x[] = {15, 23.5, 7, 8, 1, -9, 6.5, 123.8, 8, -1};
		double sum, avg;
		
		sum = 0;
		for(int i = 0; i < x.length; i++)
			sum += x[i];
		
		avg = sum / x.length;
		System.out.println("sum = " + sum + " , avg = " + avg);
	}
}