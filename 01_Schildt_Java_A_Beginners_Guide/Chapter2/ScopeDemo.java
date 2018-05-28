class ScopeDemo {
	public static void main(String args[]) {
		int x; //x доступна для всего кода в методе main
		
		x = 10;
		
		if (x == 10) {
			
			int y = 20; //y доступна только в данном кодовом блоке
			// x и y доступны в данном кодовом блоке
			
			System.out.println("x and y: " + x + " " +y);
			
			x = y * 2;			
		}
		
		//y = 100; //Ошибка! y не доступна за пределами области
		
		System.out.println("x is " + x);
	}
} 