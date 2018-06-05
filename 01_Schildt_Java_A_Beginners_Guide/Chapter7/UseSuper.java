//применение ключевого слова super для предотвращения сокрытия имён
class A {
	int i;
}

class B extends A {
	int i; // эта переменная скрывает переменную i из суперкласса A
	
	B(int a, int b) {
		super.i = a;  //обращение к i из класса A
		i = b;        //обращение к i из класса B
	}
	
	void show() {
		System.out.println("i in superclass: " + super.i);
		System.out.println("i in subclass: " + i);
	}
}


class UseSuper {
	public static void main(String args[]) {
		B subOb = new B(1, 2);
		
		subOb.show();
	}
}