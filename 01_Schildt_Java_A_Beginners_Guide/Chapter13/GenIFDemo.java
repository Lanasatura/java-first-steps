//обобщённый интерфейс
//в этом интерфейсе подразумевается, что реализующий его класс содержит одно или несколько значений
interface Containment<T> {
	boolean contains(T o);  //метод проверяет, содержится ли некоторый элемент в объекте класса, реализующего интерфейс
}

//любой класс, реализующий обобщённый интерфейс должен быть обобщённым
class MyClass<T> implements Containment<T> {
	T[] arrayRef;
	
	MyClass(T[] o) {
		arrayRef = o;
	}
	
	public boolean contains(T o) {
		for(T x: arrayRef)
			if(x.equals(o)) return true;
		return false;
	}
}


class GenIFDemo {
	public static void main(String args[]) {
		Integer x[] = {1, 2, 3};
		
		MyClass<Integer> ob = new MyClass<Integer>(x);
		
		if(ob.contains(2))
			System.out.println("2 is in ob");
		else
			System.out.println("2 is not in ob");
		
		if(ob.contains(5))
			System.out.println("5 is in ob");
		else
			System.out.println("5 is not in ob");		
	}	
}