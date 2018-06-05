package qpack;

//класс, реализующий кольцевую очередь
public class CircularQueue implements ICharQ {
	private char q[];           //массив для хранения элементов очереди
	private int putloc, getloc; //индексы размещения и извлечения элементов очереди

	//конструктор, создающий пустую очередь заданного размера
	public CircularQueue(int size) {
		q = new char[size+1];
		putloc = getloc = 0;
	}
	
	//метод помещения символа в очередь
	public void put(char ch) {
		//очередь считается полной, если индекс putloc на единицу меньше getloc
		//или если индекс putloc указывает на конец массива, а getloc - на его начало
		if((putloc+1 == getloc) | 
		   ((putloc == q.length-1) & (getloc == 0))) {
			System.out.println(" - Queue is full.");
			return;
		}
		
		putloc++;
		if(putloc == q.length) putloc = 0; //перейти в начало массива
		q[putloc] = ch;
	}
	
	//метод извлечения символа из очереди
	public char get() {
		if(getloc == putloc) {
			System.out.println(" - Queue is empty.");
			return (char) 0;
		}
		
		getloc++;
		if(getloc == q.length) getloc = 0; //перейти в начало массива
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