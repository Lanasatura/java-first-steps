//простой обобщённый класс с двумя переметрами типа: T и V
class TwoGen<T, V> {
	T ob1;       //объявление объекта типа T
	V ob2;       //объявление объекта типа V
	
	TwoGen(T o1, V o2) {  //конструктору передаются ссылки на объекты типов T и V
		ob1 = o1;
		ob2 = o2;
	}
	
	T getob1() {         //возвратить объект ob1
		return ob1;
	}
	
	V getob2() {         //возвратить объект ob2
		return ob2;
	}	
	
	void showType() {   // отобразить типы T и V
		System.out.println("Type of T is " + ob1.getClass().getName());
		System.out.println("Type of V is " + ob2.getClass().getName());
	}
}


class SimpGen {
	public static void main(String args[]) {
		TwoGen<Integer, String> tgObj = new TwoGen<Integer, String>(88, "Generics");		
		
		tgObj.showType();      //отобразить конкретные типы
				
		//получить и отобразить отдельные значения
		int v = tgObj.getob1();   
		System.out.println("value: " + v);
		
		String str = tgObj.getob2();   
		System.out.println("value: " + str);
	}
}