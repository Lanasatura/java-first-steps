class MyClass {
	int x;
	
	//параметризованный конструктор
	MyClass(int i) {
		x = i;
	}
}

class ParmConsDemo {
	public static void main(String args[]) {
		MyClass t1 = new MyClass(10);
		MyClass t2 = new MyClass(88);
		
		System.out.println(t1.x + " and " + t2.x);
	}
}