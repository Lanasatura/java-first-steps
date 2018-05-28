class ShortLog {
	public static void main(String args[]) {
		int n, d, q;
		
		n = 10;
		d = 2;
		
		if(d != 0 && (n % d) == 0)
			System.out.println(d + " is a factor of " + n);
		
		d = 0;
		
		if(d != 0 && (n % d) == 0)
			System.out.println(d + " is a factor of " + n); //ошибки нет, но ничего не выведется, т.к. условие не сработало по первому операнду
		
	    if(d != 0 & (n % d) == 0)
		    System.out.println(d + "is a factor of " + n); //ошибка деления на ноль!

	}
}