//перегрузка метода с аргументами переменной длины
class VarArgs3 {
	
	//первый вариант метода vaTest()
	static void vaTest(int ... v) {
		System.out.println("vaTest(int ... v): " + "Number of args: " + v.length);
		System.out.println("Contents: ");
		
		for(int i = 0; i < v.length; i++)
			System.out.println(" arg " + i + ": " + v[i]);
		
		System.out.println();
	}
	
	//второй вариант метода vaTest()
	static void vaTest(boolean ... v) {
		System.out.println("vaTest(boolean ... v): " + "Number of args: " + v.length);
		System.out.println("Contents: ");
		
		for(int i = 0; i < v.length; i++)
			System.out.println(" arg " + i + ": " + v[i]);
		
		System.out.println();
	}
	
	//третий вариант метода vaTest()
	static void vaTest(String msg, int ... v) {
		System.out.println("vaTest(String msg, int ... v): " + msg + v.length);
		System.out.println("Contents: ");
		
		for(int i = 0; i < v.length; i++)
			System.out.println(" arg " + i + ": " + v[i]);
		
		System.out.println();
	}
	
	public static void main(String args[]) {
		vaTest(1, 2, 3);
		vaTest("Testing: ", 10, 20);
		vaTest(true, false, false);
	}
}