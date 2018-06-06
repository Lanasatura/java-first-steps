public interface ICharQ {
	void put(char ch) throws QueueFullException;  //помещение символа в очередь
	char get() throws QueueEmptyException;        //извлечение символа из очереди
	void reset();                                 //вернуть очередь в исходное состояние
}