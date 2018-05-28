class PromDemo {
	public static void main(String args[]) {
		byte b;
		int i;
		char ch1 = 'a', ch2 = 'b';
		
		b = 10;
		i = b * b; //оба операнда типа byte сначала продвигаются к int
		
		b = 10;
		b = (byte) (b * b);
		
		System.out.println("i and b: " + i + " and " + b);
		
		ch1 = (char) (ch1 + ch2); //оба операнда типа char сначала продвигаются к int
		System.out.println("ch1: " + ch1);
		
	}
}