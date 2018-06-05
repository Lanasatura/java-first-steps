public interface Series {
	int getNext();        //возвратить следующее по порядку число
	void reset();         //начать всё с самого начала
	void setStart(int x); //задать начальное значение
}