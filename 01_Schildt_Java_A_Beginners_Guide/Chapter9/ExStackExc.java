class StackFullException extends Exception {
	int size;
	
	StackFullException(int s) {
		size = s;
	}
	
	public String toString() {
		return "\nStack is full. The length of stack is " + size;
	}
}

class StackEmptyException extends Exception {
	public String toString() {
		return "\nStack is empty.";
	}	
}


/*класс, реализующий стек для хранения символов*/
class Stack {
	private char s[];           //массив для хранения элементов стека
	private int poploc, pushloc; //индексы размещения и извлечения элементов стека, запрещено произвольное изменение стека
	
	//конструктор, строящий пустой стек заданного размера
	Stack(int size) {
		s = new char[size];  //выделение памяти для стека, размер массива должен быть на единицу больше размера стека
		poploc = 0;
		pushloc = size;
	}
	
	//конструктор, строящий один объект типа Stack на основании другого
	Stack(Stack ob) {
		poploc = ob.poploc;
		pushloc = ob.pushloc;
		s = new char[ob.s.length];
		
	//копирование элементов стека
		for(int i = 0; i < poploc; i++)
			s[i] = ob.s[i];
	}
	
	//конструктор, инициализирующий стек данными из символьного массива
	Stack(char a[]) {
		poploc = 0;
		pushloc = a.length;
		s = new char[a.length];
		
		try {
		    for(int i = 0; i < a.length; i++)
			pop(a[i]);
		}
		catch (StackFullException exc) {
			System.out.println(exc);
		}
	}
	
	//помещение символа в стек
	void pop(char ch) throws StackFullException {
		if(poploc == s.length) 
			throw new StackFullException(s.length);
		
		s[poploc] = ch;
		poploc++;
	}
	
	//извлечение символа из стека
	char push() throws StackEmptyException {
		if(pushloc == 0) 
			throw new StackEmptyException();
		
		pushloc--;
		return s[pushloc];
	}	
}

class ExStackExc {
	public static void main(String args[]) {
		//построить пустой стек для хранения 10 символов
		Stack s = new Stack(10);
		int i;
		char ch;
		
		//поместить ряд символов в стек s
		try {
			for(i = 0; i < 11; i++) {
				s.pop((char) ('A' + i));
				System.out.print((char)('A' + i));
			}
		}
		catch (StackFullException exc) {
			System.out.println(exc);
		}

		
    	//показать стек
		System.out.print("Contents of s: ");
		try {
			for(i = 0; i < 11; i++) {
				ch = s.push();
			    System.out.print(ch);
		    }
		}
		catch (StackEmptyException exc) {
			System.out.println(exc);
		}
		
		System.out.println("\n");
	}
}