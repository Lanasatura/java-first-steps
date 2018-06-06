class UseFinally {
	public static void genException(int what) {
		int t;
		int nums[] = new int[2];
		
		System.out.println("Receiving " + what);
		try {
			switch(what) {
				case 0:
					t = 10 / what; //генерация ошибки деления на ноль
					break;
				case 1:
					nums[4] = 4;   //генерация обращения к массиву
					break;
				case 2:
					return;        //возврат из блока try
			}
		}
		catch (ArithmeticException exc) {
			System.out.println("Can't divide by Zero!");
			return;                //возврат из блока catch
		}
		catch (ArrayIndexOutOfBoundsException exc) {
			System.out.println("No matching element found.");
		}
		finally {
			System.out.println("Leaving try.");
		}
	}
}


class FinallyDemo {
	public static void main(String args[]) {
		
		for(int i = 0; i < 3; i++) {
			UseFinally.genException(i);
			System.out.println();
		}
	}
}