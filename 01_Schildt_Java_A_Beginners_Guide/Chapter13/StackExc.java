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
