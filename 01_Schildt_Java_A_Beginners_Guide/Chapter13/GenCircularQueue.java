//класс, реализующий кольцевую очередь
class GenCircularQueue<T> implements IGenQ<T> {
	private T q[];           //массив для хранения элементов очереди
	private int putloc, getloc; //индексы размещения и извлечения элементов очереди
	
	public GenCircularQueue(T[] aRef) {
		q = aRef;
		putloc = getloc = 0;
	}
	
	//метод помещения символа в очередь
	public void put(T obj) throws QueueFullException {
		//очередь считается полной, если индекс putloc на единицу меньше getloc
		//или если индекс putloc указывает на конец массива, а getloc - на его начало
		if((putloc+1 == getloc) | 
		   ((putloc == q.length-1) & (getloc == 0)))
		   throw new QueueFullException(q.length-1);
		
		putloc++;
		if(putloc == q.length) putloc = 0; //перейти в начало массива
		q[putloc] = obj;
	}
	
	//метод извлечения символа из очереди
	public T get() throws QueueEmptyException {
		if(getloc == putloc)
			throw new QueueEmptyException();
		
		getloc++;
		if(getloc == q.length) getloc = 0; //перейти в начало массива
		return q[getloc];
	}
}