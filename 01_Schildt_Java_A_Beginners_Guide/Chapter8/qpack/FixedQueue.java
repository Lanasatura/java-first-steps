package qpack;

//класс, реализующий очередь фиксированного размера для хранения символов
public class FixedQueue implements ICharQ {
	private char q[];           //массив для хранения элементов очереди
	private int putloc, getloc; //индексы размещения и извлечения элементов очереди
	
	//конструктор, создающий пустую очередь заданного размера
	public FixedQueue(int size) {
		q = new char[size+1];
		putloc = getloc = 0;
	}
	
	//метод помещения символа в очередь
	public void put(char ch) {
		if(putloc == q.length-1) {
			System.out.println(" - Queue is full.");
			return;
		}
		
		putloc++;
		q[putloc] = ch;
	}
	
	//метод извлечения символа из очереди
	public char get() {
		if(getloc == putloc) {
			System.out.println(" - Queue is empty.");
			return (char) 0;
		}
		
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



