/*класс, реализующий очередь для хранения символов*/
class Queue {
	private char q[];           //массив для хранения элементов очереди
	private int qi[];           //массив для хранения очереди целочисленных значений
	private int putloc, getloc; //индексы размещения и извлечения элементов очереди, запрещено произвольное изменение очереди
	
	//конструктор, строящий пустую очередь заданного размера
	Queue (int size) {
		q = new char[size+1];  //выделение памяти для очереди, размер массива должен быть на единицу больше размера очереди
		qi = new int[size+1];
		putloc = getloc = 0;
	}
	
	//конструктор, строящий один объект типа Queue на основании другого
	Queue (Queue ob) {
		putloc = ob.putloc;
		getloc = ob.getloc;
		q = new char[ob.q.length];
		
		//копирование элементов очереди
		for(int i = getloc+1; i <= putloc; i++)
			q[i] = ob.q[i];
	}
	
	//конструктор, инициализирующий очередь данными из символьного массива
	Queue(char a[]) {
		putloc = getloc = 0;
		q = new char[a.length+1];
		
		for(int i = 0; i < a.length; i++)
			put(a[i]);
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

class QDemo2 {
	public static void main(String args[]) {
		//построить пустую очередь для хранения 10 символов
		Queue q1 = new Queue(10);
		char name[] = {'T', 'o', 'm'};
		//построить очередь из массива
		Queue q2 = new Queue(name);
		
		char ch;
		int i;
		
		//поместить ряд символов в очередь q1
		for(i = 0; i < 10; i++)
			q1.put((char) ('A' + i));
		
		//построить одну очередь из другой
		Queue q3 = new Queue(q1);
		
		//показать очереди
		System.out.print("Contents of q1: ");
		for(i = 0; i < 10; i++) {
			ch = q1.get();
			System.out.print(ch);
		}
		
		System.out.println("\n");
		
		System.out.print("Contents of q2: ");
		for(i = 0; i < 3; i++) {
			ch = q2.get();
			System.out.print(ch);
		}
		
		System.out.println("\n");
		
		System.out.print("Contents of q3: ");
		for(i = 0; i < 10; i++) {
			ch = q3.get();
			System.out.print(ch);
		}
	}
}