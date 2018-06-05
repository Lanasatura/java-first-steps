class MyClass {
	private int alpha;  //закрытый доступ
	public int beta;    //открытый доступ
	int gamma;          //по умолчанию (по сути открытый)
	
	void setAlpha(int a) {
		alpha = a;
	}
	
	int getAlpha() {
		return alpha;
	}
}

class AccessDemo {
	public static void main(String args[]) {
		MyClass ob = new MyClass();
		
		//доступ к alpha только с помощью методов того же класса MyClass
		ob.setAlpha(-99);
		System.out.println("ob.alpha is " + ob.getAlpha());
		
		//так обращаться нельзя! alpha - закрытая переменная
		//ob.alpha = 10;
		
		//beta и gamma - открытые переменные
		ob.beta = 88;
		ob.gamma = 99;
	}
}