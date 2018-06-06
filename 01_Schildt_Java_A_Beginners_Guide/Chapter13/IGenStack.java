public interface IGenStack<T> {
	void pop(T obj) throws StackFullException;
	
	T push() throws StackEmptyException;
}