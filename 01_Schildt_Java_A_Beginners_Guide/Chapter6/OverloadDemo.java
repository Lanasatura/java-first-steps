//перегрузка методов
class Overload {
	//первый вариант метода
	void ovlDemo() {
		System.out.println("No parameters");
	}
	
	//второй вариант метода
	//перегрузить метод ovlDemo с одним параметром типа int
	void ovlDemo(int a) {
		System.out.println("One parameter: " + a);
	}
	
	//третий вариант метода
	//перегрузить метод ovlDemo с двумя параметрами типа int
	int ovlDemo(int a, int b) {
		System.out.println("Two parameters: " + a + " " + b);
		return a + b;
	}
	
	//четвёртый вариант метода
	//перегрузить метод ovlDemo с двумя параметрами типа double
	double ovlDemo(double a, double b) {
		System.out.println("Two double parameters: " + a + " " + b);
		return a + b;
	}
}


class OverloadDemo {
	public static void main(String args[]) {
		Overload ob = new Overload();
		int resI;
		double resD;
		
		//вызвать все варианты метода ovlDemo()
		ob.ovlDemo();
		System.out.println();
		
		ob.ovlDemo(2);
		System.out.println();
		
		resI = ob.ovlDemo(4, 6);
		System.out.println("Result of ob.ovlDemo(4, 6): " + resI);
		System.out.println();
		
		resD = ob.ovlDemo(1.1, 2.32);
		System.out.println("Result of ob.ovlDemo(1.1, 2.32): " + resD);
	}
}