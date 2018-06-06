/*класс, реализующий стек для хранения символов*/
class GenStack<T> implements IGenStack<T> {
	private T s[];           //массив для хранения элементов стека
	private int poploc, pushloc; //индексы размещения и извлечения элементов стека, запрещено произвольное изменение стека
		
	//конструктор, инициализирующий стек данными из символьного массива
	public GenStack(T[] a) {
		poploc = 0;
		pushloc = a.length;
		s = a;
	}
	
	//помещение символа в стек
	public void pop(T obj) throws StackFullException {
		if(poploc == s.length) 
			throw new StackFullException(s.length);
		
		s[poploc] = obj;
		poploc++;
	}
	
	//извлечение символа из стека
	public T push() throws StackEmptyException {
		if(pushloc == 0) 
			throw new StackEmptyException();
		
		pushloc--;
		return s[pushloc];
	}
	
	public int getpoploc() {
		return poploc;
	}
	
	public int getpushloc() {
		return pushloc;
	}	
}
