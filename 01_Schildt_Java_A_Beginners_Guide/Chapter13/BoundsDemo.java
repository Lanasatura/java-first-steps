//аргументом типа, заменяющим параметр типа T должен стать суперкласс Number или производный от него подкласс
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
}


class BoundsDemo {
	public static void main(String args[]) {
		NumericFns<Integer> iOb = new NumericFns<Integer>(5);
		
		System.out.println("Reciprocal of iOb is " + iOb.reciprocal());
		System.out.println("Fractional component of iOb is " + iOb.fraction());
		System.out.println();
		
		NumericFns<Double> dOb = new NumericFns<Double>(5.25);
		
		System.out.println("Reciprocal of dOb is " + dOb.reciprocal());
		System.out.println("Fractional component of dOb is " + dOb.fraction());
		System.out.println();		
	}
}