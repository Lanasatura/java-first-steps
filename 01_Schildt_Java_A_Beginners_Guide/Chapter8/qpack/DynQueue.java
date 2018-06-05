package qpack;

//класс, реализующий динамически увеличивающуюся кольцевую очередь
public class DynQueue implements ICharQ {
	private char q[];           //массив для хранения элементов очереди
	private int putloc, getloc; //индексы размещения и извлечения элементов очереди

	//конструктор, создающий пустую очередь заданного размера
	public DynQueue(int size) {
		q = new char[size+1];
		putloc = getloc = 0;
	}
	
	//метод помещения символа в очередь
	public void put(char ch) {
		//при переполнении очереди мы увеличиваем вдвое массив
		if((putloc+1 == getloc) | 
		   ((putloc == q.length-1) & (getloc == 0))) {
			   char t[] = new char[q.length * 2];   //увеличить размер очереди
			
			   for(int i = 0; i < q.length; i++)    //скопировать элементы в новую очередь
					t[i] = q[i];
			
			   q = t;
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
	
	//метод, копирующий содержимое очереди ob2 в очередь ob1
	static void copy(DynQueue ob1, DynQueue ob2) {
		if(ob1.q.length != ob2.q.length)
			System.out.println("Sizes of two objects are different!");
		else {		
		    for(int i = 0; i < ob1.q.length; i++)
				ob1.q[i] = ob2.q[i];
			
		    ob1.putloc = ob2.putloc;
		    ob1.getloc = ob2.getloc;
		}
	}
	
	int getLength() {
		return q.length;
	}
}