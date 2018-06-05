//объекты передаются методам по ссылке
class Test {
	int a, b;
	
	Test(int i, int j) {
		a = i;
		b = j;
	}
	
	//передача объекта методу, теперь переменные ob.a и ob.b из передаваемого объекта можно изменять
	void change(Test ob) {
		ob.a = ob.a + ob.b;
		ob.b = -ob.b;
	}
}


class CallByRef {
	public static void main(String args[]) {
		Test ob = new Test(15, 20);
		
		System.out.println("ob.a and ob.b before call: " + ob.a + " " + ob.b);
		
		ob.change(ob);
		System.out.println("ob.a and ob.b after call: " + ob.a + " " + ob.b);
	}
}