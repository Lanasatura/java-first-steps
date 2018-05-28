/*Демонстрация "сборки мусора" и метода finalize*/

class FDemo {
	int x;
	
	FDemo(int i) {
		x = i;
	}
	
	//метод вызывается при утилизации объекта
	protected void finalize() {
		System.out.println("Finalizing " + x);
	}
	
	//метод формирует объект, который тотчас уничтожается
	void generator(int i) {
		FDemo o = new FDemo(i);
	}
}


class Finalize {
	public static void main(String args[]) {
		int count;
		
		FDemo ob = new FDemo(0);
		
		//формирование большого количества объектов, чтобы начала действовать "сборка мусора" для освобождения оперативной памяти
		for(count = 1; count < 1000000; count++)
			ob.generator(count);
	}
}