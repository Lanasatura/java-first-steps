class Gen<T> {
	T ob;
	
	Gen(T o) {
		ob = o;
	}
	
	T getob() {
		return ob;
	}
}


class RawDemo {
	public static void main(String args[]) {
		Gen<Integer> iOb = new Gen<Integer>(88);
		
		Gen<String> strOb = new Gen<String>("Generics Test");
		
		//если аргумент типа не передаётся, создаётся базовый тип
		Gen raw = new Gen(new Double(98.6));
		
		//здесь требуется приведение типов, так как тип неизвестен
		double d = (Double) raw.getob();
		System.out.println("value: " + d);
			
	}
}