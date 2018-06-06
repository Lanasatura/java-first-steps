//класс, реализующий динамически увеличивающуюся кольцевую очередь
class GenDynQueue<T> implements IGenQ<T> {
	private T q[];           //массив для хранения элементов очереди
	private int putloc, getloc; //индексы размещения и извлечения элементов очереди

	public GenDynQueue(T[] aRef) {
		q = aRef;
		putloc = getloc = 0;
	}
	
	//метод помещения символа в очередь
	public void put(T obj) {
		//при переполнении очереди мы увеличиваем вдвое массив
		//if((putloc+1 == getloc) | 
		//   ((putloc == q.length-1) & (getloc == 0))) {
		//	   T t[];
        //      t = new GenDynQueue<?>[q.length * 2];   //увеличить размер очереди
		//	
		//	   for(int i = 0; i < q.length; i++)    //скопировать элементы в новую очередь
		//			t[i] = q[i];
			
		//	   q = t;
		//}
		
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