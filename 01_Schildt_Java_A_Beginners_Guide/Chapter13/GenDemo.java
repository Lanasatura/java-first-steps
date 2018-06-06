//простой обобщённый класс
//T - параметр типа, заменяемый именем подлинного типа при создании объекта класса Gen

//в объявлении этого класса T означает обобщённый тип 
class Gen<T> {
	T ob;       //объявление объекта типа T
	
	Gen(T o) {  //конструктору передаётся ссылка на объект
		ob = o;
	}
	
	T getob() {         //возвратить объект ob
		return ob;
	}
	
	void showType() {   // отобразить тип T
		System.out.println("Type of T is " + ob.getClass().getName());
	}
}


class GenDemo {
	public static void main(String args[]) {
		//создание ссылки на объект типа Gen<Integer>
		Gen<Integer> iOb;
		
		//создать объект типа Gen<Integer> и присвоить ссылку на него переменной iOb
		//автоупаковка значения 88 в объект типа Integer
		iOb = new Gen<Integer>(88);  //получить экземпляр типа Gen<Integer>
		
		iOb.showType();        //отобразить тип данных, используемых в объекте iOb
		
		int v = iOb.getob();   //получить значение из объекта iOb
		System.out.println("value: " + v);
		
		System.out.println();
		
		//создание объекта типа Gen для символьных строк
		//здесь создаётся ссылка и сам объект типа Gen<String>
		Gen<String> strOb = new Gen<String>("Generic Test");
		
		strOb.showType();        //отобразить тип данных, используемых в объекте iOb
		
		String str = strOb.getob();   //получить значение из объекта iOb
		System.out.println("value: " + str);
	}
}