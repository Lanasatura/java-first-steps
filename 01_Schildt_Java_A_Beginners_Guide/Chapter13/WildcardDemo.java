//применение метасимвольного аргумента
class NumericFns<T extends Number> {
	T num;
	
	//передать конструктору ссылку на числовой объект
	NumericFns(T n) {
		num = n;
	}
	
	//возвратить обратную величину
	double reciprocal() {
		return 1 / num.doubleValue();
	}
	
	//возвратить дробную часть
	double fraction() {
		return num.doubleValue() - num.intValue();
	}
	
	//определить равенство абсолютных значений в двух объектах
	boolean absEqual(NumericFns<?> ob) {
		if(Math.abs(num.doubleValue()) == Math.abs(ob.num.doubleValue()))
			return true;
		return false;
	}	
}


class WildcardDemo {
	public static void main(String args[]) {
		NumericFns<Integer> iOb = new NumericFns<Integer>(6);
		NumericFns<Double> dOb = new NumericFns<Double>(-6.0);
		NumericFns<Long> lOb = new NumericFns<Long>(5L);
		
		System.out.println("Testing iOb and dOb");
		
		if(iOb.absEqual(dOb))
			System.out.println("Absolute values are equal.");
		else
			System.out.println("Absolute values differ.");
		
		System.out.println();
		
		System.out.println("Testing iOb and lOb");
		
		if(iOb.absEqual(lOb))
			System.out.println("Absolute values are equal.");
		else
			System.out.println("Absolute values differ.");		
	}
}