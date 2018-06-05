//перегрузка методов
class A {
	int i, j;
	
	A(int a, int b) {
		i = a;
		j = b;
	}
	
	void show() {
		System.out.println("i and j: " + i + " " + j);
	}
}

class B extends A {
	int k;
	
	B(int a, int b, int c) {
		super(a, b);
		k = c;
	}
	
	//сигнатуры данного метода и метода show() из суперкласса A отличаются,
	//поэтому вместо переопределения происходит перегрузка метода
	void show(String msg) {
		System.out.println(msg + k);
	}	
}


class Overload {
	public static void main(String args[]) {
		B subOb = new B(1, 2, 3);
		
		subOb.show("This is k: "); //вызывается метод show() из класса B
		subOb.show();              //вызывается метод show() из класса A
	}
}
