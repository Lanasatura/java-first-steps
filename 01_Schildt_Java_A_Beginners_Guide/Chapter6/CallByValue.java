//простые типы данных передаются методам по значению
class Test {
	
	//этот метод не может изменить значения аргументов, передаваемых ему при вызове
	void noChange(int i, int j) {
		i = i + j;
		j= -j;
	}
}


class CallByValue {
	public static void main(String args[]) {
		Test ob = new Test();
		int a = 15, b = 20;
		
		System.out.println("a and b before call: " + a + " " + b);
		
		ob.noChange(a, b);
		System.out.println("a and b after call: " + a + " " + b);
	}
}