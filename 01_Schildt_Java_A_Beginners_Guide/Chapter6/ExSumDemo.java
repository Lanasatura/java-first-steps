class Summation{
	static int sum;
	
	static int getSum(int ... v) {
		sum = 0;
		for(int i = 0; i < v.length; i++)
			sum += v[i];
		return sum;
	}
	
}


class ExSumDemo {
	public static void main(String args[]) {
		System.out.println(Summation.getSum(0));
		System.out.println(Summation.getSum(5, 7, 1));
		System.out.println(Summation.getSum(6, 6));
		System.out.println(Summation.getSum(1, 2, 3, 4, 5));
	}
}

