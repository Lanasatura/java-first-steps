/*класс, реализующий очередь для хранения символов*/
class Queue {
	private char q[];           //массив для хранения элементов очереди
	private int qi[];           //массив для хранения очереди целочисленных значений
	private int putloc, getloc; //индексы размещения и извлечения элементов очереди, запрещено произвольное изменение очереди
	
	Queue (int size) {
		q = new char[size+1];  //выделение памяти для очереди, размер массива должен быть на единицу больше размера очереди
		qi = new int[size+1];
		putloc = getloc = 0;
	}
	
	//помещение символа в очередь
	void put(char ch) {
		if(putloc == q.length-1) {
			System.out.println(" - Queue is full.");
			return;
		}
		
		putloc++;
		q[putloc] = ch;
	}
	
	//извлечение символа из очереди
	char get() {
		if(getloc == putloc) {
			System.out.println(" - Queue is empty.");
			return (char) 0;
		}
		
		getloc++;
		return q[getloc];
	}
	
		
	//помещение числа в очередь
	void puti(int x) {
		if(putloc == q.length-1) {
			System.out.println(" - Queue is full.");
			return;
		}
		
		putloc++;
		qi[putloc] = x;
	}
	
	//извлечение числа из очереди
	int geti() {
		if(getloc == putloc) {
			System.out.println(" - Queue is empty.");
			return (char) 0;
		}
		
		getloc++;
		return qi[getloc];
	}	
}

class QDemo {
	public static void main(String args[]) {
		Queue bigQ = new Queue(100);
		Queue smallQ = new Queue(4);
		char ch;
		int i, y;
		Queue intQ = new Queue(11);
		
		System.out.println("Using bigQ to store the alphabet.");
		
		//помещение буквенных символов в очередь bigQ
		for(i = 0; i < 26; i++)
			bigQ.put((char) ('A' + i));
		
		//извлечение и отображение буквенных символов из очереди bigQ
		System.out.print("Contents of bigQ: ");
		for(i = 0; i < 26; i++) {
			ch = bigQ.get();
			if(ch != (char) 0) System.out.print(ch);
		}
		
		System.out.println("\n");
		
		System.out.println("Using smallQ to generate errors.");
		
		//использование очереди smallQ для генерации ошибок
		for(i = 0; i < 5; i++) {
			System.out.print("Attempting to store " + (char) ('Z' - i));
			smallQ.put((char) ('Z' - i));
			System.out.println();
		}
		System.out.println();
		
		//дополнительные ошибки при обращении к очереди smallQ
		System.out.print("Contents of smallQ: ");
		for(i = 0; i < 5; i++) {
			ch = smallQ.get();
			if(ch != (char) 0) System.out.print(ch);
		}
		System.out.println();
		
		//помещение числа в очередь intQ
		for(i = 0; i < 11; i++)
			intQ.puti(i);
		
		//извлечение и отображение чисел из очереди intQ
		System.out.print("Contents of intQ: ");
		for(i = 0; i < 11; i++) {
			y = intQ.geti();
			System.out.print(y);
		}
	}
}