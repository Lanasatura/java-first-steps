//добавление обработчиков исключений в класс очереди
class QueueFullException extends Exception {
	int size;
	
	QueueFullException(int s) {
		size = s;
	}
	
	public String toString() {
		return "\n Queue is full. Maximum size is " + size;
	}
}

class QueueEmptyException extends Exception {
	public String toString() {
		return "\n Queue is empty.";
	}
}


//класс, реализующий очередь фиксированного размера для хранения символов
class FixedQueue implements ICharQ {
	private char q[];           //массив для хранения элементов очереди
	private int putloc, getloc; //индексы размещения и извлечения элементов очереди
	
	//конструктор, создающий пустую очередь заданного размера
	public FixedQueue(int size) {
		q = new char[size+1];
		putloc = getloc = 0;
	}
	
	//метод помещения символа в очередь
	public void put(char ch) throws QueueFullException {
		
		if(putloc == q.length-1)
			throw new QueueFullException(q.length-1);
		
		putloc++;
		q[putloc] = ch;
	}
	
	//метод извлечения символа из очереди
	public char get() throws QueueEmptyException {
		
		if(getloc == putloc)
			throw new QueueEmptyException();
		
		getloc++;
		return q[getloc];
	}
	
	//метод, устанавливающий очередь в исходное состояние
	public void reset() {
		putloc = 0;
		getloc = 0;
	    char t[] = new char[q.length-1];   //создать пустую очередь			
		q = t;
	}
}

class QExcDemo {
	public static void main(String args[]) {
		FixedQueue q = new FixedQueue(10);
		char ch;
		int i;
				
		try {
			for(i = 0; i < 11; i++) {
				System.out.print("Attempting to store: " + (char) ('A' + i));
				q.put((char) ('A' + i));
				System.out.println(" - OK");
			}
			System.out.println();
		}
		catch (QueueFullException exc) {
			System.out.println(exc);
		}
		System.out.println();
		
		try {
			for(i = 0; i < 11; i++) {
				System.out.print("Getting next char: ");
				ch = q.get();
				System.out.println(ch);
			}
		}
		catch (QueueEmptyException exc) {
			System.out.println(exc);
		}
	}
}


