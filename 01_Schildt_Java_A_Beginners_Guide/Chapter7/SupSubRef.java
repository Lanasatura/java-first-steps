//обращение к объекту подкласса по ссылке на объект суперкласса
class X {
	int a;
	
	X(int i) {
		a = i;
	}
}

class Y extends X {
	int b;
	
	Y(int i, int j) {
		super(j);
		b = i;
	}
}


class SupSubRef {
	public static void main(String args[]) {
		X x = new X(10); //x.a = 10
		X x2;
		Y y = new Y(5, 6); //y.b = 5, y.a = 6
		
		x2 = x; //допустимо, т.к. обе переменные одного типа
		System.out.println("x2.a: " + x2.a);
		
		x2 = y; //Y - подкласс X, поэтому переменные x2 и y могут ссылаться на один и тот же объект производного класса
		System.out.println("x2.a: " + x2.a);
		
		x2.a = 19; //в классе X известны только члены класса X
		//x2.b = 27; //ошибка! b не является членом класса X
		
	}
}