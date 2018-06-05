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
		
		for(int i = 0; i < a.length; i++)
			pop(a[i]);
	}
	
	//помещение символа в стек
	void pop(char ch) {
		if(poploc == s.length) {
			System.out.println(" - Stack is full.");
			return;
		}
		
		s[poploc] = ch;
		poploc++;
	}
	
	//извлечение символа из стека
	char push() {
		if(pushloc == 0) {
			System.out.println(" - Stack is empty.");
			return (char) 0;
		}
		
		pushloc--;
		return s[pushloc];
	}	
}

class ExSDemo {
	public static void main(String args[]) {
		//построить пустой стек для хранения 10 символов
		Stack s1 = new Stack(10);
		char name[] = {'T', 'o', 'm'};
		//построить стек из массива
		Stack s2 = new Stack(name);
		
		char ch;
		int i;
		
		//поместить ряд символов в стек s1
		for(i = 0; i < 10; i++)
			s1.pop((char) ('A' + i));
		
		//построить одну стек из другой
		Stack s3 = new Stack(s1);		
	
    	//показать стеки
		System.out.print("Contents of s1: ");
		for(i = 0; i < 10; i++) {
			ch = s1.push();
			System.out.print(ch);
		}
		
		System.out.println("\n");
		
		System.out.print("Contents of s2: ");
		for(i = 0; i < 3; i++) {
			ch = s2.push();
			System.out.print(ch);
		}
		
		System.out.println("\n");
		
		System.out.print("Contents of s3: ");
		for(i = 0; i < 10; i++) {
			ch = s3.push();
			System.out.print(ch);
		}
	}
}