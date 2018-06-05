//применение интерфейсных ссылок
class ByTwos implements Series {
	int start;
	int val;
	int prev;
	
	ByTwos() {
		start = 0;
		val = 0;
		prev = -2;
	}
	
	public int getNext() {
		prev = val;
		val += 2;
		return val;
	}
	
	public void reset() {
		start = 0;
		val = 0;
	}
	
	public void setStart(int x) {
		start = x;
		val = x;
		prev = -2;
	}
	
	int getPrevious() {
		return prev;
	}
}

class ByThrees implements Series {
	int start;
	int val;
	int prev;
	
	ByThrees() {
		start = 0;
		val = 0;
		prev = -3;
	}
	
	public int getNext() {
		prev = val;
		val += 3;
		return val;
	}
	
	public void reset() {
		start = 0;
		val = 0;
	}
	
	public void setStart(int x) {
		start = x;
		val = x;
		prev = -3;
	}
	
	int getPrevious() {
		return prev;
	}
}


class SeriesDemo3 {
	public static void main(String args[]) {
		ByTwos twoOb = new ByTwos();
		ByThrees threeOb = new ByThrees();
		Series ob;  //переменная ob - ссылка на интерфейс Series
		            //в данной переменной может храниться ссылка на любой объект, реализующий интерфейс Series
		
		for(int i = 0; i < 5; i++) {
			ob = twoOb;
			System.out.println("Next ByTwos value is " + ob.getNext());  // обращение к объекту по интерфейсной ссылке
			
			ob = threeOb;
			System.out.println("Next ByThrees value is " + ob.getNext());  // обращение к объекту по интерфейсной ссылке
		}
	}
}