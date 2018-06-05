class FailSoftArray {
	private int a[];    //ссылка на массив
	private int errval; //значение в случае ошибки в методе get()
	public int length;  //открытая переменная
	
	//конструктору передаётся размер массива и значение в случае ошибки в методе get()
	public FailSoftArray(int size, int errv) {
		a = new int[size];
		errval = errv;
		length = size;
	}
	
	//возвращение значения элемента массива по заданному индексу
	public int get(int index) {
		if(ok(index)) return a[index];
		return errval;
	}
	
	//установка значения элемента по заданному индексу
	//в случае ошибки возвращается false
	public boolean put(int index, int val) {
		if(ok(index)) {
			a[index] = val;
			return true;
		}
		return false;
	}
	
	//проверка обращения за границы массива
	private boolean ok(int index) {
		if((index >= 0) & (index < length)) return true;
		return false;
	}
}


class FSDemo {
	public static void main(String args[]) {
		FailSoftArray fs = new FailSoftArray(5, -1);
		int x;
		
		//выявление скрытых сбоев при обращении к массиву
		System.out.println("Fail quietly.");
		for(int i = 0; i < (fs.length * 2); i++)
			fs.put(i, i*10);
		
		for(int i = 0; i < (fs.length * 2); i++) {
			x = fs.get(i);			
			if(x != -1) System.out.print(x + " ");
		}
		System.out.println("");
		
		//обработка сбоев и вывод ошибок
		System.out.println("\nFail with error reports.");
		for(int i = 0; i < (fs.length * 2); i++)
			if(!fs.put(i, i*10))
				System.out.println("Index " + i + " out-of-bounds");
		
		for(int i = 0; i < (fs.length * 2); i++) {
			x = fs.get(i);
			if(x != -1) System.out.print(x + " ");
			else System.out.println("Index " + i + " out-of-bounds");
		}
	}
}